
import javax.swing.JOptionPane;

/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio054 {
    public static void main(String[] args) {
        int matriz[][]={{700,900,1300,800,790,850},{1000,900,900,850,724,2300},{9050,1050,1070,700,950,764},{750,2100,900,1020,1005,766}};
        String empleados[]={"Javier","Paco","Martir","Jacinto"};
        
        for(int i=0; i<matriz.length; i++){
            System.out.println("El empleado "+empleados[i]+" ha ganado "+suma(matriz[i],i)+" euros");
        }
    }
    
    public static int suma(int[] vector, int i){
        int suma=0;
        for(int j=0; j<vector.length; j++){
            suma+=vector[j];
        }
        
        return suma;
    }
}
