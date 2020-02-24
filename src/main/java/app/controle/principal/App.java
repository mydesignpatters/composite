package app.controle.principal;

import app.controle.servico.TrechoComposto;
import app.controle.servico.TrechoSimples;

public class App {
    public static void main(String[] args) {
        TrechoSimples ts1 = new TrechoSimples("São Paulo", "Brasília", 500);
        TrechoSimples ts2 = new TrechoSimples("Brasília", "Recife", 300);
        TrechoSimples ts3 = new TrechoSimples("Recife", "Natal", 350);
        TrechoComposto tc1 = null;
        TrechoComposto tc2 = null;

        try {
            tc1 = new TrechoComposto(ts1, ts2, 30);
            tc2 = new TrechoComposto(ts2, ts3, 50);            
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("Teste do Padrão Composite");
        System.out.println("");

        System.out.println("Primeiro trecho " + "Origem: " + ts1.getOrigem() + " Destino: " + ts1.getDestino());
        System.out.println("Segundo trecho " + "Origem: " + ts2.getOrigem() + " Destino: " +ts2.getDestino());
        System.out.println("Terceiro trecho " + "Origem: " + ts3.getOrigem() + " Destino: " +ts3.getDestino());
        System.out.println("");

        System.out.println("Origem do Meu Voo: " + tc1.getOrigem() + " - " + tc1.getDestino());
        System.out.println("Destino Final: " + tc2.getDestino() + " via " + tc2.getOrigem());

        System.out.println("");
        System.out.println("Preco total: " + "1o. trecho: " + tc1.getPreco() + " | 2o. trecho: " + tc2.getPreco() + " | Total: " + (tc1.getPreco() + tc2.getPreco()));

    }
}