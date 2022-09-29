package actividad.pkg7;
import java.util.Scanner;
public class NumPrimos {
    
   public int [] i = new int [100];
   
   public void Num(){
       for (int i = 0; i<100; i++){
           if (i%2==0){
               continue;
               
           }
           System.out.println(String.valueOf(i)+ ", ");
       }
       
   }
    
}
