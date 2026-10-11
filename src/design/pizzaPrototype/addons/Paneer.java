package design.pizzaPrototype.addons;

import java.security.InvalidParameterException;

import design.pizzaPrototype.Pizza;

public class Paneer implements Pizza{

    private Pizza p;

    public Paneer(Pizza pi){
        if(pi==null){
            throw new InvalidParameterException();
        }
        this.p = pi;

    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return p.cost() + 10;
    }

    @Override
    public String composition() {
        // TODO Auto-generated method stub
        return p.composition() + "Paneer";
    }

}
