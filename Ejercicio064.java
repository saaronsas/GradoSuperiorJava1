/*
 * Dos cadenas caracteres, un entero numero veces se repite la subcadena en adena principal
 */

/**
 *
 * @author Infor
 */
public class Ejercicio064 {
    public static void main(String[] args) {
        char[] cadena1={'a','L','a','a','L','a','x','a','L','a','a','L','a','a','L','a','a','L','a'}, cadena2={'a','L','a'};
        
        System.out.println("El numero de repeticiones es de "+veces(cadena1, cadena2));
    }
    
    public static int veces(char[] frase1, char[] frase2){
        int acu=0, num=0;
        
        for(int i=0; i<=frase1.length-frase2.length; i++){
            if(frase1[i]==frase2[0]){
                int j=1; 
                while((j<frase2.length) && (frase2[j]==frase1[j+i]))
                    j++;
                if(j==frase2.length)
                    acu++;
            }
        }
        return acu;
        
        /*for(int i=0, j=0; i<frase1.length; i++){
            if(frase1[i]==frase2[j] && acu==frase2.length-1){
                acu=0; num++;
                if(j==frase2.length-1) j=0;
                else j++;
            }else if(frase1[i]==frase2[j]){
                acu++;
                if(j==frase2.length-1) j=0;
                else j++;
            }else if(j>0&&frase1[i]==frase2[j-1]){
                acu=1;
                j=1;
            }else
                acu=0;
        }
        return num;*/
        
    }
}

