/*
3*4 suma filas y columnas
 */

public class Ejercicio031 {
    public static void main(String[] args) {
        int matriz[][]={{10,20,-30,40},{50,60,-70,80},{90,100,-110,-120}}, filas[]=new int[matriz.length], columnas[]=new int[matriz[0].length];
        
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                columnas[j]+=matriz[i][j];
                filas[i]+=matriz[i][j];
            }
        }
        System.out.print("Suma Filas:     ");
        for(int i=0; i<filas.length; i++){
            System.out.print("  "+filas[i]);
        }
        System.out.print("\nSuma Columnas: ");
        for(int i=0; i<columnas.length; i++){
            System.out.print("  "+columnas[i]);
        }
        System.out.println("");
    }
}
