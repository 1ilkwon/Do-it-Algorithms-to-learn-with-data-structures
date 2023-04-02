package chap_01;

import java.util.Scanner;

public class chap01_Q13 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        System.out.print("변의 길이: ");
        int num = scan.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
