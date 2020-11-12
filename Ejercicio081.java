/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio081 {
    public static void main(String[] args) {
        String frase="En un lugar de la mancha, de cuyo nombre no quiero acordarme";
        int cont=0;
        
        for(int i=0; i<frase.length(); i++){
            if(frase.charAt(i)=='a')
                cont++;
        }

        System.out.printf("La letra a aparece %d veces\n",cont);
    }
}
