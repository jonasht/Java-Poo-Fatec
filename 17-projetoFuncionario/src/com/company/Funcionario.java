package com.company;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String rg;
    private String cidade;
    private boolean estaNaEmpresa;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public boolean isEstaNaEmpresa() {
        return estaNaEmpresa;
    }

    public void setEstaNaEmpresa(boolean estaNaEmpresa) {
        this.estaNaEmpresa = estaNaEmpresa;
    }

    public void boneficar(double aumento) {
        System.out.println("o salario tem um aumento de " + aumento);
        System.out.println("agora o salario estahh" + getSalario());
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", departamento='" + departamento + '\'' +
                ", salario=" + salario +
                ", rg='" + rg + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estaNaEmpresa=" + estaNaEmpresa +
                '}';
    }
}
