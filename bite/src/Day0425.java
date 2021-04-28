import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day0425 {
    // 参数解析
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            String str = scanner.nextLine();
//            int count = 0;
//            List<String> list = new ArrayList<>();
//            StringBuffer tmp = new StringBuffer();
//            String[] s = str.split(" ");
//            int i = 0;
//            while(i < s.length){ // 循环遍历每一个字符串
//                if(s[i].charAt(0) == '"' && s[i].charAt(s[i].length()-1) == '"'){
//                    tmp.delete(0,tmp.length());
//                    tmp.append(s[i].substring(1,s[i].length()-1));
//                    count++;
//                    i++;
//                    list.add(tmp.toString());
//                }else if(s[i].charAt(0) == '"'){ // 含有双引号的
//                    tmp.delete(0,tmp.length());
//                    tmp.append(s[i].substring(1));
//                    tmp.append(" ");
//                    i++;
//                    while(i < s.length && s[i].charAt(s[i].length()-1) != '"'){
//                        tmp.append(s[i]);
//                        tmp.append(" ");
//                        i++;
//                    }
//                    if(i != s.length){
//                        tmp.append(s[i].substring(0, s[i].length()-1));
//                        tmp.append(" ");
//                    }
//                    tmp.deleteCharAt(tmp.length()-1);
//                    i++;
//                    count++;
//                    list.add(tmp.toString());
//                }else{
//                    count++;
//                    list.add(s[i]);
//                    i++;
//                }
//            }
//            System.out.println(count);
//            for (String stmp:list) {
//                System.out.println(stmp);
//            }
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(ab(a, b));
        }
    }

    private static int ab(int a, int b) {
        List<Integer> list = yueshu(a);
        int min = -2;
//        System.out.println(list);
        for (int i : list) {
            if(a+i == b)
                return 1;
            else if(a+i > b)
                continue;
            else{
                int tmp = ab(a+i,b);
                if(tmp != -2){
                    if(min == -1)
                        min = tmp;
                    else{
                        min = min>tmp?tmp:min;
                        min+=1;
                    }
                }
            }

        }
        return min+1;
    }

    private static List<Integer> yueshu(int a) {
        List<Integer> list = new ArrayList<>();
        for(int i = a-1; i > 1; i--){
            if(a%i == 0)
                list.add(i);
        }
        return list;
    }

}
