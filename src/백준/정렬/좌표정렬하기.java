package 백준.정렬;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 좌표정렬하기 {

    public static void main(String[] args) {
        좌표정렬하기 cd = new 좌표정렬하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Value> list= new ArrayList<좌표정렬하기.Value>();
        for (int i = 0; i < n; i++) {
            list.add( cd.new Value(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(list);
        for(Value v : list) {
            System.out.println(v.x +" " + v.y);
        }
    }

    class Value implements Comparable<Value>{
        int x ;
        int y;
        Value(int x, int y) {
            this.x=x;
            this.y = y;
        }
        @Override
        public int compareTo(Value o) {
            if(this.x > o.x ) return 1;
            else if(this.x==o.x && this.y > o.y) return 1;
            return -1;
        }
    }
}
