package chap_01;

import java.util.Scanner;

public class chap01_Q14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        triangleLB(num);
    }
    static void triangleLB(int n){
        System.out.println("직각이등변삼각형의 길이를 입력하세요.");
        System.out.print("길이 : ");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
