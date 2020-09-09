package com.company;

public class ApoliceTeste {

    public static void main(String[] args) {
        // criar objeto
        Apolice apolice = new Apolice();

        // atribuir valores aos atributos (campo) do objeto
        apolice.setNomeSegurado("Rafael Marcedo");

        apolice.setIdade(28);
        apolice.setValorPremio(50000f);

        //invocar o metado imprimir p imprimir os dados do objeto que eh uma funcao
        apolice.imprimir();

    }
}