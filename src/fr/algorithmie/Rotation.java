package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int echangeur;

        echangeur = array[0];
        for (int i = 0; i<(array.length-1);i++){
            array[i] = array[i+1];
        }
        array[array.length-1] = echangeur;
    }
}
