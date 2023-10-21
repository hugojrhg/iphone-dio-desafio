import model.Browser;
import model.IPhone;
import model.MusicPlayer;
import model.Telefone;

public class Main {
    public static void main(String[] args) {

        Telefone telefone = new Telefone();
        Browser browser = new Browser();
        MusicPlayer musicPlayer = new MusicPlayer();

        IPhone hugoIphone = new IPhone(telefone, musicPlayer, browser, "iPhone 15");

        hugoIphone.useTelefoneApp().ligar(123123);
        hugoIphone.useTelefoneApp().atender(456456);
        hugoIphone.useBrowserApp().exibirPagina("google.com");
        hugoIphone.useMusicPlayerApp().selecionarMusica("Viva La Vida");
    }
}