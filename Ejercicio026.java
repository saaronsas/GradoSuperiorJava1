/*
Multiplicar vector por vector 
 */

public class Ejercicio026 {
    public static void main(String[] args) {
        int vector[]={10,-20,30,-40,50,60};
        int multiplo[]={3,5,7};
        
        for(int i=0; i<multiplo.length; i++){
            System.out.print("Desplazamiento "+(i+1)+":  ");
            for(int j=0; j<vector.length; j++){
                System.out.print(vector[j]*multiplo[i]+"  ");
            }
            System.out.println("");
        }
        
    }
}
