package com.company;

public class ApoliceTeste {

    public static void main(String[] args) {
        System.out.println("feito no windows\n\n\n");

        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("felipe");
        apolice.setIdade(18);
        apolice.setValorPremio(1500.50f);

        apolice.imprimir();


    }
}
