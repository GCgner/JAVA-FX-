package utilisateur;

public class Utilisateur {

    private int id_utilisateur;
    private String nom;
    private String prenom;
    private String login;
    private String mdp;

    public String getNom() {
        return nom;
    }

    public int getId_utilisateur() {
        return id_utilisateur;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setId_utilisateur(int id_utilisateur) {
        this.id_utilisateur = id_utilisateur;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Utilisateur(int id_utilisateur, String nom, String prenom, String login, String mdp){
        this.id_utilisateur = id_utilisateur;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.mdp = mdp;
    }

}
