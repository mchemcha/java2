// Exercice 2:

import java.util.Scanner;

public class Exercice2 {

    public static void afficher_tableux(int[] array){
        int i ;
        for(i = 0; i < array.length; i++ ){
            System.out.println("element" + i + "=" + array[i]);
        }
    }
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        int nbr;
        int elem;
        int i;
        System.out.print("entre les nbr = ");
        nbr = scanner.nextInt();
        int[] array = new int[nbr];
        for (i = 0; i < nbr;i++){
            System.out.print("entre les element de tableux = ");
            elem = scanner.nextInt();
            array[i] = elem;
        }
        afficher_tableux(array);
        scanner.close();
    }
}
