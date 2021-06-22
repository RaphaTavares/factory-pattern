package com.company.test;

import com.company.factory.ServicoMensalidadeFactory;
import com.company.model.IServico;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ServicoMensalidadeTest {

    @Test
    public void deveExecutarMensalidade(){
        IServico servico = new ServicoMensalidadeFactory().obterServico();
        assertEquals("Você Realizou sua inscrição mensal na nossa livraria. Agora terá acesso a todos os livros por apenas 100 reais por mes", servico.executar());
    }

    @Test
    public void deveCancelarMensalidade(){
        IServico servico = new ServicoMensalidadeFactory().obterServico();
        assertEquals("Você cancelou sua inscrição na livraria.", servico.cancelar());
    }
}
