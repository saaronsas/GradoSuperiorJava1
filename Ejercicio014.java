/*
Division con restas
*/

import javax.swing.JOptionPane;

public class Ejercicio014 {
    public static void main(String[] args) {
        
        int num1, num2, result=0;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("x/y  x:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog(num1+"/y  y:"));
        int i=num1;
        
        while(i>=num2){
            i-=num2;
            result++;
        }
        System.out.println("La division es "+result);
    }
}
