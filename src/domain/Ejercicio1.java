package domain;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero:");
        int n = scanner.nextInt();

        for(int i = 0; i<=n; i++){
            if(i%2==0){
                System.out.println("i = " + i);
            }
        }
        scanner.close();
    }
}


