package cosantiagocom.Tema06;

import java.util.Random;

// intentar hacer con numeros reales si se puede hacer.

public class Sortarray {
    public static Random rnd = new Random();

    public static void main (String[] args){
        int numA [] = new int [23];
        rndArray(numA,30);
        int [] contador = new int[31];

        for(int i = 0; i<numA.length; i++){
            contador[numA[i]]++;
        }
        for (int i = 0; i<contador.length; i++){
            for (int j =1; j<=contador[i]; j++){
              System.out.println(i);
            }
        }
    }

    /**
     * dar array random
     * @param arr esta array es donde se almacenara los aleatorios
     * @param numMax es el numero maximo que podra tener un numero aleatorio
     */
    public static void rndArray(int [] arr, int numMax){
      for (int i=0; i<arr.length; i++){
           arr[i]=rnd.nextInt(numMax);
      }
   }
}




