package design.pizzaPrototype;

public enum Prices {
    CHEESE("CHEESE",20),
    THINCRUST("THINCRUST",30);

    int p;
    String val;
    Prices(String val, int p){
        this.p = p;
        this.val = val;
    }

    public int getPrice(){
        return p;
    }

    public String getVal(){
        return val;
    }

    


}
