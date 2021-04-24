import java.util.Scanner;

public class Day0422 {
//    // 最近公共祖先
//    public static int getLCA(int a, int b) {
//        while(true){
//            while(a > b){
//                a/=2;
//            }
//            if(a == b)
//                return a;
//            while(b > a){
//                b/=2;
//            }
//        }
//    }
    // 求最大连续bit数
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            byte num = scanner.nextByte();
            int count = 0;
            boolean is = true;
            int max = 0;
            for(int i = 0; i < 8 ; i++){
                if(num%2 == 1){
                    if(is)
                        count++;
                    else
                        count = 1;
                }else{
                    if(is){
                        is = false;
                        max = max>count?max:count;
                    }
                }
                num = (byte)(num >>> 1);
                System.out.println(Integer.toBinaryString(num));
            }
            System.out.println(count);
        }
    }
}

/*
import java.util.Scanner;

public class exam12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            System.out.println(seqByte(num));
        }


        scanner.close();
    }

    public static int seqByte(int n) {
        //方法一
        int count = 0;
        int max = 0;
        while (n > 0) {
            int x = n & 0x1;
            if (x == 1) {
                count++;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 0;
            }
            n = n >> 1;
        }
        return max;
    }
*/
