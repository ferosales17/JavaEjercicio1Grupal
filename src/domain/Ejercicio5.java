package domain;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:"); // numero n -> los primero numeros
        int n = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:"); // m -> cantidad de digitos
        int m = scanner.nextInt();

        System.out.println("Ingrese el tercer numero:"); // d -> numero que busco
        int d = scanner.nextInt();

        scanner.close();

    }

    //n ,digitos,numeroque busco
    public static void recorrer(int a, int d, int b) {
        //int numeroGrande = Integer.MAX_VALUE; // me trae el numero maximo de integer= 2147483647 y lo asigno
        int numeroGrande = 30;
        String numeroGrandeString = String.valueOf(numeroGrande);

        if (a < 0) {
            System.out.println("No debe ser un numero negativo");
        } else {
            for (int i = 0; i < numeroGrande; i++) {
                String numeroEncontrado = buscarNumero(i, b);
                String bString = String.valueOf(b);
                if (numeroEncontrado.contains(bString)) {
                    int numEncInt = Integer.parseInt(numeroEncontrado);
                    //String resultCon = contarDigitos(numEncInt);
                    String nDigitos = String.valueOf(d);

                    String numEcontradoString = String.valueOf(numEncInt);
                    for (int j = 0; j < numEcontradoString.length(); j++) {
                        String jstring = String.valueOf(numEcontradoString.charAt(j));
                        int cont2 = 0;
                        if (jstring.equals(bString)) {
                            cont2++;
                        }
                        String contadorNumQ = String.valueOf(cont2);
                        if (contadorNumQ.equals(nDigitos)) {
                            System.out.println("numero econtrado = " + numEcontradoString);
                        }
                    }


                }
            }
        }
    }

    public static String contarDigitos(int b) {
        int count = 0;
        for (int i = 0; i < b; i++) {
            while (b != 0) {
                b /= 10;
                count++;
            }

        }

        String cantidad = String.valueOf(count);
        return cantidad;
    }

    //numero,d
    public static String buscarNumero(int c, int d) {
        String numeroIngreso = String.valueOf(d);
        String numeroString = String.valueOf(c);
        if (numeroString.contains(numeroIngreso) == true) {
            return numeroString;
        }

        return numeroString;
    }
}