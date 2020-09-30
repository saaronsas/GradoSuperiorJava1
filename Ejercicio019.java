/*
 Cambiar orden vector
 */

public class Ejercicio019 {
    public static void main(String[] args) {
        int vector[]={6,5,4,3,1,2}, aux;
        
        for(int i=0; i<vector.length; i++){
            for(int j=0; j<vector.length-1; j++){
                if(vector[j]>vector[j+1]){
                    aux=vector[j];
                    vector[j]=vector[j+1];
                    vector[j+1]=aux;
                }
            }
        }
        
        /*for(int i=0; i<vector.length/2; i++){
            aux=vector[i];
            vector[i]=vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }*/
        
        
        System.out.print("Vector: ");
        for(int i=0; i<vector.length; i++)
            System.out.print(vector[i]+"  ");
    }
}
