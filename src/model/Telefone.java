package model;

public class Telefone {
    public void ligar(Integer phone){
        System.out.println("Ligando para " + phone);
    }

    public void atender(Integer phone){
        System.out.println("Atendendo ligação de " + phone);
    }

    public void iniciarCorreioVoz(Integer phone){
        System.out.println("Mandando Correio de Voz para " + phone);
    }
    public Telefone() {
    }
}
