package chap_01;

import java.util.Scanner;

public class chap01_Q15 {
    static void spira(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<i*2+1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        spira(num);
    }
}
