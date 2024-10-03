package fr.algorithmie;

public class RechercheMin {
    public static void main(String[] args) {
        int i;
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int max=0;
        for(i=0;i<array.length;i++){
            if(max > array[i]){
                max = array[i];
            }
        }
//        System.out.println(max);
    }
}
