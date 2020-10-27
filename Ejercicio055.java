
import javax.swing.JOptionPane;

/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio055 {
    public static void main(String[] args) {
        int matriz[][]={{1,2,3,4},{5,6,7,8},{9,1,2,0},{2,3,4,5}}, num;
        num=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca su numero","Numero a Multiplicar",JOptionPane.INFORMATION_MESSAGE));
        
        multiplicador(matriz, num);
        for(int matriz1[]: matriz){
            for(int i=0; i<matriz1.length; i++){
                System.out.print("  "+matriz1[i]);
            }
            System.out.println("");
        }
    }
    public static void multiplicador(int[][] matriz, int num){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                matriz[i][j]*=num;
            }
        }
    }
}
