package design.pizzaPrototype.Base;

import java.security.InvalidParameterException;

import design.pizzaPrototype.Pizza;
import design.pizzaPrototype.Prices;

public class Cheese implements Pizza{

    private Pizza p;

    public Cheese(){}

    public Cheese(Pizza pi){
        if(pi==null){
            throw new InvalidParameterException();
        }
        this.p = pi;
    }


    @Override
    public int cost() {
        // TODO Auto-generated method stub
        if(p==null){
            return 20;
        }
        return p.cost() + Prices.CHEESE.getPrice();
    }

    @Override
    public String composition() {
        // TODO Auto-generated method stub
        if(p==null){
            return Prices.CHEESE.getVal();
        }
        return p.composition() + Prices.CHEESE.getVal();
    }

}
