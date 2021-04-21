import java.util.HashMap;
import java.util.Map;

public class Day0413 {
//    // 字符串中找出连续最长的数字串
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            String str = scanner.next();
//            int count = 0;
//            int front = 0;
//            String tmp = "";
//            StringBuffer stringBuffer = new StringBuffer();
//            for(int i = 0 ; i < str.length(); i++){
//                while(i < str.length() && str.charAt(i)>='0' && str.charAt(i)<='9') {
//                    stringBuffer.append(str.charAt(i));
//                    i++;
//                    front++;
//
//                }
//                if(front > count){
//                    count = front;
//                    tmp = stringBuffer.toString();
//                }
//                else{
//                    front = 0;
//                    stringBuffer.delete(0,stringBuffer.capacity()-1);
//                }
//            }
//            System.out.println(tmp);
//        }
//    }
    // 数组中出现次数超过一半的数字
    public static int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            if(map.containsKey(array[i])){
                map.put(array[i], map.get(array[i]) + 1);
//                if( map.get(array[i]) > len/2)
//                    return array[i];
            }else{
                map.put(array[i], 1);
            }
        }
        for (int key:map.keySet()) {
            if(map.get(key) > len/2)
                return key;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(MoreThanHalfNum_Solution(arr));
    }

}
