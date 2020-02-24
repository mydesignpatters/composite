package app.controle.servico.excecao;

public class TrechoCompostoException extends Exception{

    private static final long serialVersionUID = 1L;
    
    public TrechoCompostoException(String mensagem){
        super(mensagem);
    }
}