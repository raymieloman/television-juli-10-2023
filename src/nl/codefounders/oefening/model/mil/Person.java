package nl.codefounders.oefening.model.mil;

import java.time.LocalDate;

// class ::= template
public abstract class Person {
    // omdat nl.voorraad.oefening.model.mil.Person abstract is, is het feitelijk een template class geworden
    private String name;
    private double weight;
    private LocalDate dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public abstract void drink();
}
