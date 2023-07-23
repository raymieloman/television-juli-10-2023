package nl.codefounders.oefening.model.mil;

public class Soldier extends Person { // extends ... is a relationship

    private String rank;
    private Rifle rifle; // has a relationship (association evt. aggregation / composition)


    // dit wordt aangeroepen bij new Soldier(...)
    public Soldier(String rank) {
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Rifle getRifle() {
        return rifle;
    }

    public void setRifle(Rifle rifle) {
        this.rifle = rifle;
    }

    public void drink() {
        System.out.println("Drinking Beer");
    }
}
