/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio069 {
    public static void main(String[] args) {
        char[] cadena1={'E','n',' ','u','n',' ','l','u','g','a','r',' ','d','e',' ','l','a',' ','m','a','n','o',' '};
        char cadena2[]=new char[150];
        
        //System.arraycopy(cadena1, 0, cadena2, 0, cadena1.length);
        //System.arraycopy(cadena1, 0, cadena2, cadena1.length, cadena1.length);
        
        for(int i=0; i<cadena1.length; i++)
            cadena2[i]=cadena1[i];
        for(int i=0; i<cadena1.length; i++)
            cadena2[i+cadena1.length]=cadena1[cadena1.length-1-i];
        
        for(char pal: cadena2)
            System.out.print(pal);
        System.out.println("");
    }
}
