package com.company.test;

import com.company.factory.ServicoComprarFactory;
import com.company.model.IServico;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ServicoComprarTest {

    @Test
    public void deveComprar(){
        IServico servico = new ServicoComprarFactory().obterServico();
        assertEquals("Você comprou um livro", servico.executar());
    }

    @Test
    public void deveEstornar(){
        IServico servico = new ServicoComprarFactory().obterServico();
        assertEquals("Você estornou a compra.", servico.cancelar());
    }
}
