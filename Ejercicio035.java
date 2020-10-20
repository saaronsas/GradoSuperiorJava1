/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio035 {
    public static void main(String[] args) {
        int salas[][]={{10,20,30,40,70,150,250},{50,60,70,80,56,250,164},{90,100,110,120,225,198,169}}, entradas[]=new int[3], max=0, min=0;
        String peliculas[]={"Aladin","Titanic","Lalala"};
        
        for(int i=0; i<salas.length; i++){
            for(int j=0; j<salas[i].length; j++){
                entradas[i]+=salas[i][j];
            }
            if(entradas[i]>entradas[max]){
                max=i;
            }else if(entradas[i]<entradas[min]){
                min=i;
            }
        }
       
        System.out.println("La pelicula mas vista fue "+peliculas[max]+" y se vendieron "+entradas[max]+" entradas");
        System.out.println("La pelicula menos vista fue "+peliculas[min]+" y se vendieron "+entradas[min]+" entradas");
    }
}
