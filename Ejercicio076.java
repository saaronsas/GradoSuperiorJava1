/*
 * Cambiar vocales en minuscula por MAYUSCULA Y MAYUSCULA por minucula
 */

/**
 *
 * @author Infor
 */
public class Ejercicio076 {
    public static void main(String[] args) {
        char[] cadena={'E','n',' ','u','n',' ','l','u','g','a','r',' ','e','n',' ','l','a',' ','m','a','n','c','h','a'};
        
        cambiarVocales(cadena);
        
        for(char letra: cadena)
            System.out.print(letra);
        System.out.println("");
    }
    
    public static void cambiarVocales(char[] cadena){
        for(int i=0; i<cadena.length; i++){
            /*if(cadena[i]=='a'||cadena[i]=='e'||cadena[i]=='i'||cadena[i]=='o'||cadena[i]=='u')
                cadena[i]-=32;
            else if(cadena[i]=='A'||cadena[i]=='E'||cadena[i]=='I'||cadena[i]=='O'||cadena[i]=='U')
                cadena[i]+=32;*/
            switch(cadena[i]){
                //case 'A','E','I','O','U':
                case 'A':case 'E':case 'I':case 'O':case 'U':
                    cadena[i]+=32;  //cadena[i]=Character.toLowerCase(cadena[i]);
                    break;
                case 'a':case 'e':case 'i':case 'o':case 'u':
                    cadena[i]-=32;  //cadena[i]=Character.toUpperCase(cadena[i]);
                    break;
            }
        }
    }
}
