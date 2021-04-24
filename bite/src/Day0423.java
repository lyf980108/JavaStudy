import java.util.Scanner;

public class Day0423 {
    public static void main(String[] args) {
//        binInsert(1024,19,2,6);
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int num = scanner.nextInt();
            int left = 1;
            int right = num-1;
            int l = left;
            int r = right;
            while(left <= right){
                if(isPrime(left) && isPrime(right)){
                    l = left;
                    r = right;
                }
                left++;
                right--;
            }
            System.out.println(l);
            System.out.println(r);
        }
    }

    private static boolean isPrime(int left) {
        for(int i = 2; i <= Math.sqrt(left); i++){
            if(left%i == 0)
                return false;
        }
        return true;
    }

    // 二进制插入
    public static int binInsert(int n, int m, int j, int i) {
        int result = 0;
        StringBuffer str = new StringBuffer(Integer.toBinaryString(n));
        StringBuffer desc = new StringBuffer(Integer.toBinaryString(m));
        str.replace(str.length()-i-1,str.length()-j,desc.toString());
        for(int t = 0 ; t < str.length(); t++){
            if(str.charAt(t) == '1')
                result=result*2+1;
            else
                result=result*2;
        }
//        System.out.println(result);
        return result;
    }

}
