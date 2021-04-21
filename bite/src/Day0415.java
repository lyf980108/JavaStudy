import java.util.Scanner;

public class Day0415 {
//    // 统计回文
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            String A = scanner.nextLine();
//            String B = scanner.nextLine();
//            int count = 0;
//            for(int i = 0; i <= A.length(); i++){
//                if(isPalindromes(A,B,i))
//                    count++;
//            }
//            System.out.println(count);
//        }
//    }
//    private static boolean isPalindromes(String A, String B, int i){
//        StringBuffer aBuffer = new StringBuffer(A);
//        aBuffer.insert(i,B.toCharArray());
//        int left = 0;
//        int right = aBuffer.length()-1;
//        while(left<right){
//            if(aBuffer.charAt(left) == aBuffer.charAt(right)){
//                left++;
//                right--;
//            }else{
//                return false;
//            }
//        }
//        return true;
//    }

    // 连续最大和(答案不完整)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i = 0 ; i < n; i++){
                arr[i] = scanner.nextInt();
            }
            int max = arr[0];
            for(int i = 0; i < n; i++){
                int sum = 0;
                for(int j = i; j < n; j++){
                    sum+=arr[j];
                    if(max < sum)
                        max = sum;
                }
            }
            System.out.println(max);
        }
    }
}
