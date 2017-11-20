
package boletin9n5;
import java.util.Scanner;

public class Boletin9n5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c=0,n1=1,n2=1,u,v1,v2;
        a=sc.nextInt();
        b=a;
        do{
               System.out.println(c);
           c=c+2;
          
           b--;        
        }while(b>0);
        
        u=sc.nextInt();
        do{
            if(n1%2==0)
                v2=n1+n2;
                else
            v1=n1+n2;System.out.println("+"+n1);
            
            System.out.println(n1);            
                  
            u--;        
        }while(u>0);
        
    }
    
}
