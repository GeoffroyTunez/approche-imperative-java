package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tab = {8,-7,12,1,-2,14,17,9};
        System.out.println("Premier index du tableau : " + tab[0]);
        System.out.println("Taille du tableau : " + tab.length);
        System.out.println("Dernier index du tableau : " + tab[(tab.length - 1 )]);
        // Le tableau a une de 8, il fait donc de 0 a 7 or on veut afficher le 10 index qui n'existe pas
        System.out.println("Le 10eme index du tableau : " + tab[10]);
    }
}
