package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};
        // Parcourir le tableau dans l'ordre croissant

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }

        System.out.println("Tableau parcouru en sens inverse :");

        // Parcourir le tableau dans l'ordre décroissant
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }

        System.out.println("Affichage des entier supérieur a 3 :");

        // Afficher que les entier au dessus de 3
        for(int i = 0; i< array.length; i++){
            if(array[i]>3){
                System.out.println(array[i]);
            }
        }

        System.out.println("Affichage des entier pairs :");

        for(int i = 0; i< array.length; i++) {
            if (array[i] % 2 == 0){
                System.out.println(array[i]);
            }
        }

        System.out.println("Affichage des index pairs :");

        for(int i = 0; i< array.length; i+=2) {
            System.out.println(array[i]);
        }

        System.out.println("Affichage des entier impairs :");

        for(int i = 0; i< array.length; i++) {
            if (array[i] % 2 != 0){
                System.out.println(array[i]);
            }
        }
    }
}
