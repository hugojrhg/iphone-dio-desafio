package model;

public class Browser {

    public void exibirPagina(String url){
        System.out.println("Mostrando página: " + url);
    }

    public void adicionarNovaAba(String nomeAba){
        System.out.println("Aba " + nomeAba + " criada com sucesso!");
    }

    public void atualizarPagina(){
        System.out.println("Página Atualizada com sucesso!");
    }

    public Browser() {
    }
}
