import java.util.Scanner;

public class Day0421 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int front = 1;
            int end = 1;
            int fib = front + end;
            while(true){
                if(end <= num && fib >= num){
                    System.out.println(num-end>fib-num?fib=num:num-end);
                    break;
                }
                front = end;
                end = fib;
                fib = front+ end;
            }
        }
    }
//    public static void main(String[] args) {
//        System.out.println(countWays(2, 2));
//    }
//    public static int countWays(int row, int col) {
//        // write code here
//        return calNumber(row,col,0,1)+calNumber(row,col,1,0);
//    }
//
//    private static int calNumber(int row, int col, int x, int y) {
//        int i = 0;
//        if(x+1 == row && y+1 == col)
//            return 1;
//        if(x+1 < row)
//            i+=calNumber(row,col,x+1,y);
//        if(y+1 < col)
//            i+=calNumber(row,col,x,y+1);
//        return i;
//    }
}
