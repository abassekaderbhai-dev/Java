# Compte Bancaire

Une simulation de gestion de comptes bancaires développée en Java. Ce projet illustre les concepts fondamentaux de la programmation orientée objet : classes, attributs, méthodes, constructeurs et encapsulation.

---

## Structure du projet

```
.
├── CompteBancaire.java      # Classe principale du compte bancaire
└── TestCompteBancaire.java  # Tests et démonstration
```

---

## La classe `CompteBancaire`

Chaque compte est défini par trois attributs : un nom de propriétaire, un numéro de compte et un solde.

### Constructeurs

Deux constructeurs sont disponibles : un avec dépôt initial, un sans (solde à 0 par défaut).

### Méthodes disponibles

| Méthode | Description |
|---|---|
| `getNom()` | Retourne le nom du propriétaire |
| `getNumero()` | Retourne le numéro de compte |
| `getSolde()` | Retourne le solde actuel |
| `setNom(newNom)` | Modifie le nom du propriétaire |
| `setSolde(newSolde)` | Modifie le solde |
| `afficher()` | Affiche les informations du compte |
| `ajouter(somme)` | Crédite le compte d'une somme |
| `retirer(somme)` | Débite le compte si le solde est suffisant, retourne `false` sinon |
| `vider()` | Remet le solde à 0 et retourne le montant récupéré |
| `memeProprio(compte2)` | Vérifie si deux comptes appartiennent au même propriétaire |
| `transfert(compte1, somme)` | Transfère une somme entre deux comptes du même propriétaire |
| `convertitSolde(taux)` | Retourne le solde converti selon un taux de change |

---

## Lancer le projet

```bash
javac CompteBancaire.java TestCompteBancaire.java
java TestCompteBancaire
```
