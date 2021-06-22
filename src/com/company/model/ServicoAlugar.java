package com.company.model;

public class ServicoAlugar  implements IServico {

    @Override
    public String executar() {
        return "Você Alugou um livro na nossa biblioteca. Tens 7 dias para devolver";
    }

    @Override
    public String cancelar() {
        return "Você devolveu o livro.";
    }
}
