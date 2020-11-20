package com.company;

public class Corrente extends Conta{
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // metado (sacar) q eh o mesmo de conta chamado override
    @Override
    public boolean sacar(double valor) {
        //return super.sacar(valor);
        //regra p sacar da conta
        if(valor <= (limite + getSaldo())){
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }
}
