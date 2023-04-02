package chap_01;

import java.util.Scanner;

public class chap01_Q06 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n의 값: ");
        int n = scan.nextInt();

        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        System.out.println("i의 값은 ?"+ i);
        System.out.println("1부터 "+ n +"까지의 합은 " + sum + "입니다.");
    }
}
