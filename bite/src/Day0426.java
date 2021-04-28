import java.util.Arrays;
import java.util.Scanner;

public class Day0426 {
    // 幸运的袋子
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int[] arr = new int[num];
            for(int i = 0 ; i < num ; i++){
                arr[i] = scanner.nextInt();
            }
            Arrays.sort(arr);
            int count = 0;
            for(int i = num-1; i>0; i--){
                if(isLucky(arr,i))
                    count++;
            }
            System.out.println(count);
        }
    }

    private static boolean isLucky(int[] arr, int end) {
        int sum = 0;
        int cal = 1;
        for(int i = 0 ; i <= end; i++){
            sum+=arr[i];
            cal*=arr[i];
        }
        return sum > cal;
    }

//    // 计算日期到天数转换
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            int year = scanner.nextInt();
//            int month = scanner.nextInt();
//            int day = scanner.nextInt();
//
//            if(month > 12 || day > 31){
//                System.out.println(-1);
//                continue;
//            }
//            int number = 0;
//            if((year%4 == 0 && year%100!=0) || year%400 == 0){
//                switch(month-1)
//                {
//                    case 11:
//                        number+=30;
//                    case 10:
//                        number+=31;
//                    case 9:
//                        number+=30;
//                    case 8:
//                        number+=31;
//                    case 7:
//                        number+=31;
//                    case 6:
//                        number+=30;
//                    case 5:
//                        number+=31;
//                    case 4:
//                        number+=30;
//                    case 3:
//                        number+=31;
//                    case 2:
//                        number+=29;
//                    case 1:
//                        number+=31;
//                }
//            }else{
//                switch(month-1)
//                {
//                    case 11:
//                        number+=30;
//                    case 10:
//                        number+=31;
//                    case 9:
//                        number+=30;
//                    case 8:
//                        number+=31;
//                    case 7:
//                        number+=31;
//                    case 6:
//                        number+=30;
//                    case 5:
//                        number+=31;
//                    case 4:
//                        number+=30;
//                    case 3:
//                        number+=31;
//                    case 2:
//                        number+=28;
//                    case 1:
//                        number+=31;
//                }
//            }
//            number+=day;
//            System.out.println(number);
//        }
//    }
}
