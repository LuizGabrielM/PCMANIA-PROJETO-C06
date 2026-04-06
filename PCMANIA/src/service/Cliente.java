package service;
 public class Cliente {


    private String nome;
    private String cpf;
    float valor = 0;
     public Cliente(String nome, String cpf) {
         this.nome = nome;
         this.cpf = cpf;
     }

     public float calculaTotalCompra(float preco){

                 return valor += preco;
     }


     public float getValor() {
         return valor;
     }
 }
