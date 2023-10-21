package model;

public class IPhone extends ValidIPhone{

    private String model;

    public IPhone(Telefone telefone, MusicPlayer musicPlayer, Browser browser, String model) {
        super(telefone, musicPlayer, browser);
        this.model = model;
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "model='" + model + '\'' +
                ", telefone=" + telefone +
                ", musicPlayer=" + musicPlayer +
                ", browser=" + browser +
                '}';
    }

    public String getModel() {
        return model;
    }

    public Telefone useTelefoneApp(){
        return telefone;
    }
    public Browser useBrowserApp(){
        return browser;
    }
    public MusicPlayer useMusicPlayerApp(){
        return musicPlayer;
    }

    public void setModel(String model) {
        this.model = model;
    }

}
