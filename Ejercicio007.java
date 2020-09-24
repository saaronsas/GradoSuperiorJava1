/*
Dados dos numeros calcular si uno es multiplo de otro o no
*/

public class Ejercicio007 {
    public static void main(String arg[]){
        
        int x=10, y=20;
        
        if(x%y==0)
            System.out.println("El numero "+x+" es dibisible para "+y);
        else if(y%x==0)
            System.out.println("El numero "+y+" es dibisible para "+x);
        else
            System.out.println("El numero "+x+" no es dibisible para "+y+" ni vicebersa");
        
    }
}
