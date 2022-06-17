package padroescomportamentais.command;

public class FechamentoConta implements Tarefa {

    private Conta conta;

    public FechamentoConta(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.fecharConta();
    }

    public void cancelar() {
        this.conta.abrirConta();
    }
}
