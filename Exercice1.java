// Exercice 1
// • En utilisant l'instruction Switch, écrire un programme qui demande à l'utilisateur un texte (T) et un mot (A)
// • Si le mot A= 'ENSA", le mot A sera supprimé du texte (T)
// • Si le mot A= 'FST", le mot A sera remplacé par le mot 'ENSA' dans le texte (T)
// • Si le mot A='ENCG', le mot A sera inséré à la fin du texte (T)
import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("entre le text  : ");
        String T = scanner.nextLine();
        System.out.print("entre  le mot : ");
        String A = scanner.nextLine();

        switch (A) {
            case "1337":
                T = T.replace(A, "");
                break;
            case "FST":
                T = T.replace(A, "1337");
                break;
            case "ENCG":
                T = T + A;
                break;
        
            default:
                break;
        }
        System.out.println("resultat = " +  T);
        scanner.close();
    }
    
}
