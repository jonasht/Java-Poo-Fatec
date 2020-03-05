package com.company;

import java.time.LocalDate;

public class NotaFiscal {

    private int numero;
    private LocalDate dataEmissao;
    private LocalDate dataVcto;
    private double valor;

    // metados gets e setters

    public void setNumero(int numero){
        this.numero = numero;

    }

    public int getNumero(int numero){
        return numero;
    }


    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataVcto() {
        return dataVcto;
    }

    public void setDataVcto(LocalDate dataVcto) {
        this.dataVcto = dataVcto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    //metados sobrecarregados
    public void emitirNota(LocalDate data){
        this.dataVcto = data;

    }
    public void emitirNota(LocalDate data, int dias){
        //data passada será da emissao
        // a quantidade de dias, definira o vcto
        this.dataVcto = data.plusDays((long)dias);
        this.dataEmissao = data;


    }
    public void emitirNota (LocalDate data, LocalDate dataVcto){
        // data é a data de emissao
        // a outra data é o vcto
        this.dataEmissao = data;
        this.dataVcto = dataVcto;

    }
    public void imprimir(){
        System.out.println("--=-=-=-=-");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("numero = " + numero);
        System.out.println("dataEmissao = " + dataEmissao);
        System.out.println("dataVcto = " + dataVcto);
        System.out.println("valor = " + valor);
        System.out.println("valor = " + valor);

    }
}
