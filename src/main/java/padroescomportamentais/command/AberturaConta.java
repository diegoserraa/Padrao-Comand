package padroescomportamentais.command;

public class AberturaConta implements Tarefa {

    private Conta conta;

    public AberturaConta(Conta conta) {
        this.conta = conta;
    }

    public void executar() {
        this.conta.abrirConta();
    }

    public void cancelar() {
        this.conta.fecharConta();
    }
}
