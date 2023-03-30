package chap_01;

public class chap01_Q03 {
    static int min4(int a, int b, int c, int d){
        int min = a;
        if(b < min){
            min = b;
        }
        if(c < min){
            min = c;
        }
        if(d < min){
            min = d;
        }
        return min;
    }
}
