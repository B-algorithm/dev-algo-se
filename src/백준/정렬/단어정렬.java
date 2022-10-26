package 백준.정렬;

import java.util.*;

public class 단어정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<String> strList = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) return 1;
                else if(o1.length() < o2.length()) return -1;
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < n; i++) {
            strList.add(sc.next());
        }

        for(String x : strList) {
            System.out.println(x);
        }
    }

}
