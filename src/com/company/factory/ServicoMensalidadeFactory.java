package com.company.factory;

import com.company.model.IServico;
import com.company.model.ServicoMensalidade;

public class ServicoMensalidadeFactory implements IServicoFactory {

    public IServico obterServico() {
        return new ServicoMensalidade();
    }
}
