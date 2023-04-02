package chap_01;

import java.util.Scanner;


public class chap01_Q10 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("양의 정수 : ");
        int num = scan.nextInt();
        System.out.println("그 수는 "+ (int)( Math.log10(num)+1 ) +"자리입니다.");
    }
}
