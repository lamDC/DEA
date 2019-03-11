package nl.han.oose.DiegoCup;

public class BibliotheekItem {

    private String titel;
    private String auteur;
    private String platform;

    public BibliotheekItem(String titel, String auteur) {
        this.titel = titel;
        this.auteur = auteur;
    }

    public BibliotheekItem(String titel, String auteur, String platform) {
        this.titel = titel;
        this.auteur = auteur;
        this.platform = platform;
    }

    public String getTitel() {
        return titel;
    }
    public String getAuteur() {
        return auteur;
    }

    public String getPlatform() {
        return platform;
    }
}
