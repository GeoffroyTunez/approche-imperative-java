package fr.algorithmie;

public class AffichagePartiel {
    public static void main(String[] args) {
        int i;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};

        // Afficher le tableau
        System.out.println("Affichage des entiers supérieurs à 3 : ");
        for(i = 0; i < array.length; i++) {
            if(array[i]>3){
                System.out.println(array[i]);
            }
        }

        // Afficher uniquement les entier pairs du tableau
        System.out.println("Affichage des entiers pairs : ");
        for(i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }

        // Afficher uniquement les entier des index pairs du tableau
        System.out.println("Affichage des entiers des index pairs : ");
        for(i = 0; i < array.length; i++) {
            if (i % 2 == 0){
                System.out.println(array[i]);
            }
        }

        // Afficher uniquement les entier impairs du tableau
        System.out.println("Affichage des entiers impairs : ");
        for(i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }


    }
}
