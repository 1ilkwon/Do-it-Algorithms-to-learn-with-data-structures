package chap_01;

import java.util.Scanner;

public class chap01_Q16 {
    static void npira(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<n-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<i*2; k++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        npira(num);
    }
}
