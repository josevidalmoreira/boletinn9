
package boletin9n4;
import java.util.Scanner;

public class Boletin9n4 {


    public static void main(String[] args) {
        int n,p,cont=10;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        do{
         
         p=n*cont;
         System.out.println(n+"*"+cont+"= "+p);
         cont--;
        }while(cont>0);
    }
    
}
