package design;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class StockPrice {
    Map<Integer,Integer> hm;
    PriorityQueue<int[]> min;
    PriorityQueue<int[]> max;
    int latest;
    int latestVal;
    public StockPrice() {
        hm = new HashMap<>();
        min = new PriorityQueue<>((m1,m2)->m1[1] - m2[1]);
        max = new PriorityQueue<>((m1,m2)->m2[1] - m1[1]);
    }
    
    public void update(int timestamp, int price) {
        
        hm.put(timestamp,price);
        if(timestamp>latest){
            latest = timestamp;
        }
        max.add(new int[]{timestamp,price});
        min.add(new int[]{timestamp,price});
        
        
    }
    
    public int current() {
        return hm.get(latest);
    }
    
    public int maximum() {
        if(max.isEmpty()){
            return -1;
        }
        int[] t = max.peek();
        while(hm.get(t[0])!=t[1]){
            max.poll();
            t = max.peek();
            // m[1] = hm.get(m[0]);
            // max.add(m);
        }
        return t[1];
    }
    
    public int minimum() {
        int[] t = min.peek();
        while(hm.get(t[0])!=t[1]){
            min.poll();
            t = min.peek();
            // m[1] = hm.get(m[0]);
            // min.add(m);
        }
        return t[1];
    }

    
    public static void main(String[] args) {
        StockPrice sp = new StockPrice();
        sp.update(1,10);
        sp.update(2,5);
        System.out.println(sp.current());
        System.out.println(sp.maximum());
        System.out.println(sp.minimum());
        sp.update(1,3);
        System.out.println(sp.maximum());
        System.out.println(sp.minimum());
    }
}

/**
 * Your StockPrice object will be instantiated and called as such:
 * StockPrice obj = new StockPrice();
 * obj.update(timestamp,price);
 * int param_2 = obj.current();
 * int param_3 = obj.maximum();
 * int param_4 = obj.minimum();
 */
