package eda.CacaAoTesouro;

public class Pista {

    private String nomeIlha;
    private String mensagem;
    private Pista proximaPista;

    public Pista(String nomeIlha, String mensagem) {
        this.nomeIlha = nomeIlha;
        this.mensagem = mensagem;
        this.proximaPista = null;
    }

    public String getNomeIlha() {
        return nomeIlha;
    }

    public void setNomeIlha(String nomeIlha) {
        this.nomeIlha = nomeIlha;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public Pista getProximaPista() {
        return proximaPista;
    }

    public void setProximaPista(Pista proximaPista) {
        this.proximaPista = proximaPista;
    }
}