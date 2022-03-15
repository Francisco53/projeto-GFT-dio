package questao2;

import java.util.Scanner;

public class NumeroImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] digits1;

        do{
            int numero;

            numero = sc.nextInt();

            String number = String.valueOf(numero);

            digits1 = number.toCharArray();

        }while (digits1.length < 4);

        int contador = 0;
        for(int i = 0; i < digits1.length; i++) {
            if(digits1[i] % 2 != 0){
                contador ++;
            }
        }

        System.out.println(contador);


    }
}
