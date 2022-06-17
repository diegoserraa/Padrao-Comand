package padroescomportamentais.command;

public class Conta {

    private int numero;
    private int digito;
    private String situacao;

    public Conta(int numero, int digito) {
        this.numero = numero;
        this.digito = digito;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirConta() {
        this.situacao = "Conta aberta";
    }

    public void fecharConta() {
        this.situacao = "Conta fechada";
    }
}
