package fr.algorithmie;

public class AffichageSuite {
    public static void main(String[] args) {
        System.out.println("Les nombre entre 1 et 10 :");
        for(int i = 1; i < 11;i++){
            System.out.println(i);
        }

        System.out.println("Les nombre pairs entre 0 et 10 :");
        for(int i = 0; i < 11;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("Les nombre impairs entre 0 et 9 :");
        for(int i = 0; i < 11;i++){
            if (i % 2 != 0){
                System.out.println(i);
            }
        }

        System.out.println("Les nombre entre 1 et 10 (par un while) :");
        int i = 1;
        while (i != 11){
            i++;
            System.out.println(i);
        }

        System.out.println("Les nombre entre pairs 0 et 10 (par un while) :");
        i = 0;
        while (i != 11){
            i++;
            if (i % 2 == 0){
                System.out.println(i);
            }
        }

        System.out.println("Les nombre entre impairs 0 et 9 (par un while) :");
        i = 0;
        while (i != 10){
            i++;
            if (i % 2 != 0){
                System.out.println(i);
            }
        }


    }
}
