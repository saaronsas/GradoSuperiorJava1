
import javax.swing.JOptionPane;

/*
Combinaciones
 */

/**
 *
 * @author Infor
 */
public class Ejercicio053 {
    public static void main(String[] args) {
        int num1, num2;
        num1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su primer numero", "Numero 1"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Introduzca su segundo numero", "Numero 2"));
        
        System.out.println((factorial(num1)*factorial(num1-num2))/factorial(num2));
        
    }
    public static int factorial(int num){
        int acu=1;
        for(int i=1; i<=num; i++){
            acu*=i;
        } 
        return acu;
    }
}
