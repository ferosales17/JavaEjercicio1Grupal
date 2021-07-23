package domain;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            boolean esPrimo = true;
            for(int j = 2;j<i;j++){
                if((i%j)==0){ // divido el numero actual en J=2 para consultar que no sea primo, es decir su modulo sea 0
                    esPrimo = false; // no es primo
                    break; // corto flujo para este n no siga y vuelvo al for
                }
            }
            if(esPrimo) // consulto si esPrimo es true, quiere decir que el n que recorremos es divisible en si mismo
                System.out.println(n + " es primo de = " + i);
        }

    }
}
