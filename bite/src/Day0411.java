import java.util.Arrays;
import java.util.Scanner;

public class Day0411 {
    // 组队竞赛
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            scanner.nextLine();
            int[] number = new int[3*n];
            for(int i = 0; i < 3*n; i++){
                number[i] = scanner.nextInt();
            }
            sumMax(n,number);
        }
    }

    private static void sumMax(int n, int[] number) {
        Arrays.sort(number);
        int sum = 0;
        for(int i = 3*n-2; i >= n; i-=2){
            sum+=number[i];
        }
        System.out.println(sum);
    }


    // 删除第一个字符串中在第二个字符串中出现的字符
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            String src = scanner.nextLine();
//            String desc = scanner.nextLine();
//            delete(src,desc);
//        }
//    }
//
//    private static void delete(String src, String desc) {
//        Set<Character> set = new LinkedHashSet<>();
//        for(int i = 0;i<desc.length(); i++){
//            set.add(desc.charAt(i));
//        }
//        StringBuffer stringBuffer = new StringBuffer();
//        char[] srcch = new char[src.length()];
//        int size = 0;
//        for(int i = 0 ; i  < src.length(); i++){
//            if(!set.contains(src.charAt(i)))
//                stringBuffer.append(src.charAt(i));
//        }
//        System.out.println(stringBuffer.toString());
//    }
}
