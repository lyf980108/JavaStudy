import java.util.Scanner;

public class Day0418 {
//    //最小公倍数
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            int a = scanner.nextInt();
//            int b = scanner.nextInt();
//            for(int i = 1 ; i <= a ; i++){
//                if((i*b)%a == 0){
//                    System.out.println(i*b);
//                    break;
//                }
//            }
//        }
//    }
    // 不要二
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            System.out.println(Not2(w, h));
        }
    }
    private static int Not2(int w,int h){
        // 计算行
        int heigh = 0;
        if(h<=2){
            heigh = h;
        }else{
            if(h%2 == 0) {
                if(h/2%2 == 0){
                    heigh = h/2;
                }else{
                    heigh = (h-2)/2+2;
                }
            }else{
                if((h-1)/2%2==0)
                    heigh = (h-1)/2+1;
                else
                    heigh = (h-3)/2+2;
            }
        }

        // 计算列
        int weight = 0;
        if(w <= 2){
            weight = w;
        }else{
            if(w%2 == 0) {
                if(w/2%2 == 0){
                    weight = w/2;
                }else{
                    weight = (w-2)/2+2;
                }
            }else{
                if((w-1)/2%2==0)
                    weight = (w-1)/2+1;
                else
                    weight = (w-3)/2+2;
            }
        }
        System.out.println("h>>"+heigh+"w>>"+weight);
        int count = heigh*weight + (h-heigh)*(w-weight);
        return count;
    }
}
