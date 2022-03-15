package application;

import questao1.Gerente;
import questao1.Supervisor;
import questao1.Vendedor;

public class Programam {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("José", 45, 30000, 1);
        Supervisor supervisor = new Supervisor("Manoel", 38, 8000, 3);
        Vendedor vendedor = new Vendedor("João", 19, 2000, 5);

        System.out.println(gerente.toString());
        System.out.println("Bonificação: R$ "+gerente.bonificacao());

        System.out.println();
        System.out.println(supervisor.toString());
        System.out.println("Bonificação: R$ "+supervisor.bonificacao());

        System.out.println();
        System.out.println(vendedor.toString());
        System.out.println("Bonificação: R$ "+supervisor.bonificacao());
    }
}
