package design.pizzaPrototype.Base;

import java.security.InvalidParameterException;

import design.pizzaPrototype.Pizza;
import design.pizzaPrototype.Prices;

public class Thin implements Pizza{

    private Pizza p;

    Thin(Pizza p){
        if(p==null){
            throw new InvalidParameterException();
        }
        this.p = p;
    }

    @Override
    public int cost() {
        // TODO Auto-generated method stub
        if(p==null){
            return Prices.THINCRUST.getPrice();
        }
        return p.cost() + Prices.THINCRUST.getPrice();
    }

    @Override
    public String composition() {
        // TODO Auto-generated method stub
        if(p==null){
            return Prices.THINCRUST.getVal();
        }
        return p.cost() + Prices.THINCRUST.getVal();
    }

}
