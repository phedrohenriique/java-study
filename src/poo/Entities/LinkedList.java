package poo.Entities;

public class LinkedList {

    Node head;

        // Adiciona um elemento no final da lista
        public void add(String value) {
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        // Lista todos os elementos
        public void print() {
            Node current = head;

            while (current != null) {
                System.out.println(current.value);
                current = current.next;
            }
        }

        // Remove o elemento pelo índice
        public void remove(int index) {
            if (head == null) {
                return;
            }

            // Remover o primeiro elemento
            if (index == 0) {
                head = head.next;
                return;
            }

            Node current = head;

            for (int i = 0; i < index - 1; i++) {
                if (current.next == null) {
                    return;
                }

                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }

        // Verifica se um valor está na lista
        public boolean contains(String value) {
            Node current = head;

            while (current != null) {
                if (current.value.equals(value)) {
                    return true;
                }

                current = current.next;
            }

            return false;
        }
    
}
