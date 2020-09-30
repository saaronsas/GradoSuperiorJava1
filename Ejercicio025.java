/*
Bucles anidados desplazamientso vectores
 */

public class Ejercicio025 {
    public static void main(String[] args) {
        int vector[]={10,-20,30,-40,50,60}, aux;
        
        for(int i=0; i<vector.length; i++){
            System.out.print("Despalzamiento "+(i+1)+"  ");
            aux=vector[vector.length-1];
            for(int j=vector.length-1; j>0; j--){
                vector[j]=vector[j-1];
            }
            vector[0]=aux;
            for(int z=0; z<vector.length; z++)
                System.out.print(vector[z]+"  ");
            System.out.println("");
        }
    }
}
