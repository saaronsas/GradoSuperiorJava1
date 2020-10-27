/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio051 {
    public static void main(String[] args) {
        int vector[]={31,25,54,68,79,96,45,10};
        
        ordenar(vector);
        for(int vector1: vector){
            System.out.print("  "+vector1);
        }
        System.out.println("");
    }
    
    public static void ordenar(int[] vector){
        int aux;
        for(int vector1: vector){
            for(int i=0; i<vector.length-1; i++){
                if(vector[i]>vector[i+1]){
                    aux=vector[i];
                    vector[i]=vector[i+1];
                    vector[i+1]=aux;
                }
            }
        }
    }
}
