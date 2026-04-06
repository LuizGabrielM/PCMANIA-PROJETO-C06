package service;
import hardware.MemoriaUSB;
import hardware.HardwareBasico;
import software.SistemaOperacional;


public class Computador {

    private String marca;
    private float preco;
    private MemoriaUSB memoriaUSB;
    private SistemaOperacional sistemaOperacional;
    HardwareBasico[] hardware = new HardwareBasico[3]; // 0 - CPU, 1 - MEMORIA RAM, 2 - ARMAZENAMENTO


    // CONSTRUTOR PARA INICIALIZAR O OBJETO
    public Computador(String marca,float preco) {
        this.marca = marca;
        this.preco = preco;
    }

    public void addSistemaOperacional(SistemaOperacional so ){
        this.sistemaOperacional = so;
    }

    // metodo pazra passar memoria para classe computador
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoriaUSB = musb;
    }

    public void addHardware(HardwareBasico processador, HardwareBasico ram, HardwareBasico memoria){
        this.hardware[0] = processador;
        this.hardware[1] = ram;
        this.hardware[2] = memoria;
    }

// -------------------------------------------------------------------------------------------------------------------
    // getters e setters
    public float getPreco() {
        return preco;
    }

    public String getMarca() {
        return marca;
    }

    public MemoriaUSB getMemoriaUSB() {
        return memoriaUSB;
    }

    public SistemaOperacional getSistemaOperacional() {
        return sistemaOperacional;
    }


    public void mostraPCConfigs(){

        System.out.println();

        System.out.println(" Marca "  + getMarca()+  " " +getPreco()  + " R$");
        System.out.println(" Processador " + hardware[0].getNome() +" " + hardware[0].getCapacidade() + " MHz");
        System.out.println(" Memoria Ram " + hardware[1].getNome() +" " + hardware[1].getCapacidade() + " GB");
        System.out.println(" Armazenamento " + hardware[2].getNome() +" " + hardware[2].getCapacidade() + " GB");
        System.out.println(" Sistema operacional" + getSistemaOperacional().getNomeSO() + " " + getSistemaOperacional().getTipoSO() + " " + "bits");
        System.out.println(" Acompanha Drive USB " + getMemoriaUSB().getNomeUSB() + "  " + getMemoriaUSB().getCapacidadeUSB() +"Gb");

    }



}
