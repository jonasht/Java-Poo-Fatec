package com.company;

public class Aluno {
    private String ra;
    private String nome;
    private String login;
    private String senha;

    // metado construtor----
    public Aluno(){
        System.out.println("no construtor padrao");
    }

    public Aluno(String login, String senha) {
        this.login = login;
        this.senha = senha;
        System.out.println("nao ha metado p verificar credenciais");
    }

    public Aluno(String ra, String nome, String login, String senha) {
        this.ra = ra;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        System.out.println("construtor completo");
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra='" + ra + '\'' +
                ", nome='" + nome + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
