package slidingwindow;

public class LongestSubstringWithAtLeastKRepChars {
    public int longestSubstring(String s, int k) {
        
        
        int max = 0;
        for(int i=0;i<s.length();i++){
            int[] f = new int[26];
            for(int j=0;j<=i;j++){
                f[s.charAt(j)-'a']++;
                if(check(f,k)){
                    max = Math.max(max,i-j+1);
                }
            }
        }
        return max;
    }
    public boolean check(int[] f,int k){
        for(int i=0;i<26;i++){
            if(f[i]>0 && f[i]<k){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        LongestSubstringWithAtLeastKRepChars lswakrc = new LongestSubstringWithAtLeastKRepChars();
        String s = "ababbc";
        int k = 2;
        System.out.println(lswakrc.longestSubstring(s,k));
    }

}
