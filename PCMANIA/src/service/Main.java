package service;
import hardware.HardwareBasico;
import hardware.MemoriaUSB;
import software.SistemaOperacional;

public class Main {

   public static void main(String[]args) {

      System.out.println("██████╗ ███████╗███╗   ███╗    ██╗   ██╗██╗███╗   ██╗██████╗  ██████╗ ");
      System.out.println("██╔══██╗██╔════╝████╗ ████║    ██║   ██║██║████╗  ██║██╔══██╗██╔═══██╗");
      System.out.println("██████╔╝█████╗  ██╔████╔██║    ██║   ██║██║██╔██╗ ██║██║  ██║██║   ██║");
      System.out.println("██╔══██╗██╔══╝  ██║╚██╔╝██║    ╚██╗ ██╔╝██║██║╚██╗██║██║  ██║██║   ██║");
      System.out.println("██████╔╝███████╗██║ ╚═╝ ██║     ╚████╔╝ ██║██║ ╚████║██████╔╝╚██████╔╝");
      System.out.println("╚═════╝ ╚══════╝╚═╝     ╚═╝      ╚═══╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ ");

      System.out.println("███████╗ ██████╗     ██████╗   ██████╗    ███╗   ███╗ █████╗ ███╗   ██╗██╗ █████╗ ");
      System.out.println("██╔══██╗██╔═══██╗    ██╔══██╗██╔═══       ████╗ ████║██╔══██╗████╗  ██║██║██╔══██╗");
      System.out.println("███████║██║   ██║    ██████╔╝██║          ██╔████╔██║███████║██╔██╗ ██║██║███████║");
      System.out.println("██╔══██║██║   ██║    ██╔═══╝ ██║          ██║╚██╔╝██║██╔══██║██║╚██╗██║██║██╔══██║");
      System.out.println("██║  ██║╚██████╔╝    ██║     ╚██████╔╝    ██║ ╚═╝ ██║██║  ██║██║ ╚████║██║██║  ██║");
      System.out.println("╚═╝  ╚═╝ ╚═════╝     ╚═╝      ╚═════╝     ╚═╝     ╚═╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝╚═╝  ╚═╝");




      // Criação de objetos
        Computador [] computador = new Computador[3];
        Cliente cliente = new Cliente("Luiz","111.222.333-44");
       // necessário criar pois precico do metodo do calculo de compra que esta na classe Cliente e dos preços dos computadores




     // NOME E PRÇO DOS COMPUTADORES PREÇO = MATRICULA + CONDIÇÃO DADA

      computador[0] = new Computador("Apple", 622);
      computador[1] = new Computador("Samsung", 622 + 1234);
      computador[2] = new Computador("Dell",622 + 5678);

      //ASSOCIACAO ENTRE COMPUTADOR E MEMORIA
      computador[0].addMemoriaUSB(new MemoriaUSB("Pen-drive", 16));
      computador[1].addMemoriaUSB(new MemoriaUSB("Pen-drive", 32));
      computador[2].addMemoriaUSB(new MemoriaUSB("HD EXTERNO", 1000)); //1TB

      // SISTEMA OPERACIONAL NOME E TIPO
      computador[0].addSistemaOperacional(new SistemaOperacional(" macOS Sequoia",64));
      computador[1].addSistemaOperacional(new SistemaOperacional(" Windows 8",32));
      computador[2].addSistemaOperacional(new SistemaOperacional(" Windows 11",32));

      // PASSAR O HADWARE BASICO PARA O COMPUTADOR nome/capacidade
      computador[0].addHardware(
              new HardwareBasico("Pentium Core i3",2200),
              new HardwareBasico("RAM",8),
              new HardwareBasico("HD", 500)
      );
      computador[1].addHardware(
              new HardwareBasico("Pentium Core i5",3370),
              new HardwareBasico("RAM",16),
              new HardwareBasico("HD", 1000) //1TB\
      );
      computador[2].addHardware(
              new HardwareBasico("Pentium Core i7",4500),
              new HardwareBasico("RAM",32),
              new HardwareBasico("HD", 2000)//2TB
      );
      ProcessarPedido pedido = new ProcessarPedido(computador, cliente);


      pedido.menuOpcoes(); // chamando o metodo para a ineteração do usuário com o sistemas de compras

   }
}
