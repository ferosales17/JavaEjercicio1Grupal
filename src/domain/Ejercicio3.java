package domain;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero:");
        int n = scanner.nextInt();
        int cont = 0;

        for (int i = 1; i <= n; i++){
            if((n%i)==0){
                cont++;
            }
        }
        if(cont <= 2){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
}
