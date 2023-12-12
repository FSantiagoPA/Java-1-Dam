package cosantiagocom.lib;

public class LibTema6 {
    public static void main(String[] args) {
        System.out.println("s");
    }
    /**
     * Unir 2 String
     * @param palabra1 1String
     * @param palabra2 2String
     * @return devuelve las dos palabras unidas
     */
    public static String concat(String palabra1, String palabra2){
        StringBuilder sb = new StringBuilder();
        sb.append(palabra1);
        sb.append(palabra2);
        return sb.toString();
    }

    /**
     * ChartAt pero sin usarlo devuelve String
     * @param palabra palabara por donde mira
     * @param posicion posicion a buscar
     * @return devuelve un string
     */
    public static String charAt(String palabra, int posicion){
        if (posicion <= palabra.length()) {
            String caracter = palabra.substring(posicion, posicion + 1);
            return caracter;
        }
        return null;
    }

    /**
     * Comparar si 2 String son iguales Boolean
     * @param palabra1 palabra 1
     * @param palabra2 palabra 2
     * @return boleano
     */
    public static boolean compare(String palabra1, String palabra2){
        int n1= 0;
        int n2 = 0;
        if (palabra1.length() == palabra2.length()) {

            for (int i = 0; i < palabra1.length(); i++) {
                n1 += palabra1.charAt(i);
                n2 += palabra2.charAt(i);
            }

            if (n1 - n2 != 0)
                return false;
            else
                return true;
        }
        else
            return false;
    }

    /**
     * Devovler una certa cantidad de caracteres.
     * @param palabra palabra a susbtraer
     * @param inicio inicio de coger
     * @param fin final de coger
     * @return devuelve los caracteres entre inicio y fin
     */
    public static String subString(String palabra, int inicio, int fin){

        StringBuilder sb = new StringBuilder(fin - inicio +1);
        for (int i = inicio; i < fin; i++) {
            sb.append(palabra.charAt(i));
        }
        String palabra2 = sb.toString();


        return palabra2;
    }

    /**
     * Compara si la ultima palabra es la misma que la ingresada
     * @param palabra palabra la cual se busca
     * @param palabraFinal la palabra ingresada
     * @return devuelve un booleano
     */
    public static boolean endWith(String palabra, String palabraFinal){
        palabra = subString(palabra, palabra.length()- palabraFinal.length(), palabra.length());
        if (palabra.equals(palabraFinal))
            return true;

        return false;

    }
    /**
     * Poner en mayuscula la primera letra de la frase.
     * @param s palabra a combiar
     * @return la oracion nueva con mayuscula incial
     */
    public static String firstUpperCase(String s){
        if (s == null || s.length() == 0) {
            return "";
        }
        StringBuilder str = new StringBuilder(s.length());
        str.append(s.toUpperCase().charAt(0));
        str.append(s.substring(1, s.length()));

        return str.toString();
    }

    /**
     * Devolver la primera palabra de la oracion.
     * @param palabra
     * @return palabra inicial de la oracion
     */
    public static String startWith(String palabra){
        char caracter = 'h';
        palabra = palabra.trim();
        for (int i = 0; i < palabra.length(); i++) {
            caracter = palabra.charAt(i);
            if (caracter == ' ') {
                return palabra.substring(0 , i);
            }
        }
        return ""+palabra.charAt(0);
    }

    /**
     * Cambia todas las tras por otra
     * @param palabra oracion a cambiar
     * @param caracterNuevo caracter que se va poder
     * @return palabra nueva
     */
    public static String cambiaLetras(String palabra, char caracterNuevo){
        StringBuilder strb = new StringBuilder(palabra.length());
        for (int i = 0; i < palabra.length(); i++) {
            char c = palabra.charAt(i);
            if (c == caracterNuevo)
                strb.append(caracterNuevo);
            else
                strb.append(c);
        }
        return strb.toString();
    }

    /**
     * Comparar 2 String iguales
     * @param palabra1 String 1
     * @param palabra2 String 2
     * @return bolean son iguales
     */
    public static boolean equals(String palabra1,String palabra2){
        char car1 = ' ';
        char car2 = ' ';

        if (palabra1.length() == palabra2.length()) {
            for (int i = 0; i < palabra1.length() ; i++) {
                car1 = palabra1.charAt(i);
                car2 = palabra2.charAt(i);
                if (car1 != car2) {
                    return false;
                }
            }
            return true;
        }
        else{
            return false;
        }
    }

    /**
     * Encontrar el indice de una serie de caracteres empezando por el principio
     * @param palabra palabra donde se buscara
     * @param palabraBuscar la palabra que se buscara
     * @return indice donde se encuetra.
     */
    public static int indexOf(String palabra, String palabraBuscar){
        for(int i = 0 ; i <  palabra.length() -1; i++){

            if (subString(palabra, i, i + palabraBuscar.length()).equals(palabraBuscar)) {
                return i;

            }
        }
        return 0;
    }

    /**
     * Encontrar el indice de una serie de caracteres empezando por el final
     * @param palabra palabra donde se buscara
     * @param palabraBuscar la palabra que se buscara
     * @return indice donde se encuetra.
     */
    public static int lastIndexOf(String palabra, String palabraBuscar){
        for(int i = palabra.length() - palabraBuscar.length() ; i >= 0; i--){

            if (subString(palabra, i, i + palabraBuscar.length()).equals(palabraBuscar)) {
                return i;

            }
        }
        return 0;
    }

    /**
     * Contar vocales
     * @param palabra palabra buscar volcaes
     * @return devuelve el numero de vocales
     */
    public static int contarVocales(String palabra){
        int numVocales = 0;
        palabra = palabra.toLowerCase();
        String vocales = "aeiou";
        if (palabra == " " || palabra == null) {
            return 0;
        }
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (palabra.charAt(i) == vocales.charAt(j)) {
                    numVocales ++;
                }
            }
            /*
            if (palabra.charAt(i) == 'a' || palabra.charAt(i) == 'e' || palabra.charAt(i) == 'i' ||palabra.charAt(i) == 'o' || palabra.charAt(i) == 'u' ) {
                numVocales++;
            }
             */
        }
        return numVocales;
    }


    /**
     * Cuneta el numero de consonantes
     * @param palabra palabra donde buscar las consonantes
     * @return devuelve el numero encontrado de consonantes
     */
    public static int numConsonantes(String palabra){
        String vocales = "aeiou ";
        boolean esCon = true;
        int consonantes = 0;
        if (palabra == " " || palabra == null) {
            return 0;
        }
        palabra = palabra.toLowerCase();

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < vocales.length(); j++) {
                if (palabra.charAt(i) == vocales.charAt(j))
                    esCon = false;
            }
            if (esCon)
                consonantes++;

            esCon = true;
        }
        return consonantes;
    }

    /**
     * Contar las palabras de una oracion
     * @param palabra palabra a quien se le contara las letras
     * @return devuelve el numeros de letras de la oraciones
     */
    public static int contarPalabras(String palabra){
        int palabras = 0;
        palabra = " " + palabra + " ";
        palabra = palabra.replaceAll("\\s+", " ");
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == ' ') {
                palabras++;
            }
        }
        return palabras-1;
    }

    /**
     * Escrimir vericalmente cada palabra de una oracion
     * @param oracion las palabras de donde se van a sacar
     * @return palabras en vertical a devilver string
     */
    public static String imprimirPalabrasVertical(String oracion){
        String palabraNueva = "";
        for (int i = 0; i < oracion.length(); i++) {
            int asciichar = oracion.charAt(i);
            if (asciichar >= 65 && asciichar <= 90 || asciichar >= 97 && asciichar <= 122) {

            }
            else
                oracion = oracion.replace( (char) asciichar, ' ');
        }
        oracion = oracion.replaceAll("\\s+", " ");
        String[] palabras = oracion.split("\\s+");
        for (String palabra : palabras) {
            palabraNueva += palabra + "\n";
        }
        return palabraNueva;
    }

    /**
     * Mostar unicamente las letras impares
     * @param oracion string de la oracion
     * @return impares de la oracion
     */
    public static String mostarImparesString(String oracion){
        StringBuilder sb = new StringBuilder(oracion.length());

        for (int i = 0; i < oracion.length(); i++) {
            if (i % 2 != 0) {
                sb.append(oracion.charAt(i));
            }
            else
                sb.append(" ");
        }

        return sb.toString();
    }

    public static boolean palindromaPalabra(String palabra){
        StringBuilder sb = new StringBuilder(palabra.length());

        for (int i = palabra.length()-1; i >= 0; i--) {
            sb.append(palabra.charAt(i));
        }
        return equals(palabra, sb.toString());
    }

}
