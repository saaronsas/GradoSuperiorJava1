/*
Sacar mayor de 3 numeros
*/
public class Ejercicio004 {
    public static void main(String arg[]){
        int x=2, y=15, z=0;
        
        if(x > y)
            if(x > z)
                System.out.println("El numero "+x+" es el mayor");
            else
                System.out.println("El numero "+z+" es el mayor");
        else if(y > x)
            if(y > z)
                System.out.println("El numero "+y+" es el mayor");
            else
                System.out.println("El numero "+z+" es el mayor");
                
                
    }
}
