package fr.algorithmie;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1,15,-3,0,8,7,4,-2,28,7,-1,17,2,3,0,14,-4};

        int i;
        System.out.println("Affichage du tableau : ");
        for(i=0;i <array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("Affichage du tableau a l'inverse : ");
        for(i=(array.length - 1 );i >= 0;i--){
            System.out.println(array[i]);
        }

        int[] arrayCopy = new int[array.length];

        for(i=0;i <array.length;i++){
            arrayCopy[i] = array[i];
        }
    }
}
