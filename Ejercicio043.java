/*
 Ejercicios casa 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio043 {
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("Ejercicio 1 -> Media alumnos\n");
        int edad[][]={{18,18,19,20,21},{19,18,20,19,21},{20,21,22,20,21},{26,21,20,20,29}}, max=0, min=0; float media[]=new float[4];
        String clase[]={"1H","1E","2H","2E"};
        
        for(int i=0; i<edad.length; i++){
            for(int j=0; j<edad[i].length; j++){
                media[i]+=edad[i][j];
            }
            if(media[i]>media[max])
                max=i;
            else if(media[i]<media[min])
                min=i;
        }
        System.out.println("La clase que tiene la mayor media es "+clase[max]+" con una edad media de "+media[max]/edad[0].length);
        System.out.println("La clase que tiene la menor media es "+clase[min]+" con una edad media de "+media[min]/edad[0].length);
        System.out.println("\nMedias de las clases:");
        for(int i=0; i<clase.length; i++)
            System.out.println("La clase "+clase[i]+" tiene una media de "+media[i]/edad[0].length);
        
        
        System.out.println("\n\n\n");
        //Ejercicio 2
        System.out.println("Ejercicio 2 -> Media goles\n");
        int goles[][]={{2,4,6,4},{4,10,2,15},{19,22,0,12},{19,20,45,0},{10,3,2,4}}, media_goles[]=new int[5];
        String nombres[]={"Paco","Jacinto","Andres","Juan","Ramiro"};
        
        for(int i=0; i<goles.length; i++){
            for(int j=0; j<goles[i].length; j++){
                media_goles[i]+=goles[i][j];
            }
            System.out.println(nombres[i]+" ha tenido un media de "+media_goles[i]/goles[i].length+" goles por año");
        }
        
    }
}
