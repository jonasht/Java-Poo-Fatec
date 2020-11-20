package com.company;

public class GerenciarPatrimonioBanco {
    private  double totalPatrimonio;

    public void adicionarConta(Conta conta){
        totalPatrimonio = totalPatrimonio + conta.getSaldo();
    }

    public double getTotalPatrimonio(){
        return totalPatrimonio;
    }
}
