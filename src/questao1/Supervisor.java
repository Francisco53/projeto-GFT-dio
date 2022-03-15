package questao1;

public class Supervisor extends Colaborador {

    private String nome;
    private int idade;
    private double salario;
    private int grauInstrucao;

    public Supervisor() {
    }

    public Supervisor(String nome, int idade, double salario, int grauInstrucao) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.grauInstrucao = grauInstrucao;
    }

    @Override
    public String toString() {
        return "Supervisor:\nNome: "+nome+"\nIdade: "+idade+"\nSalário: R$ "+salario+"\nGrau de Instrucao: "+grauInstrucao;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int getGrauInstrucao() {
        return grauInstrucao;
    }

    @Override
    public void setGrauInstrucao(int grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    @Override
    public double bonificacao() {
        return salario + 500 * grauInstrucao * 3;
    }
}
