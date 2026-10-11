package design.pizzaPrototype;

import java.util.HashMap;
import java.util.Map;

public class PizzaRegistry {
    Map<String,Pizza> hm = new HashMap<>();

    public Pizza get(String p){
        if(hm.containsKey(p)){
            return (Pizza)hm.get(p);
        }
        return null;
    }
    public void put(Pizza p){
        hm.put(p.composition(),p);
    }

}
