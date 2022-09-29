
package actividad.pkg7;


public class Fibonacci {
    
    public int [] i = new int [100];
    int a=1;
    int x=0;
    int y=0;
    
    public void Fibonacci(){
        
        for (int i=0; i<100;i++){
            System.out.println(String.valueOf(y)+ ", ");
            x=y;
            y=a;
            a=x+y;
        }
        
    }
    
}
