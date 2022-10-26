package 백준.정렬;
import java.util.Arrays;
import java.util.Scanner;

public class 소트인사이드 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr,(o1,o2)->o2.compareTo(o1));
        StringBuffer sb = new StringBuffer();

        for(int i=0;i<arr.length;i++) {
            sb.append(arr[i]);
        }
        System.out.println(sb.toString());

    }
}
