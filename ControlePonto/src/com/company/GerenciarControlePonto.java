package com.company;

import java.time.LocalDateTime;

public class GerenciarControlePonto {

    public static void main(String[] args) {
	// write your code here

        // gerente -----------------------
        Gerente gerente = new Gerente();

        gerente.setLogin("jonas");
        gerente.setSenha("123");
        gerente.setNome("jonas");
        gerente.setEmail("jonas@outlook.com");
        gerente.setIdFunc(123);
        gerente.setDocumento("123");

        RegistroPonto ge = new RegistroPonto();

        ge.setHoraEntrada(LocalDateTime.of(2020, 07, 22, 10, 15, 30));
        ge.setHoraSaida(LocalDateTime.of(2020, 07, 22, 20, 15, 30));
        ge.setIdRegPonto(gerente.getIdFunc());
        ge.setFunc(gerente);

        /// secretaria -----------------------------------------
        Secretaria secretaria = new Secretaria();


        secretaria.setNome("maria");
        secretaria.setRamal("E123");
        secretaria.setTelefone("019 1234-5667");
        secretaria.setEmail("maria@outlook.com");
        secretaria.setIdFunc(123);
        secretaria.setDocumento("123");

        RegistroPonto se = new RegistroPonto();
        se.setHoraEntrada(LocalDateTime.of(2020, 07, 22, 10, 15, 30));
        se.setHoraSaida(LocalDateTime.of(2020, 07, 22, 20, 15, 30));
        se.setIdRegPonto(secretaria.getIdFunc());
        se.setFunc(secretaria);

        // operador -------------------------------------------------
        Operador operador = new Operador();
        operador.setNome("joão");
        operador.setEmail("joao1981@vai.com");
        operador.setIdFunc(789);
        operador.setValorHora(10);

        RegistroPonto ope = new RegistroPonto();
        ope.setHoraEntrada(LocalDateTime.of(2020, 07, 22, 10, 15, 30));
        ope.setHoraSaida(LocalDateTime.of(2020, 07, 22, 20, 15, 30));
        ge.setIdRegPonto(operador.getIdFunc());
        ge.setFunc(operador);



    }
}








