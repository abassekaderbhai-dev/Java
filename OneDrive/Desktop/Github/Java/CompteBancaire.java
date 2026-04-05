/** correction de CompteBancaire suite aux premiers Tps
*/


public class CompteBancaire {
   private String nom;
   private String numero;
   private float solde;

   /**
   * Constructeurs
   */
   public CompteBancaire(String nomP, String noC, float depot){
      this.nom = nomP;
      this.numero = noC;
      this.solde = depot;
   }

   public CompteBancaire(String nomP, String noC){
      this.nom = nomP;
      this.numero = noC;
      this.solde = 0f;
   }


    // getters setters
   public String getNom(){
      return this.nom;
   }
   public String getNumero(){
      return this.numero;
   }
   public float getSolde(){
      return this.solde;
   }
   public void setNom(String newNom){
      this.nom = newNom;
   }
   public void setSolde(float newSolde){
      this.solde = newSolde;
   }
   public void afficher(){
      System.out.println(this);
   }
   public float vider(){
      float montant = this.solde;
      solde = 0;
      return montant;
   }
   public boolean ajouter(float somme){
      this.solde += somme;
      return true;
   }
   public boolean retirer(float somme){
      if (this.solde < somme){
         return false;
      }
      else{
         this.solde -= somme;
         return true;
      }
   }
   public boolean memeProprio(CompteBancaire compte2){
        return this.nom.equals(compte2.getNom());
   }

   public boolean transfert(CompteBancaire compte1, float somme){
      if (this.memeProprio(compte1)){
         this.retirer(somme);
         compte1.ajouter(somme);
         return true;
      }
      else{
         return false;
      }
   }
   public float convertitSolde(float tauxConversion){
      return this.solde*tauxConversion;
   }
   /**
   * ajoute 'ajout 'au solde si 'ajout' est positif et retourne true, sinon retourne false
   */
   


    /**
   * retire 'retrait' au solde si 'retrait' est positif et retourne true, retourne false si 'retrait' est négatif
   */

   /**
   * test si deux comptes ont memes proprietaires

   * transfert d'un compte sur un autre pour un meme proprietaire
   * le compte passé en parametre est receveur du transfert
   * la valeur est donc positive
   * renvoie faux si erreur
   * vrai si le tranfert est effectué
   * fait des affichages appropriés dans le cas d'un retour à false (3 cas)
   */



   /*
   * retourne la conversion du solde du compte dans une monnaie dont le taux de change est passé en paramètre
   */


}