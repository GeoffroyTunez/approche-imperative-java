package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        // Boucle qui affiche les nombres de 0 à 9
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Boucle qui affiche "Tunez Geoffroy" 20 fois
        for(int i = 0; i < 20; i++) {
            System.out.println("Tunez Geoffroy\n");
        }

        // Boucle qui affiche les nombres pairs de 2 à 100
        for(int i = 2; i <= 100; i += 2) {
            System.out.println(i);
        }

        // Boucle qui affiche "i" pour chaque nombre impair de 1 à 99
        for(int i = 1; i < 99; i += 2) {
            System.out.println(i);
        }
    }
}
