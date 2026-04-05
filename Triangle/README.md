# Triangle — Java

Un projet Java illustrant la composition de classes à travers la modélisation géométrique d'un triangle dans un plan. La classe `Triangle` est construite à partir de la classe `PointPlan`, ce qui est un exemple concret de composition en programmation orientée objet.

---

## Structure du projet

```
.
├── PointPlan.java      # Classe représentant un point dans le plan
├── Triangle.java       # Classe représentant un triangle
└── TestTriangle.java   # Tests et démonstration
```

---

## La classe `PointPlan`

Représente un point dans le plan avec une abscisse et une ordonnée.

### Constructeurs

Trois constructeurs disponibles : sans paramètre (point à l'origine), avec coordonnées `(x, y)`, ou par copie d'un autre point.

### Méthodes disponibles

| Méthode | Description |
|---|---|
| `init()` | Saisie des coordonnées au clavier |
| `translater(dx, dy)` | Déplace le point selon un vecteur |
| `distance()` | Calcule la distance du point à l'origine |
| `egaleA(p)` | Vérifie si deux points sont identiques |
| `inverse()` | Retourne une copie du point |
| `affiche()` | Affiche les coordonnées du point |
| `toString()` | Retourne les coordonnées sous forme `(x, y)` |

---

## La classe `Triangle`

Représente un triangle composé de trois points de type `PointPlan`.

### Constructeurs

Deux constructeurs disponibles : avec trois points séparés, ou avec un tableau de points.

### Méthodes disponibles

| Méthode | Description |
|---|---|
| `setPoint(p, i)` | Modifie le sommet à l'indice `i` |
| `getPoint(i)` | Retourne le sommet à l'indice `i` |
| `translate(dx, dy)` | Déplace les trois sommets du triangle |
| `toString()` | Affiche les coordonnées des trois sommets |

---

## Lancer le projet

```bash
javac PointPlan.java Triangle.java TestTriangle.java
java TestTriangle
```
