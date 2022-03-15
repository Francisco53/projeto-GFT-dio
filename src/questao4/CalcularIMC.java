package questao4;

import java.util.Scanner;

public class CalcularIMC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = sc.nextDouble();

        double imc = peso / (altura*altura);

        if(imc < 18.5){
            System.out.println("nome: "+nome);
            System.out.println("Peso: "+peso);
            System.out.println("Altura: "+altura);
            System.out.println("IMC: "+imc);
            System.out.println("Abaixo do peso");
        }
        else if(imc >= 18.5 && imc <= 24.9){
            System.out.println("nome: "+nome);
            System.out.println("Peso: "+peso);
            System.out.println("Altura: "+altura);
            System.out.println("IMC: "+imc);
            System.out.println("Peso normal");
        }
        else if(imc >= 25 && imc <= 29.9){
            System.out.println("nome: "+nome);
            System.out.println("Peso: "+peso);
            System.out.println("Altura: "+altura);
            System.out.println("IMC: "+imc);
            System.out.println("Sobrepeso");
        }
        else if(imc >= 30 && imc <= 34.9){
            System.out.println("nome: "+nome);
            System.out.println("Peso: "+peso);
            System.out.println("Altura: "+altura);
            System.out.println("IMC: "+imc);
            System.out.println("Obesidade Grau I");
        }
        else if(imc >= 35 && imc <= 39.9){
            System.out.println("nome: "+nome);
            System.out.println("Peso: "+peso);
            System.out.println("Altura: "+altura);
            System.out.println("IMC: "+imc);
            System.out.println("Obesidade Grau II");
        }
        else{
            System.out.println("nome: "+nome);
            System.out.println("Peso: "+peso);
            System.out.println("Altura: "+altura);
            System.out.println("IMC: "+imc);
            System.out.println("Obesidade Grau III");
        }
    }
}
