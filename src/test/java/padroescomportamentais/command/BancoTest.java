package padroescomportamentais.command;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BancoTest {

    Banco banco;
    Conta conta;

    @BeforeEach
    void setUp() {
        banco = new Banco();
        conta = new Conta(202201, 1);
    }

    @Test
    void deveAbrirConta() {
        Tarefa aberturaSemestre = new AberturaConta(conta);
        banco.executarTarefa(aberturaSemestre);

        assertEquals("Conta aberta", conta.getSituacao());
    }

    @Test
    void deveFecharConta() {
        Tarefa fechamentoSemestre = new FechamentoConta(conta);
        banco.executarTarefa(fechamentoSemestre);

        assertEquals("Conta fechada", conta.getSituacao());
    }

    @Test
    void deveCancelarFechamentoConta() {
        Tarefa aberturaSemestre = new AberturaConta(conta);
        Tarefa fechamentoSemestre = new FechamentoConta(conta);

        banco.executarTarefa(aberturaSemestre);
        banco.executarTarefa(fechamentoSemestre);

        banco.cancelarUltimaTarefa();

        assertEquals("Conta aberta", conta.getSituacao());
    }

}