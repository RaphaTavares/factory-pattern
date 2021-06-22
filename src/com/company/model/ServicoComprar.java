package com.company.model;

public class ServicoComprar implements IServico{

    @Override
    public String executar() {
        return "Você comprou um livro";
    }

    @Override
    public String cancelar() {
        return "Você estornou a compra.";
    }
}
