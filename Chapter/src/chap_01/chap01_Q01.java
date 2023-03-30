package chap_01;

public class chap01_Q01 {
    static int max4(int a, int b, int c, int d){
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }
        if(d > max){
            max = d;
        }
        return max;
    }
}
