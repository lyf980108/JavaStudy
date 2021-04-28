import java.util.*;

public class Day0427 {
//    // 查找输入整数的二进制中1的个数
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            int num = scanner.nextInt();
//            String str = Integer.toBinaryString(num);
//            int count = 0;
//            for(int i = 0 ; i < str.length(); i++){
//                if(str.charAt(i) == '1')
//                    count++;
//            }
//            System.out.println(count);
//        }
//    }
    // 手套
    public static int findMinimum(int n, int[] left, int[] right) {
        List<Integer> leftlist = new ArrayList<>();
        List<Integer> rightlist = new ArrayList<>();


        int leftcount = 0;
        int rightcount = 0;
        int num = n;
        for(int i = 0;i < n;i++){
            if(left[i] == 0 && right[i] == 0){
                num--;
            }else if(left[i] == 0 && right[i] != 0){
                rightcount+=right[i];
                num--;
            }else if(right[i] == 0 && left[i] != 0){
                leftcount+=left[i];
                num--;
            }else{
                leftlist.add(left[i]);
                rightlist.add(right[i]);
            }
        }
        leftlist.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)
                    return 1;
                else if(o1<o2)
                    return -1;
                else
                    return 0;
            }
        });
        rightlist.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2)
                    return 1;
                else if(o1<o2)
                    return -1;
                else
                    return 0;
            }
        });

        int l = 0;
        int r = 0;
        for(int i = 1; i < num; i++){
            l+=leftlist.get(num-i);
            r+=rightlist.get(num-i);
        }
        if(l > r){
            leftcount +=1;
            rightcount+=r+1;
        }else{
            rightcount+=1;
            leftcount+=l+1;
        }
        return rightcount+leftcount;
    }

    public static void main(String[] args) {
        int[] a = {1,2,0,1,3,1};
        int[] b = {0,0,0,2,0,1};
//        6,[1,2,0,1,3,1],[0,0,0,2,0,1]
        System.out.println(findMinimum(6, a, b));
    }
}
