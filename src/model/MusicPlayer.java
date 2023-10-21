package model;

public class MusicPlayer {

    public void tocar(String musica){
        System.out.println("Tocando " + musica);
    }

    public void parar(){
        System.out.println("Música Parada");
    }

    public void selecionarMusica(String musica){
        System.out.println("Música selecionada: " + musica);
    }

    public MusicPlayer() {
    }
}
