package com.company.factory;

import com.company.model.IServico;
import com.company.model.ServicoComprar;
import com.company.model.ServicoMensalidade;

public class ServicoComprarFactory implements IServicoFactory{
    public IServico obterServico() {
        return new ServicoComprar();
    }
}
