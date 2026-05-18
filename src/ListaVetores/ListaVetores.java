package ListaVetores;

// arrays need to have a defined length
// need to use array list class

import java.util.Arrays;

public class ListaVetores {

    static void main(String[] args) {
        // Exercicio6 classwork = new Exercicio6();
        // classwork.show();
        Exercicio8 exercicio = new Exercicio8();
        String s1 = "alma";
        String s2 = "lama";
        // exercicio.checkAnagram(s1, s2);
        exercicio.checkAnagramTraditional(s1, s2);
    }

    static class Exercicio6 {

        int[] secondVector = new int[10];
        int[] vector = { 1, 5, 6, 7, 9 };

        public void show() {
            // System.out.println(vector);
            System.out.println(Arrays.toString(vector));
            // vector[5] = 50;
            System.out.println(Arrays.toString(vector));

            secondVector[5] = 50;
            System.out.print(Arrays.toString(secondVector));

        }

    }

    static class Exercicio8 {

        public void checkAnagram(String word1, String word2) {
            char[] word1Arr = word1.toCharArray();
            char[] word2Arr = word2.toCharArray();
            if (word1Arr.length != word2Arr.length) {
                System.out.println("NOT AN ANAGRAM");
                return;
            }
            Arrays.sort(word1Arr);
            Arrays.sort(word2Arr);
            // System.out.print(Arrays.toString(word1Arr));
            // System.out.print(Arrays.toString(word2Arr));
            for (int i = 0; i < word1Arr.length; i++) {
                if (word1Arr[i] != word2Arr[i]) {
                    System.out.println("NOT AN ANAGRAM");
                    return;
                }
            }
            System.out.println("IT IS AN ANAGRAM");
            return;
        }

        public void checkAnagramTraditional(String word1, String word2) {
            char[] word1Arr = word1.toCharArray();
            char[] word2Arr = word2.toCharArray();

            for (int i = 0; i < word1Arr.length; i++) {
                for (int j = 0; j < word2Arr.length; j++) {

                    if (word2Arr[j] == word1Arr[i]) {
                        word2Arr[j] = ' ';
                        break;
                    }
                }
            }

            for (int i = 0; i < word2Arr.length; i++) {
                if (word2Arr[i] != ' ') {
                    System.out.println("IT IS NOT AN ANAGRAM");
                    return;
                }
            }

            System.out.println("IT IS AN ANAGRAM");
            return;

        }

    }

    static class Exercicio9 {

        public void solution(int[] vectorA, int[] vectorB) {

            int[] vectorC = new int[10]; // union
            int[] vectorD = new int[10]; // complement elements in A that do not exist in B

            // vector1 e vector2 max elements 10
            // it is over when it is 999 the element
            // elements can not be repeated

            

        }

    }

}
