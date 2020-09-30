/*
Media vector
 */

public class Ejercicio021 {
    public static void main(String[] args) {
        float vector[]={10,-20,30,-40,50,60,73}, media=0;
        
        for(int i=0; i<vector.length; i++)
            media+=vector[i];
        
        System.out.println("La media del vector es "+media/(vector.length+1));
        
    }     
}

/*
Vector desplazar todos elemnto una pos izq y primero al final
*/