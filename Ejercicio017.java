/*
 Mostrar pantalla valor mas alto del vector
 */

public class Ejercicio017 {
    public static void main(String[] args) {
        int vector[] = {-1, 17, 55, 33, 1, 44}, max=0, pos=0;
        
        for(int i=0; i<vector.length; i++){
            if(vector[i]>max){
                max=vector[i];
                pos++;}
        }
        System.out.println("El numero mas alto del vector es "+max+"\nEsta en la posicion "+pos+" del vector");
    }
}
