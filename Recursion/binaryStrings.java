package RecursionAndBacktracking;

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;

class binaryStrings {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        solve(len);
    }

    static void solve(int len)
    {
        if(len<=0)
            return;

        char[] ch = new char[len];
        ch[0]='0';
        generate(len,ch,1);
        ch[0]='1';
        generate(len,ch,1);
    }

    static void generate(int len, char[]ch, int n)
    {
        if(n==len)
        {
            System.out.print(toString(ch)+"  ");
            return;
        }

        if(ch[n-1]=='0')
        {
            ch[n]='0';
            generate(len,ch,n+1);
            ch[n]='1';
            generate(len,ch,n+1);
        }
        if(ch[n-1]=='1')
        {
            ch[n]='0';
            generate(len,ch,n+1);
            ch[n]='1';
            generate(len,ch,n+1);

        }

    }
    static String toString(char[]ch)
    {
        return new String(ch);

    }
}