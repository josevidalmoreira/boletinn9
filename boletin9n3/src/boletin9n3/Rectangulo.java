
package boletin9n3;
import java.util.Scanner;
public class Rectangulo {
   float area,base,altura;
   Scanner sc = new Scanner(System.in);
   public float getBase(){
       do{
   System.out.println("teclea la base");
   base=sc.nextFloat();
       }while(base<0);
    return base;
}
   public float getAltura(){
       do{
   System.out.println("teclea altura");
   altura=sc.nextFloat();
       }while(altura<0);
   return altura;
   }
   public float Calculararea(){
   
    area= getBase()*getAltura();


   return area;
}



}
