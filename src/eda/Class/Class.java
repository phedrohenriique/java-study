package eda.Class;

import eda.CacaAoTesouro.CacaAoTesouro;
import eda.CacaAoTesouro.Pista;

public class Class {
    public static void main(String[] args) {

        TrabalhoCacaAoTesouro();

    };

    public static void TrabalhoCacaAoTesouro() {
        // 1. Instancia a lista da caça ao tesouro
        CacaAoTesouro caca = new CacaAoTesouro();

        // 2. Adiciona as 5 pistas na ordem especificada
        caca.adicionarPista(
                "Ilha dos Pássaros",
                "Procure pela palmeira torta na praia leste.");

        caca.adicionarPista(
                "Ilha da Névoa",
                "Siga o rio até a caverna; atente-se às rochas.");

        caca.adicionarPista(
                "Ilha do Esqueleto",
                "Cuidado com as armadilhas no caminho de pedra.");

        caca.adicionarPista(
                "Ilha das Sereias",
                "Navegue ao sul até encontrar o rochedo azul.");

        caca.adicionarPista(
                "Ilha do Baú de Ouro",
                "PARABÉNS! Você encontrou o tesouro do Capitão Morgan!");

        // 3. Exibe a rota completa
        System.out.println("ROTA ORIGINAL:");
        caca.iniciarJornada();

        // 4. Simula a sabotagem
        System.out.println("=== SABOTAGEM ===");
        System.out.println("A pista da Ilha do Esqueleto foi destruída.");

        boolean removida = caca.removerPista("Ilha do Esqueleto");

        if (removida) {
            System.out.println("Pista removida com sucesso.");
        } else {
            System.out.println("Pista não encontrada.");
        }

        System.out.println();

        // 5. Exibe a nova rota
        System.out.println("ROTA APÓS A SABOTAGEM:");
        caca.iniciarJornada();

        // 6. Busca pela pista do tesouro
        System.out.println("=== BUSCA PELO TESOURO ===");

        Pista pistaTesouro = caca.buscarPista("Ilha do Baú de Ouro");

        if (pistaTesouro != null) {
            System.out.println("Mensagem encontrada:");
            System.out.println(pistaTesouro.getMensagem());
        }

    }
}
