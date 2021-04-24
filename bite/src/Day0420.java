import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Day0420 {
    public static void main(String[] args) {
        //((Day0420)null).test();

//        int i = 0;
//        Integer j = new Integer(0);
//        System.out.println(i==j);
//        System.out.println(j.equals(i));

//        String x = "fmn";
//        x.toUpperCase();
//        System.out.println(x);
//        String y = x.replace('f','F');
//        y+="wxy";
//        System.out.println(y);

        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            reverseNumber(n);
        }
    }
    public static void test(){
        System.out.println("test");
    }
    // 末尾0的个数
    public static void number_0(int n){
//        // 求n！
//        long sum = 1;
//        for(int i = 1; i <= n; i++){
//            sum*=i;
//        }
//        int count = 0;
//        while(sum%10 == 0){
//            count++;
//            sum/=10;
//        }
//        System.out.println(count);
        int count = 0;
        while(n>0){
            count+=n/5;
            n/=5;
        }
        System.out.println(count);
    }
    // 数字颠倒
    public static void reverseNumber(int num){
        Queue<Integer> queue = new ArrayDeque<>();
        //Stack<Integer> queue = new Stack<>();
        while(num!=0){
            queue.offer(num%10);
            num/=10;
        }
        StringBuffer stringBuffer = new StringBuffer();
        while(!queue.isEmpty()){
            stringBuffer.append(queue.poll());
        }
        System.out.println(stringBuffer.toString());
    }
}
