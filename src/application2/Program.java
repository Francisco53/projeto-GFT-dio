package application2;

import questao3.ContaCorrente;
import questao3.ContaPoupanca;

public class Program {

    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1, "Daniel Barbosa Filho", 2500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(5, "José da Silva Costa", 9000);

        System.out.println(contaCorrente.toString());
        System.out.println("Rendimentos: R$ "+contaCorrente.rendimento());

        System.out.println();
        System.out.println(contaPoupanca.toString());
        System.out.println("Rendimentos: R$ "+contaPoupanca.rendimento());
    }
}
