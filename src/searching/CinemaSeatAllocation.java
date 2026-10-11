package searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CinemaSeatAllocation {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,List<Integer>> hm = new HashMap<>();
        for(int i=1;i<=n;i++){
            List<Integer> li = new ArrayList<>();
            li.add(0);
            li.add(11);
            hm.put(i,li);

        }
        for(int i=0;i<reservedSeats.length;i++){
            List<Integer> li = hm.get(reservedSeats[i][0]);
            int ind = find(reservedSeats[i][1],li);
            li.add(ind+1,reservedSeats[i][1]);
            hm.put(reservedSeats[i][0],li);
        }
        int sum = 0;
        for(Map.Entry<Integer,List<Integer>> m : hm.entrySet()){
            int prev = 0;
            List<Integer> li = m.getValue();
            for(int i=0;i<li.size();i++){
                if(li.get(i) - prev >=4){
                    sum += (li.get(i) - prev ) / 4;
                }
                prev = li.get(i);
            }
        }
        return sum;
    }
    public int find(int t,List<Integer> li){
        int l = 0;
        int r = li.size()-1;
        int ans = -1;
        while(l<=r){
            int m = (l + r)/2;
            if(li.get(m)<=t){
                ans = m;
                l = m+1;
            }
            else{
                r = m-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        CinemaSeatAllocation csa = new CinemaSeatAllocation();
        int[][] reservedSeats = {{1,2},{1,3},{1,8},{2,6},{3,1},{3,10}};
        System.out.println(csa.maxNumberOfFamilies(3, reservedSeats));
    }

}
