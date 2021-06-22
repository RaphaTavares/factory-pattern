package com.company.factory;

import com.company.model.IServico;
import com.company.model.ServicoAlugar;
import com.company.model.ServicoMensalidade;

public class ServicoAlugarFactory implements IServicoFactory{
    public IServico obterServico() {
        return new ServicoAlugar();
    }
}
