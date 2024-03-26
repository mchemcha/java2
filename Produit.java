
public class Produit {
    private int code;
    String marque;
    private float prix;

    public Produit(){
        code = 0;
        marque = "";
        prix = (float) 0.00;
    }
    public Produit(int code, String marque, float prix) {
        this.code = code;
        this.marque = marque;
        this.prix = prix;
    }
    public String toString() {
        return "Code = " + code + " : marque = " + marque + ", prix = " + prix;
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public float getPrix() {
        return prix;
    }
    public void setPrix(float prix) {
        this.prix = prix;
    }

    public static double calcPrix(Produit[] produits) {
        double somme = 0.0;
        for (Produit produit : produits) {
            somme += produit.getPrix();
        }
        return somme;
    }
    // public boolean equals(Object obj) {
    //     if (this == obj) return true;
    //     if (obj == null || getClass() != obj.getClass()) return false;
    //     Produit produit = (Produit) obj;
    //     return code == produit.code &&
    //             Double.compare(produit.prix, prix) == 0 &&
    //             marque.equals(produit.marque);
    // }
     
}
