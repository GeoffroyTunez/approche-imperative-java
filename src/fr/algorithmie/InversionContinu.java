package fr.algorithmie;

public class InversionContinu {
    public static void main(String[] args) {
        int i;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] arrayCopy = new int[array.length];

        // Inverser le tableau dans arrayCopy
        for(i = 0; i < array.length; i++) {
            arrayCopy[i] = array[array.length - 1 - i];
        }

        // Afficher le tableau
        System.out.println("Tableau  : ");
        for(i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // Afficher le tableau inversé
        System.out.println("Tableau inversé : ");
        for(i = 0; i < arrayCopy.length; i++) {
            System.out.println(arrayCopy[i]);
        }
    }
}
