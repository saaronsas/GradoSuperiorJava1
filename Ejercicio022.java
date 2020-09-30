/*
 Vector desplazar todos elemnto una pos izq y primero al final
 */

public class Ejercicio022 {
    public static void main(String[] args) {
        int vector[]={10,-20,30,-40,50,60}, aux;    //Inicializamos el vector
        aux=vector[0];                              //A la pos 0 la copiamos a otra var para no eliminarla
        for(int i=0; i<vector.length-1; i++){
            vector[i]=vector[i+1];                  //Movemos las posiciones del vector a la izq
        }                                           //la pos 1 a la 0, la 2 a la 1...
        vector[vector.length-1]=aux;                //Como hemos movido las pos a la izq la ultima pos queda vacia
                                                    //En la ultima pos copiar la pos 0 que esta en la var aux
        System.out.print("Vector:  ");              
        for(int i=0; i<vector.length; i++)
            System.out.print(vector[i]+"  ");
    }
}
