public class CompteBancaire {
   private String nom;
   private String numero;
   private float solde;

   
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
   
}