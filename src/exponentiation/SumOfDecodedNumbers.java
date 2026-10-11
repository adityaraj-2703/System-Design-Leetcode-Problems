package exponentiation;

public class SumOfDecodedNumbers {
    public int sumDecoded(long[] nums) {
        int mod = 1000000007;
        long sum = 0;
        for(int i=0;i<nums.length;i++){
            int w = (int)(nums[i]%10);
            long d = nums[i]/10;
            String t = String.valueOf(d);
            long x = Long.parseLong(t.substring(0,w));
            long y = Long.parseLong(t.substring(w,t.length()));
            long s = find(x,y);
            sum = (sum + s)%mod;
        }
        return (int)(sum%mod);
    }
    public long find(long x,long y){
        long res = 1;
        int mod = 1000000007;
        while(y>0){
            if(y%2==0){
                x = (x*x)%mod;
                y-=2;
            }
            else{
                res = (res*x)%mod;
                y-=1;
                
            }
        }
        return res%mod;
        
    }
    public static void main(String[] args) {
        SumOfDecodedNumbers sdn = new SumOfDecodedNumbers();
        long[] nums = {231};
        System.out.println(sdn.sumDecoded(nums));
    }

}
