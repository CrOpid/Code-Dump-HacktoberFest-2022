public class Coins_permutation {


    public static void main(String[] args) {
        int[] coins=new int[]{2,3,5,7};
        int t=10;
        print(coins,t,"");
    }
    public static void print(int[] coins,int t,String ans){
        if(t<=0){
            if(t==0)
                System.out.println(ans);
            return;
        }
        for(int i=0;i<coins.length;i++){

//          No backtracking req if simple call like
//          print(coins,t-coins[i],ans+coins[i]);

//          Now, here backtracking is req

            t-=coins[i];
            print(coins,t,ans+coins[i]);
            t+=coins[i];
        }
    }
}
