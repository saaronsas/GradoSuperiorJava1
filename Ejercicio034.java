/*
Tenemos un cine con 4 salas y guardo guadar cuantas entradas se venden cada dia de la semana 
 */

/**
 *
 * @author Infor
 */
public class Ejercicio034 {
    public static void main(String[] args) {
        int salas[][]={{10,20,30,40,70,150,250},{50,60,70,80,56,250,164},{90,100,110,120,225,198,169}}, entradas[]=new int[7], max=0, min=0;
        String dias[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        
        for(int i=0; i<salas.length; i++){
            for(int j=0; j<salas[i].length; j++){
                entradas[j]+=salas[i][j];
            }
        }
        for(int i=0; i<entradas.length; i++){
            if(entradas[i]>entradas[max]){
                max=i;
            }else if(entradas[i]<entradas[min]){
                min=i;
            }
        }
        System.out.println("El dia que mas entradas se vendieron fue el "+dias[max]+" y se vendieron "+entradas[max]+" entradas");
        System.out.println("El dia que menos entradas se vendieron fue el "+dias[min]+" y se vendieron "+entradas[min]+" entradas");
    }
}
