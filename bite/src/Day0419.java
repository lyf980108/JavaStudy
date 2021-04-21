import java.util.Arrays;
import java.util.Scanner;

//class Node{
//    int data;
//    Node next;
//    Node(int n){
//        data = n;
//        next = null;
//    }
//}
public class Day0419 {
//    // 删数
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while(scanner.hasNext()){
//            int num = scanner.nextInt();
//            if(num>999)
//                num = 999;
//            Node head = new Node(0);
//            Node cur = head;
//            for(int i = 1; i<num; i++){
//                cur.next = new Node(i);
//                cur = cur.next;
//            }
//            cur.next = head;
//            while(cur.next!=cur){
//                cur = cur.next.next;
//                head = head.next.next;
//                cur.next = head.next;
//                head = head.next;
//            }
//            System.out.println(cur.data);
//        }
//    }
    // n个数里挑选k个最小的
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            String[] strs = str.split(" ");
            int len = strs.length;
            int[] arr = new int[len-1];
            for (int i = 0; i < len-1; i++) {
                arr[i] = Integer.valueOf(strs[i]);
            }
            int k = Integer.valueOf(strs[len-1]);
            Arrays.sort(arr);
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }
}
