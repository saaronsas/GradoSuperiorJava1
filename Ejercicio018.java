/*
 Posicion MAXIMO y minimo
 */

public class Ejercicio018 {
    public static void main(String[] args) {
        int vector[]={1,3,55,42,-3,0,12}, max, min, pMax=0, pmin=0;
        max=vector[0]; min=vector[0];
        
        for(int i=0; i<vector.length; i++){
            if(vector[i]<min){
                min=vector[i];
                pmin=i;
            }
            else if(vector[i]>max){
                max=vector[i];
                pMax=i;
            }               
        }
        System.out.println("El valor maximo del vector es "+vector[pMax]+" y se encuentra en la posicion "+pMax);
        System.out.println("El valor maximo del vector es "+vector[pmin]+" y se encuentra en la posicion "+pmin);
    }
}
