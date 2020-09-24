/*
Mostrar el mayor de estos dos numeros
*/

public class Ejercicio002 {
    public static void main(String arg[]){
        
        int x, y;
        x = 15;
        y = 44;
        
        if(x > y)
            System.out.println("El mayor es : "+x);     //Si solo madas una instruaccion no hace falta las llaves
        else{
            System.out.println("El mayor es : "+y);     //Si contiene 2 o mas intrucciones necesita llaves
            System.out.println("El mayor es : "+y);
        }
        
        
        
    }
    
}
