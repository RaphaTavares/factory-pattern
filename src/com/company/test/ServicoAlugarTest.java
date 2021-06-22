package com.company.test;

import com.company.factory.ServicoAlugarFactory;
import com.company.model.IServico;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ServicoAlugarTest {

    @Test
    public void deveAlugar(){
        IServico servico = new ServicoAlugarFactory().obterServico();
        assertEquals("Você Alugou um livro na nossa biblioteca. Tens 7 dias para devolver", servico.executar());
    }

    @Test
    public void deveRetornarDoAluguel(){
        IServico servico = new ServicoAlugarFactory().obterServico();
        assertEquals("Você devolveu o livro.", servico.cancelar());
    }
}
