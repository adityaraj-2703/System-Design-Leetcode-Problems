package design;

import java.util.HashMap;
import java.util.Map;

public class BusSeatBookingSystem {
    Map<Integer,Map<Character,Integer>> hm;
    int totalTime = 0;
    int totalBookings = 0;
    public BusSeatBookingSystem(int n) {
        hm = new HashMap<>();
    }
    
    public void toggle(String seat) {
        int sNo = Integer.parseInt(seat.substring(1,seat.length()));
        char c = seat.charAt(0);
        if(hm.containsKey(sNo)){
            if(hm.get(sNo).containsKey(c)){
                totalTime -= hm.get(sNo).get(c);
                totalBookings--;
                hm.get(sNo).remove(c);
                
            }
            else{
                int time = 0;
                if(c=='B' || c=='C'){
                    time = 1;
                }
                else if(c=='A'){
                    if(hm.get(sNo).containsKey('B')){
                        time = 3;
                    }
                    else{
                        time = 1;
                    }
                }
                else if(c=='D'){
                    if(hm.get(sNo).containsKey('C')){
                        time = 3;
                    }
                    else{
                        time = 1;
                    }
                }
                hm.get(sNo).put(c,time);
            }
            
        }
        else{
            Map<Character,Integer> h = new HashMap<>();
            h.put(c,1);
            hm.put(sNo,h);
            totalTime++;
            totalBookings++;
            
        }
        
    }
    
    public int getTotalTime() {
        return totalTime;
    }
    
    public int getMinTime() {
        return totalBookings;
    }
    public static void main(String[] args) {
        BusSeatBookingSystem b = new BusSeatBookingSystem(5);       
        b.toggle("A1");
        b.toggle("B1");
        System.out.println(b.getTotalTime());
        System.out.println(b.getMinTime());
    }
}
