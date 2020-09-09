package com.company;

public class Apolice {
    private String nomeSegurado;
    private int idade;
    private float valorPremio;
    private boolean ativo;

    // modificadores de acesso
    // getters - (get) ler o dado
    // setters - (set) gravar o dado
    // <alt> + <insert> (atalho para o menu contexto) Intellij idea


    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSugurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(float valorPremio) {
        this.valorPremio = valorPremio;
    }

    public void imprimir(){
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("nomeSugurado = " + nomeSegurado);
        System.out.println("idade = " + idade);
        System.out.println("premio em caso de falecimento = " + valorPremio);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

}
