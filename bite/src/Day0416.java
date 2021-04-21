import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class node{
    public int x;
    public int y;
    node(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class Day0416 {
    // 不要二(看0418的代码)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int w = scanner.
                    nextInt();
            int h = scanner.nextInt();
            System.out.println(Not2(w, h));
        }
    }
    private static int Not2(int w,int h){
        int[][] arr = new int[h][w];
        int count = 0;
        Queue<node> A = new LinkedList<>();
        Queue<node> B = new LinkedList<>();
        A.offer(new node(0,0));
        for(int x = 0; x < h; x++){
            for(int y = 0; y < w; y++){
                if(x == 0 && y==0)
                    continue;
                boolean t = true; //表示可以添加
                while(!A.isEmpty()){
                    node tmp = A.poll();
                    B.offer(tmp);
                    if((x-tmp.x)*(x-tmp.x)+(y-tmp.y)*(y-tmp.y) == 4){
                        while(!A.isEmpty()){
                            B.offer(A.poll());
                        }
                        t = false;
                    }
                }
                if(t)
                    B.offer(new node(x,y));
                Queue<node> tt = A;
                A = B;
                B = tt;
            }
        }
        return A.size();
    }
//    // 把字符串转成整数
//    public static int StrToInt(String str) {
//        if("".equals(str)){
//            return 0;
//        }
//        int flag = 1;
//        int front = 0;
//        if(str.charAt(0) == '-') {
//            flag = -1;
//            front = 1;
//        }
//        if(str.charAt(0) == '+'){
//            front = 1;
//        }
//        int number = 0;
//        for(int i = front; i < str.length(); i++){
//            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
//                number *= 10;
//                number += str.charAt(i)-'0';
//            }else
//                return 0;
//        }
//        return flag*number;
//    }
}
