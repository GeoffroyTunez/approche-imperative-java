package fr.boucles;

public class ExerciceTableauEntier {
    public static void main(String[] args) {
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Index 1 : " + tab[0]);
        System.out.println("Longeur du tableau : " + tab.length);
        System.out.println("Dernier index du tableau : " + tab[(tab.length -1)]);
        tab[4] = 8;
    }
}
