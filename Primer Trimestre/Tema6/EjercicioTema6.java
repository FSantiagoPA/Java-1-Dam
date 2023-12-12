package cosantiagocom.Tema06;
import java.util.Scanner;
import java.util.Random;
public class EjercicioTema6 {
    public static Scanner scanner  = new Scanner(System.in);
    static final int LIMT_VALOR_PREDEFINIDO = 10;

    //Ejercicio24
    public static void ejercicio24(){
        int [] numV = new int[10];
        int [] numP = new int[10];

        randomArray(numV, 30);
        for (int i = 0; i < numV.length; i++) {
            numP[i] = sumaArrayHasta(numV, i);
            System.out.println(numP[i]);
        }

    }

    public static int sumaArrayHasta (int[] array, int limit){
        int num = 0;
        for (int i = 0; i <= limit; i++) {
            num += array[i];

        }
        return num;

    }


    //Ejercicio23
    public static void ejercicio23(){
        int [] nums = new int [LIMT_VALOR_PREDEFINIDO];
        int [] reves =  new int [LIMT_VALOR_PREDEFINIDO];

        randomArray(nums, 30);

        reves = arrayReves(nums);

        System.out.printf("ANTERIOR \t NUEVO \n");
        for (int i = 0; i < reves.length; i++) {
            System.out.printf("%-9d \t %-9d \n", nums[i], reves[i]);
        }

    }

    public static int[] arrayReves(int[] origen){
        int[] reves = new int[origen.length];
        for (int i = 0; i < origen.length; i++) {
            reves[9-i] = origen[i];
        }
        return reves;
    }


    //Ejercicio22
    public static void ejercicio22(){
        int[] P = new int[LIMT_VALOR_PREDEFINIDO];
        int max = 0;
        int[] S = new int[LIMT_VALOR_PREDEFINIDO];
        randomArray(P, 30);
        for (int i = 0; i < S.length; i++) {
            if (P[i] > 10) {
                S[i] = P[i];
            }
            else
                S[i] = -1;
        }

        System.out.printf("ANTERIOR \t NUEVO \n");
        for (int i = 0; i < S.length; i++) {
            System.out.printf("%-9d \t %-9d \n", P[i],S[i]);
        }
    }


    //Ejercicio21
    public static void ejercicio21(){
        int num = 0;
        int[] nums = new int[50];
        String ingreso  ="";
        do{
            menu();
            ingreso = scanner.nextLine();
            if (!ingreso.matches("\\d+"))
                continue;
            num = Integer.parseInt(ingreso);
            if (num < 0 || num > 4) {
                continue;
            }
            switch (num) {
                case 1:
                    crearArray(nums);
                    break;

                case 2:
                    visualitzarArray(nums);
                    break;
                case 3:
                    visualitzarParell(nums);
                    break;
                case 4:
                    visualitzarMultiple3(nums);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
            System.out.println("Continuar....");
            scanner.nextLine();

        }while(num != 0);
    }

    public static void menu(){
        System.out.println("""
            \033[H\033[2J
            MENÚ PRINCIPAL
            ==============
            1.-Rellenar array.
            2.-Visualizar contenido del array
            3.-Visualizar contenido par.
            4.-Visualizar contenido múltiplo de 3
            0.-Salir del menú.
                """);
    }

    public static void crearArray(int[] vector){
        Random rnd = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rnd.nextInt(0, 50);
        }
    }

    public static void visualitzarArray(int[] vector){
        for (int i : vector) {
            System.out.println(i);
        }
    }

    public static void visualitzarParell(int[] vector){
        for (int i : vector) {
            if (i % 2 == 0) {
                System.out.printf("Num: %2d con la posición: %d \n", vector[i], i);
            }
        }
    }

    public static void visualitzarMultiple3(int[] vector){
        for (int i : vector) {
            if (i % 3 == 0) {
                System.out.printf("Num: %2d con la posición: %d \n", vector[i], i);
            }
        }
    }


    //Ejercicio20
    public static void ejercicio20(){
        int [] nums = new int[100];
        int buscar = 34;

        randomArray(nums, 100);

        System.out.println(encontrarNumArray(nums, buscar));
    }

    public static boolean encontrarNumArray(int[] nums, int num){

        for (int i : nums) {
            if (i == num) {
                return true;
            }
        }
        return false;

    }


    //Ejercicio19
    public static void ejercicio19(){
        int [] nums = new int[100];
        randomArray(nums, 100);

        int [] resultado10 = new int[cantidadNumeroArrayMultiplosNumeroIndicado(nums, 10)];
        int [] resultado5 = new int[cantidadNumeroArrayMultiplosNumeroIndicado(nums, 5)];
        int [] resultado0 = new int[cantidadNumeroArrayMultiplosNumeroIndicado(nums, 0)];
        resultado10 = multiplo(nums, 10);
        resultado5 = multiplo(nums, 5);
        resultado0 = multiplo(nums, 0);

        System.out.println("Multiplos de 5");
        for (int i : resultado5) {
            System.out.println(i);
        }

        System.out.println("Multiplos de 10");
        for (int i : resultado10) {
            System.out.println(i);
        }

        System.out.println("Iguales a 0");
        for (int i : resultado0) {
            System.out.println(i);
        }
    }

    public static int cantidadNumeroArrayMultiplosNumeroIndicado(int[] lista, int multiplo){
        int cont = 0;
        if (multiplo == 0) {
            for (int i : lista) {
                if (i == 0) {
                    cont ++;
                }
            }
            return cont;
        }

        for (int i : lista) {
            if (i % multiplo == 0) {
                cont++;
            }
        }
        return cont;
    }

    public static int[] multiplo(int[] nums, int num){
        int cont  = 0;
        int [] resultado = new int[cantidadNumeroArrayMultiplosNumeroIndicado(nums, num)];
        if (num == 0) {
            for (int i : nums) {
                if (i == 0) {
                    resultado[cont] = i;
                    cont++;
                }
            }
            return resultado;
        }
        for (int i : nums) {
            if (i % num == 0) {
                resultado[cont] = i;
                cont++;
            }
        }

        return resultado;

    }


    //Ejercicio18
    public static void ejercicio18(){
        int[] lista1 = new int[10];
        int[] lista2 = new int[10];
        int[] resultado = new int[10];
        randomArray(lista1, 10);
        randomArray(lista2, 10);

        resultado = sumaArray(lista1, lista2);
        for (int i : resultado) {
            System.out.println(i);
        }
        resultado = dividirArray(lista1, lista2);
        for (int i : resultado) {
            System.out.println(i);
        }


    }

    public static int[] dividirArray(int[] lista1, int[] lista2){
        int [] resultado = new int[10];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = lista1[i] / lista2[i];
        }
        return resultado;
    }

    public static int[] sumaArray(int[] lista1, int[] lista2){
        int [] resultado = new int[10];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = lista1[i] + lista2[i];
        }
        return resultado;
    }

    public static void randomArray(int[] array, int num){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(1, num);
        }
    }
}