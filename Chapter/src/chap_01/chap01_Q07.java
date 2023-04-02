package chap_01;

import java.util.Scanner;

public class chap01_Q07 {
    static int gauss(int n, int m){
        int sum = 0;
        if((n+m) %2 == 0) {
            sum = (n + m) * (m / 2) + (n+m)/2;
        }else{
            sum = (n + m) * (m / 2);
        }
        return sum;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("두 정수를 입력하세요.");
        System.out.println("정수 1 : ");
        int a = scan.nextInt();
        System.out.println("정수 2 : ");
        int b = scan.nextInt();
        System.out.println("두 정수 사이의 총 합 : " + gauss(a,b));

    }
}
