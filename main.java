package examen2014;
public class main {
    public static void main(String[] args) {
        Personne ali = new Personne("Ali", 20, 175);
        Personne sami = new Personne("Sami", 10, 130);

        ConditionAge c1 = new ConditionAge(15);
        ConditionAge c2 = new ConditionAge(8);

        Attraction jeux1 = new Attraction("jeux 1", 8, c1);
        Attraction jeux2 = new Attraction("jeux 2", 6, c2);

        ParcAttraction parc = new ParcAttraction("parc 1", 2);
        parc.ajouteAttraction(jeux1);
        parc.ajouteAttraction(jeux2);

        jeux1.utilise(ali); 
        jeux1.utilise(sami);  
        jeux2.utilise(ali);   
        jeux2.utilise(sami);
        parc.affiche();
    }
}