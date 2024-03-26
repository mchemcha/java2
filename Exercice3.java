import java.util.Scanner;

public class Exercice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produit[] produits = new Produit[4];

        for (int i = 0; i < produits.length; i++) {
            System.out.println("Saisie des informations pour le produit " + (i + 1) + ":");
            System.out.print("Code: ");
            int code = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Marque: ");
            String marque = scanner.nextLine();
            System.out.print("Prix: ");
            
            float prix = scanner.nextFloat();
            scanner.nextLine(); 
            produits[i] = new Produit(code, marque, prix);
        }

        for (Produit produit : produits) {
            System.out.println(produit.toString());
        }

        System.out.println( Produit.calcPrix(produits));

        if (produits[0].equals(produits[1])) {
            System.out.println("Les produits ont le même état.");
        } else {
            System.out.println("Les produits n'ont pas le même état.");
        }
        scanner.close();
    }
}
    

