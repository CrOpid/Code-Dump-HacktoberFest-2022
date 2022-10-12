package RecursionAndBacktracking;

import java.util.ArrayList;
import java.util.Scanner;

public class subsequenceWithKSum {
    public static void print(int index,int[] arr, ArrayList<Integer>l,int sum,int res)
    {
        if(index==arr.length)
        {
            if(res==sum)
            {
                System.out.println(l);
            }
            return;
        }
        l.add(arr[index]); //take
        res = res + arr[index];
        print(index+1,arr,l,sum,res);
        l.remove(l.size()-1); //not take
        res=res-arr[index];
        print(index+1,arr,l,sum,res);
    }
  public static void main(String[] args)
  {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < n; i++)
          arr[i] = sc.nextInt();
      int sum=sc.nextInt();
      ArrayList<Integer> l=new ArrayList<>();
      print(0,arr,l,sum,0);
  }
}