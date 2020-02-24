package app.controle.servico;

public class TrechoSimples implements ITrechoAereo{
    String origem;
    String destino;
    double preco;

    public TrechoSimples(String origem, String destino, double preco){
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
    }

    @Override
    public String getOrigem() {
        return origem;
    }

    @Override
    public String getDestino() {
        return destino;
    }

    @Override
    public double getPreco() {
        return preco;
    }
    
}