import java.util.Scanner;

public class Day0414 {
    //计算糖果
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            int a_b = scanner.nextInt();
//            int b_c = scanner.nextInt();
//            int ab = scanner.nextInt();
//            int bc = scanner.nextInt();
//            if((a_b+ab)%2 == 1){
//                System.out.println("NO");
//            }else{
//                int a = (a_b+ab)/2;
//                int b = ab-a;
//                int c = bc-b;
//                System.out.println(a+" "+b+" "+c);
//            }
//        }
//    }
    // 进制转换
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            StringBuffer stringBuffer = new StringBuffer();
            boolean is = M>=0;
            M = Math.abs(M);
            while(M != 0){
                if(M%N>9){
                    char ch = (char)(M%N-10+'A');
                    stringBuffer.append(ch);
                }else{
                    stringBuffer.append(M%N);
                }
                M = M/N;
            }
            if(is)
                System.out.println(stringBuffer.reverse().toString()) ;
            else
                System.out.println("-"+stringBuffer.reverse().toString()) ;
        }
    }
}
