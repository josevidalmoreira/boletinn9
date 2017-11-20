
package boletin9n2;

public class Boletin9n2 {

    public static void main(String[] args) {
        int a=10;
        int asuma=0;
        double aP=1;
        do{
           asuma= asuma +a;
           aP=aP*a;
           a++;
           
        }while(a<=90&&a>=10);
        System.out.println("suma= "+asuma+" producto= "+aP);
    }
    
}
