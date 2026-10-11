package design;

import java.util.ArrayList;
import java.util.List;

public class AmazonLock {
    
    List<Compartment> compartments = new ArrayList<>();
    public Compartment assignLocker(String size){
        Size t = Size.valueOf(size);
        int v = t.val;
        for(int i=v;i<=3;i++){
            for(Compartment c : compartments){
                if(c.getSize()==v){
                    return c;
                }
            }
        }
        return null;
    }

}

class Compartment{
    Size size;
    CompartmentStatus cstatus;

    public int getSize(){
        return this.size.val;
    }

}

enum CompartmentStatus{
    AVAILABLE,
    OCCUPIED,
    MAINTENENCE
}

enum Size{
    SMALL(1),
    MEDIUM(2),
    LARGE(3);


    int val;
    Size(int val){
        this.val = val;
    }
}
