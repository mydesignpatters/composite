package app.controle.servico.excecao;

public class TrechoCompostoDestinoOrigemException extends Exception{

    private static final long serialVersionUID = 1L;
    
    public TrechoCompostoDestinoOrigemException(String mensagem){
        super(mensagem);
    }
}