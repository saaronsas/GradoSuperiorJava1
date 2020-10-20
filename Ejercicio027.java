/*
 Mostrar tabla de multiplicar 1 al 9
 */

public class Ejercicio027 {
    public static void main(String[] args) {
        for(int i=0; i<=9; i++){
            System.out.println("Tabla Multiplicar "+i+":");
            for(int j=0; j<10; j++)
                System.out.println(j+" * "+i+" = "+i*j);
        }
    }
}
