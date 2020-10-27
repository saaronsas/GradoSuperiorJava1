/*
Manipular funciones
 */

/**
 *
 * @author Infor
 */

public class Ejercicio047 {
    public static void main(String[] args) {
        String palabras;
        escribir();
        hablar("Holaa");
        animalHabla("Me llamo Toby", "Guau, Guau");
        palabras=concatenar("Paco","18 años");
        System.out.println(palabras);
        System.out.println("El resultado de la suma es: "+suma(1,9));
        
    }
    
    public static void escribir() {
        System.out.println("Hola");
    }
    
    public static void hablar(String frase){
            System.out.println(frase);
    }
    
    public static void animalHabla(String frase, String onomatopeya){
        System.out.println(frase+": "+onomatopeya);
    }
    
    public static String concatenar(String frase1, String frase2){
        return frase1+" : "+frase2;
    }
    
    public static int suma(int num1, int num2){
        return num1+num2;
    }
}
