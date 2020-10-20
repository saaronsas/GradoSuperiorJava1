/*
 * 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio036 {
    public static void main(String[] args) {
        int salas[][]={{10,20,30,40,70,150,250},{50,60,70,80,56,280,164},{90,100,110,120,225,198,169}}, maxi=0, maxj=0, mini=0, minj=0;
        String peliculas[]={"Aladin","Titanic","Lalala"};
        String dias[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
        for(int i=0; i<salas.length; i++){
            for(int j=0; j<salas[i].length; j++){
                if(salas[i][j]>salas[maxi][maxj]){
                    maxi=i;
                    maxj=j;
                }else if(salas[i][j]<salas[mini][minj]){
                    mini=i;
                    minj=j;
                }
            }
        }
        System.out.println("La pelicula mas vista fue "+peliculas[maxi]+" el "+dias[maxj]+" y se vendieron "+salas[maxi][maxj]+" entradas");
        System.out.println("La pelicula menos vista fue "+peliculas[mini]+" el "+dias[minj]+" y se vendieron "+salas[mini][minj]+" entradas");
       
    }
}
