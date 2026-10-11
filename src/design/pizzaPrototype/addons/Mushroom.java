package design.pizzaPrototype.addons;

import java.security.InvalidParameterException;

import design.pizzaPrototype.Pizza;

public class Mushroom implements Pizza{
    private Pizza p;

    public Mushroom(Pizza pi){
        if(pi==null){
            throw new InvalidParameterException();
        }
        this.p = pi;

    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        return p.cost() + 5;
    }

    @Override
    public String composition() {
        // TODO Auto-generated method stub
        return p.composition() + "Mushroom";
    }
}
