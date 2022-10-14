public class LeetCode_1079 {
    public static void main(String[] args) {
        String s="ABAC";
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'A']++;
        }
        System.out.println(fun(freq,""));
    }
    public static int fun(int[] freq,String ans){
        System.out.println(ans);
        int c=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]>=1){
                char ch=(char)(i+'A');
                freq[i]--;
                c=c+fun(freq,ans+ch)+1;
                freq[i]++;
            }
        }
        return c;
    }
}
