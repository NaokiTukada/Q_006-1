package arugo61;

import java.util.*;

public class Main61B {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> jadge = new ArrayList<>();

        for(int i = 0; i < n * 5; i++){
            int points = sc.nextInt();
            jadge.add(points);
        }
        Collections.sort(jadge);

        jadge.subList(0, n).clear();
        
        int newsize = jadge.size();
        jadge.subList(newsize - n, newsize).clear();

        double sum = 0;

        for(int num: jadge){
            sum += num;
        }
        
        double average = sum / (n * 3);

        System.out.println(average);
        sc.close();

    }
}   
