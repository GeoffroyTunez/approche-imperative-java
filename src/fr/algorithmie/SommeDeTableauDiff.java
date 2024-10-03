package fr.algorithmie;

public class SommeDeTableauDiff {
    public static void main(String[] args) {
        int i;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array_2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int[] array_moyenne = new int[array.length];

        // On s'assure de ne pas dépasser la taille de array_2
        for (i = 0; i < array.length; i++) {
            if (i <= array_2.length) {
                array_moyenne[i] = array[i] + array_2[i];
            } else {
                array_moyenne[i] = array[i];
            }
        }

        // Affichage de la somme des tableaux
        System.out.println("La somme des tableaux est : ");
        for (i = 0; i < array.length; i++) {
            System.out.println(array_moyenne[i]);
        }
    }
}
