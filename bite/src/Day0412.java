import java.util.Scanner;

public class Day0412{
    // 排序子序列
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n = scanner.nextInt();
            int[] A = new int[n];
            for(int i = 0 ; i < n ; i++){
                A[i] = scanner.nextInt();
            }

            if(n == 1 || n == 2)
                System.out.println("1");
            else{
                int count = 0;
                int flag = A[1] - A[0];
                for(int i = 1; i < n; i++){
                    if(A[i] > A[i-1]){
                        if(flag == 0)
                            flag = 1;
                        if(flag < 0){
                            count++;
                            flag = 0;
                        }
                    }else if(A[i] < A[i-1]){
                        if(flag == 0)
                            flag = -1;
                        if(flag > 0){
                            count++;
                            flag = 0;
                        }
                    }else
                        continue;
                }
                System.out.println(count+1);
            }

        }
        scanner.close();
    }
    // 倒置字符串
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            String str = scanner.nextLine();
//            String[] sh = str.split(" ");
//            for(int i = sh.length-1; i >=0; i--){
//                if(i == 0)
//                    System.out.print(sh[0]);
//                System.out.print(sh[i]+" ");
//            }
//            System.out.println();
//        }
//    }
}
