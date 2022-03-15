package questao2;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class NumeroImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[] digits1;

        int numero;

        numero = sc.nextInt();

        if(numero >= 350 && numero <= 8750){
            do{

                String number = String.valueOf(numero);

                digits1 = number.toCharArray();
                if(digits1.length < 4)
                    System.out.println("O número precisa conter pelo menos 3 dígitos");

            }while (digits1.length < 3);

            int contador = 0;
            for(int i = 0; i < digits1.length; i++) {
                if(digits1[i] % 2 != 0){
                    contador ++;
                }
            }

            System.out.println(contador);
        }
        else
            System.out.println("Número deve estar entre 350 e 8750");

    }

}
