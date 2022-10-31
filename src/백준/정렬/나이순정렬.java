package 백준.정렬;

import java.util.Arrays;
import java.util.Scanner;
public class 나이순정렬 {

    public static void main(String[] args) {
        나이순정렬 main = new 나이순정렬();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] people = new Person[n];
        for (int  i = 0; i < n; i++) {
            people[i] = main.new Person(sc.nextInt(), sc.next());
        }

        Arrays.sort(people);
        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].getAge() +" " + people[i].getName());
        }
    }
    class Person implements Comparable<Person>{
        int age;
        String name;
        Person(int age, String name){
            this.age = age ;
            this.name = name;
        }
        @Override
        public int compareTo(Person o) {
            if(this.age > o.age) return o.age- this.age ;
            return o.name.compareTo(this.name);
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }


    }
}
