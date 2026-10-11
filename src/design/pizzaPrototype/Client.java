package design.pizzaPrototype;

import design.pizzaPrototype.addons.Mushroom;
import design.pizzaPrototype.addons.Paneer;
import design.pizzaPrototype.Base.Cheese;

public class Client {
    public static void main(String[] args) {
        PizzaRegistry pr = new PizzaRegistry();

        Pizza p = new Paneer(new Cheese());
        pr.hm.put(p.composition(),p);
        System.out.println(p.composition());

        Pizza p1 = pr.get("CHEESEPaneer");
        System.out.println(p1.cost() + ":" + p1.composition());

        Pizza clone = pr.get("CHEESEPaneer");
        Pizza p2 = new Mushroom(clone);
        System.out.println(p2.cost() + ":" + p2.composition());
    }

}
