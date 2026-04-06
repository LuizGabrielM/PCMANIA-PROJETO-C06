package service;
import java.util.Scanner;
public class ProcessarPedido {

    Computador[] computador;
    Cliente cliente;

//    ------------------------------------- variaveis utilizadas no metodo menuOpcoes--------------------------
    Scanner scanner = new Scanner(System.in);
    boolean rodarCodigo = true;
    float totalCompra = 0;
    int totalPedidos =0; // pedido mínimo 2
//-------------------------------------------------------------------------------------

    public ProcessarPedido(Computador[] computador, Cliente cliente) {
        this.computador = computador;
        this.cliente = cliente;
    } // construtor para receber os objetos e ser utilizado na classe ProcessarPedido realizando o que for necessário

    public void mostrarOpcoes() {
        System.out.println(" ");
        System.out.println("ESCOLHA [ 0 ] PARA SAIR DE NOSSA LOJA ");
        System.out.println("ESCOLHA [ 1 ] PARA VIZUALIZAR NOSSAS PROMOÇÕES");
        System.out.println("ESCOLHA [ 2 ] PARA REALIZAR SEU PEDIDO");
        System.out.println("ESCOLHA [ 3 ] VIZUALIZAR TOTAL DA COMPRA E FINALIZAR SEU PEDIDO");

    }

    public void helper(){
        System.out.println(" VALOR TOTAL DA COMPRA = " + cliente.getValor());
        System.out.println("PEDIDO ENVIADO");
    }



    public void menuOpcoes() {

        while (rodarCodigo) { // controle de execução do programa

            mostrarOpcoes();

            int escolha = scanner.nextInt();
            switch (escolha) { // escolha das opções do cliente de acordo com a função mostrarOpcoes

                case 0:

                    System.out.println("Obrigado Volte sempre");
                    rodarCodigo = false;
                    break;

                case 1:
                    System.out.println(" Configuração dos Computadores em promoções");// eixbir os computadores
                    for (int i = 0; i < computador.length; i++) {
                        System.out.println("Promocão " + "[" + (i + 1) + "]");
                        computador[i].mostraPCConfigs();
                        System.out.println();
                    }
                    break;

                case 2:
                    //----------------------------------CASE 2 BEGIN-----------------------------------------------------------------------------------
                    System.out.println("Qual Computador deseja comprar ?");
                    System.out.println("[1] - APPLE");
                    System.out.println("[2] - SAMSUNG");
                    System.out.println("[3] - DELL");
                    int opcao = scanner.nextInt();

                    switch (opcao) {
                        case 1:
                          totalCompra = cliente.calculaTotalCompra(computador[0].getPreco());
                          totalPedidos ++;
                            break;

                        case 2:
                           totalCompra = cliente.calculaTotalCompra(computador[1].getPreco());
                            totalPedidos ++;


                            break;
                        case 3:

                            totalCompra = cliente.calculaTotalCompra(computador[2].getPreco());
                            totalPedidos ++;

                            break;

                        default:
                            System.out.println(" ESCOLHA UMA DAS OPÇÕES DISPONÍVEIS");

                            break;
                    }
                    break;
//---------------------------------CASE 2 END-----------------------------------------------------------------------
                case 3:

                    if (totalPedidos >=2) {
                        rodarCodigo = false;
                        helper();
                    } else {
                        System.out.println("VOCÊ PRECISA REALIZAR 2 OU MAIS PEDIDOS :(");
                    }
                    break;


                default:
                    System.out.println(" ESCOLHA UMA DAS OPÇÕES DISPONÍVEIS");
                    break;

            }


        }
        System.out.println("programa terminou de ser executado");

    }
}
