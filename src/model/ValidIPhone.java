package model;

public abstract class ValidIPhone {
    Telefone telefone;
    MusicPlayer musicPlayer;
    Browser browser;
    protected ValidIPhone(Telefone telefone, MusicPlayer musicPlayer, Browser browser) {
        this.telefone = telefone;
        this.musicPlayer = musicPlayer;
        this.browser = browser;
    }
}
