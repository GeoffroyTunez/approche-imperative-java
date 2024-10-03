package fr.algorithmie;

public class ComparaisonTableau {
    public static void main(String[] args) {
        int i;
        int j;
        int[] array1 = {1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {3,-8,17,5,-1,4,0,6,2,11,-5,-4,8};
        int similaire =0;

        for (i = 0; i < array1.length; i++) {
            for (j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    similaire++;
                    System.out.println(array1[i]+" _ " + array2[j]);
                }
            }
        }

        System.out.println("Nombre de similitude : " + similaire);
    }
}