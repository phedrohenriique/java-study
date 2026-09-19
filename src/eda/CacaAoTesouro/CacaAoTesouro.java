package eda.CacaAoTesouro;

public class CacaAoTesouro {

    private Pista primeiraPista;
    private Pista ultimaPista;

    public CacaAoTesouro() {
        primeiraPista = null;
        ultimaPista = null;
    }

    public void adicionarPista(String nomeIlha, String mensagem) {
        Pista novaPista = new Pista(nomeIlha, mensagem);

        // Lista vazia
        if (primeiraPista == null) {
            primeiraPista = novaPista;
            ultimaPista = novaPista;
        } else {
            // Adiciona no final da lista
            ultimaPista.setProximaPista(novaPista);
            ultimaPista = novaPista;
        }
    }

    public void iniciarJornada() {
        if (primeiraPista == null) {
            System.out.println("A lista de pistas está vazia.");
            return;
        }

        Pista atual = primeiraPista;

        System.out.println("=== JORNADA DO CAPITÃO MORGAN ===");

        while (atual != null) {
            System.out.println("Ilha: " + atual.getNomeIlha());
            System.out.println("Enigma: " + atual.getMensagem());
            System.out.println();

            atual = atual.getProximaPista();
        }
    }

    public Pista buscarPista(String nomeIlha) {
        Pista atual = primeiraPista;

        while (atual != null) {
            if (atual.getNomeIlha().equals(nomeIlha)) {
                return atual;
            }

            atual = atual.getProximaPista();
        }

        System.out.println(
            "Alerta: a pista da " + nomeIlha + " não foi encontrada."
        );

        return null;
    }

    public boolean removerPista(String nomeIlha) {

        if (primeiraPista == null) {
            return false;
        }

        // Caso 1: remoção da primeira pista
        if (primeiraPista.getNomeIlha().equals(nomeIlha)) {

            primeiraPista = primeiraPista.getProximaPista();

            // Se a lista ficou vazia, atualiza também a última pista
            if (primeiraPista == null) {
                ultimaPista = null;
            }

            return true;
        }

        // Procura a pista mantendo referência para a anterior
        Pista anterior = primeiraPista;
        Pista atual = primeiraPista.getProximaPista();

        while (atual != null) {

            if (atual.getNomeIlha().equals(nomeIlha)) {

                // O anterior passa a apontar para o próximo
                anterior.setProximaPista(atual.getProximaPista());

                // Caso 2: remoção da última pista
                if (atual == ultimaPista) {
                    ultimaPista = anterior;
                }

                return true;
            }

            anterior = atual;
            atual = atual.getProximaPista();
        }

        // Caso 3: ilha não encontrada
        return false;
    }
}
