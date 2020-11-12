/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio062 {
    public static void main(String[] args) {
        char frase[]={'E','n',' ','u','n','a',' ','c','a','s','a'};
        char sustituir='a', sustituto='X';
        
        sustituir(frase, sustituir, sustituto);
        for(char frase1: frase)
            System.out.print(frase1);
        System.out.println("");
    }
    
    public static void sustituir(char[] frase, char sustituir, char sustituto){
        for(int i=0; i<frase.length; i++){
            if(frase[i]==sustituir){
                frase[i]=sustituto;
            }
        }
    }
}
