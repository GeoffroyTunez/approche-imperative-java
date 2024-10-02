package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] tab = {"Paris", "Carcassonne", "Toulouse", "Nîmes", "Nantes"};
        for(int i = 0; i < tab.length; i++) {
            System.out.println("Ville " + i + " : " + tab[i]);
        }
        System.out.println("Le tableau contient : " + tab.length + " villes");
        tab[3] = "Reims";

        for(int i = 0; i < tab.length; i++) {
            System.out.println("Ville " + i + " : " + tab[i]);
        }
    }
}
