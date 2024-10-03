package fr.algorithmie;

public class SommeDeTableaux {
    public static void main(String[] args) {
        int i;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array_2 = {-1, 12, 17, 14, 5, -9, 0, 18, -6, 0, 4, -13, 5, 7, -2, 8, 1};
        int[] array_moyenne = new int[array.length];


        for(i=0;i<array.length;i++){
            array_moyenne[i] = array[i] + array_2[i];
        }
        System.out.println("La somme des tableau est : ");
        for(i=0;i<array.length;i++){
            System.out.println(array_moyenne[i]);
        }
    }
}
