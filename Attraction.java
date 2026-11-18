package examen2014;

public class Attraction {
    private String nom;
    private float cout;
    private ConditionAge condition;
    private int nbPersonnes;
    private float recette;

    public Attraction(String nom, float cout, ConditionAge condition) {
        this.nom = nom;
        this.cout = cout;
        this.condition = condition;
        this.nbPersonnes = 0;
        this.recette = 0;
    }

    public void affiche() {
        System.out.println("Nom : " + nom);
        System.out.println("Cout : " + cout + " DT");
        System.out.println("Nombre de personnes : " + nbPersonnes);
        System.out.println("Recette : " + recette + " DT");
    }

    public void utilise(Personne p) {
        if (condition.accesPossible(p)) {
            nbPersonnes++;
            recette += cout;
            System.out.println(p.getNom() + " peut acceder a " + nom);
        } else {
            System.out.println(p.getNom() + " : acces interdit a " + nom);
        }
    }

    public String getNom() {
        return nom;
    }

    public float getRecette() {
        return recette;
    }

    public ConditionAge getCondition() {
        return condition;
    }
}