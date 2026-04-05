/******************** Test de la classe *****************************/

public class TestCompteBancaire
{

public static void main(String args[]) {
    
    CompteBancaire Abasse = new CompteBancaire("Abasse", "1234567FR", 382.45f);
    CompteBancaire Jawed = new CompteBancaire("Jawed", "987654FR", 0f);
    Abasse.afficher();
    float solde1 = Abasse.getSolde();
    boolean egalite = Abasse.memeProprio(Jawed);
    System.out.println("Je suis riche de : " + solde1) ;
    System.out.println("Est-ce que c'est les mêmes personnes : " + egalite) ;
    boolean solde2 = Abasse.retirer(50);
    boolean solde3 = Abasse.retirer(400);
    boolean solde4 = Jawed.ajouter(60);
    System.out.println("1er retrait Abasse: " + solde2 + " solde : " + Abasse.getSolde() + " 2nd retrait Abasse : " + solde3 + " solde : " + Abasse.getSolde() + 
    " 1er depot Jawed : " + solde4 + " solde : " + Jawed.getSolde());
}// fin du main
} // fin de la classe

