public class Livre implements Empruntable {

    private String titre;
    private String auteur;
    private String isbn;
    private boolean disponible;

    public Livre(String titre, String auteur, String isbn, boolean disponible) {
        this.titre = titre;
        this.auteur = auteur;
        this.isbn = isbn;
        this.disponible = disponible;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void afficherDetails() {
        System.out.println("Titre: " + titre);
        System.out.println("Auteur: " + auteur);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponible: " + disponible);
        if (disponible) {
            System.out.println("Disponible");
        } else {
            System.out.println("Indisponible");
        }
    }

    public void emprunter() {
        if (disponible) {
            setDisponible(false);
            System.out.println("Vous pouvez emprunter le livre");
        } else {
            System.out.println("Vous ne pouvez pas emprunter le livre");
        }
    }

    public void retourner() {
        setDisponible(true);
    }

}
