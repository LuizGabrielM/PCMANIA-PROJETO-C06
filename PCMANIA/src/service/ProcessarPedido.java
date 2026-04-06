package service;
import java.util.Scanner;
public class ProcessarPedido {

    Computador[] computador;

 //------------------------------------- variaveis utilizadas no metodo menuOpcoes--------------------------
    float totalCompra = 0;
    Scanner scanner = new Scanner(System.in);
    boolean rodarCodigo = true;
//-------------------------------------------------------------------------------------
    public void mostrarOpcoes() {
        System.out.println("");
        System.out.println("ESCOLHA [ 0 ] PARA SAIR DE NOSSA LOJA ");
        System.out.println("ESCOLHA [ 1 ] PARA VIZUALIZAR NOSSAS PROMOÇÕES");
        System.out.println("ESCOLHA [ 2 ] PARA REALIZAR SEU PEDIDO");
        System.out.println("ESCOLHA [ 3 ] VIZUALIZAR TOTAL DA COMPRA E FINALIZAR SEU PEDIDO");

    }
    public ProcessarPedido(Computador[] computador) {
        this.computador = computador;
    }

    public void helper(){
        System.out.println(" VALOR TOTAL DA COMPRA = " + totalCompra);
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
                            totalCompra += computador[0].getPreco();
                            break;

                        case 2:
                            totalCompra += computador[1].getPreco();

                            break;
                        case 3:

                            totalCompra += computador[2].getPreco();
                            break;

                        default:
                            System.out.println(" ESCOLHA UMA DAS OPÇÕES DISPONÍVEIS");

                            break;
                    }
                    break;
//---------------------------------CASE 2 END-----------------------------------------------------------------------
                case 3:

                    if (totalCompra > 0) {
                        rodarCodigo = false;
                    } else {
                        System.out.println("VOCÊ AINDA NÃO REALIZOU PEDIDOS :(");
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
