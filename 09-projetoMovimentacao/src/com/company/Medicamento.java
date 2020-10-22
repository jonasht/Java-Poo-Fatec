package com.company;

import java.time.LocalDate;

public class Medicamento {

    //
    private int id;
    private String medicamento;
    private String numRegistro;
    private String forma;
    private String concentracao;
    private LocalDate dataCadastro;
    private double preco;
    private Farmaceutica farmaceutica;

    public Farmaceutica getFarmaceutica() {
        return farmaceutica;
    }

    public void setFarmaceutica(Farmaceutica farmaceutica) {
        this.farmaceutica = farmaceutica;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(String concentracao) {
        this.concentracao = concentracao;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("id = " + id);
        System.out.println("medicamento = " + medicamento);
        System.out.println("numRegistro = " + numRegistro);
        System.out.println("forma = " + forma);
        System.out.println("concentracao = " + concentracao);
        System.out.println("dataCadastro = " + dataCadastro);
        System.out.println("preco = " + preco);
        System.out.println("Dados da Farmaceutica resposável por esse medicamento");

        farmaceutica.imprimir();
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public void alterarPreco(){
        //majorar o preco em 10 %
        preco *= 1.10;
    }
    public void registrarData(){
        //Registrar o medicamento com a data atual
        dataCadastro = LocalDate.now(); //representa a data de hoje em java

    }
}
