public class Queen_permutation {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        System.out.println("Permutations");
        print_per(board,tq,0,"");
    }

    public static void print_per(boolean[] board,int tq,int qpsf,String ans){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                print_per(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
                board[i]=false;
            }
        }
    }
