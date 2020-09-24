/*
 Variaciones de x elementos por y elementos
 */
import javax.swing.JOptionPane;

public class Ejercicio013 {
    public static void main(String[] args) {
        
        int num1, num2,result=1;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el Primer Fcatorial"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el Segundo Fcatorial"));
        
        /*for(int i=1; i<=num1; i++)
            acu1*=i;
        for(int i=1; i<=num2; i++)
            acu2*=i;
        
        result = acu1/acu2;
        System.out.println("Su variacion es "+result);*/
        
        if(num2>num1){
            int aux=num1;
            num1=num2;
            num2=aux;
        }
        for(int i=num1; i>num2; i--)
            result*=i;
        
        System.out.println("Su variacion es "+result);
        System.out.printf("Su variacion es %d",result);
        
    }
}
