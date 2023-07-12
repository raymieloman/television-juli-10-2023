package nl.defensie.oefening;

import nl.defensie.oefening.model.mil.Person;
import nl.defensie.oefening.model.mil.Soldier;
import nl.defensie.oefening.model.mil.SupportingPerson;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        boolean isMale = true;
        double salary = 1525.25;

        char myFirstInitial = 'R';


        // bit :: = 0 of een 1
        // byte:: = 8 bits (want een beetje een verhaspeling van eight bits) ...byte
        // nibble ::= 4 bits
        // byte(8 bits: dus max 2^(8-1) = -128t/m+127, short(16) -32000t/m32676, int(32) -2miljard tot +2 miljard( en long zijn primitives in Java
        //


        // piet is hier een object. piet is een instantie van nl.defensie.oefening.model.mil.Person
        // piet is een reference variable

        // let op:
        // links is hier de definitie
        // rechts is hier de constructie
        Person piet = new SupportingPerson();
        piet.setName("Piet");
        piet.setWeight(81);
        piet.setDateOfBirth(LocalDate.of(1968,8,9));
        piet.drink();

        Soldier jack = new Soldier("Private");
        jack.setName("Jack");
        System.out.println(jack.getName());
        jack.setRank("Private");
        System.out.println(jack.getRank());
        jack.drink();
    }
}
