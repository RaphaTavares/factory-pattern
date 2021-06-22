package com.company.model;

public class ServicoMensalidade implements IServico{
    @Override
    public String executar() {
        return "Você Realizou sua inscrição mensal na nossa livraria. Agora terá acesso a todos os livros por apenas 100 reais por mes";
    }

    @Override
    public String cancelar() {
        return "Você cancelou sua inscrição na livraria.";
    }
}
