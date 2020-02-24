package app.controle.servico;

import app.controle.servico.excecao.TrechoCompostoDestinoOrigemException;

public class TrechoComposto implements ITrechoAereo{
    public ITrechoAereo primeiroTrecho;
    public ITrechoAereo segundoTrecho;
    double taxaDeConexao;

    public TrechoComposto(ITrechoAereo primeiro, ITrechoAereo segundo, double taxa) throws TrechoCompostoDestinoOrigemException {
        this.primeiroTrecho = primeiro;
        this.segundoTrecho = segundo;
        this.taxaDeConexao = taxa;

        if (!primeiro.getDestino().equals(segundo.getOrigem())){
            throw new TrechoCompostoDestinoOrigemException("O Destino do Primeiro Trecho não é igual a Origem do Segundo Trecho");
        }
    }

    @Override
    public String getOrigem() {
        return primeiroTrecho.getOrigem();
    }

    @Override
    public String getDestino() {
        return segundoTrecho.getDestino();
    }

    @Override
    public double getPreco() {
        return (primeiroTrecho.getPreco() + segundoTrecho.getPreco() + taxaDeConexao);
    }
    
}