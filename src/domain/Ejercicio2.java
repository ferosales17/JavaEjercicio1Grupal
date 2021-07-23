package domain;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int n = scanner.nextInt();

        System.out.println("Ingrese el segundo numero:");
        int m = scanner.nextInt();

        for(int i = 0; i<=n; i++){
            if(i%m==0){
                System.out.println( n + " es multiplo de " + m +" con el valor = "+ i);
            }
        }
    }
}
