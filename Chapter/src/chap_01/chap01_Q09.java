package chap_01;

import java.util.Scanner;

public class chap01_Q09 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("a값 : ");
        int a = scan.nextInt();
        System.out.print("b값 : ");
        int b = scan.nextInt();
        if(a >= b){
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b값 : ");
            b = scan.nextInt();
        }
        System.out.println("b-a는 "+(b-a)+"입니다.");
    }
}
