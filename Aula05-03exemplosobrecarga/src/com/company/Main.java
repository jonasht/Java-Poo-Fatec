package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setNumero(1);
        notaFiscal.setValor(1000.0);
        //notaFiscal.emitirNota(LocalDate.now(), dias: 28);
        notaFiscal.emitirNota(LocalDate.now(), LocalDate.of(2020, 02, 04));
        notaFiscal.imprimir();






    }
}
