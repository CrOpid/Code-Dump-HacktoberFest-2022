public class Queen_Combination {
    public static void main(String[] args) {
        int n=4;
        int tq=2;
        boolean[] board=new boolean[n];
        System.out.println("Combinations");
        print_comb(board,tq,0,"",0);
    }
    public static void print_comb(boolean[] board,int tq,int qpsf,String ans,int j){
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=j;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                print_comb(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
                board[i]=false;
            }
        }
    }
}
