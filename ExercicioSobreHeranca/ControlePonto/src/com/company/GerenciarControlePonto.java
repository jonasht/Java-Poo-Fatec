package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static java.lang.Thread.sleep;

public class GerenciarControlePonto {

    public static void main(String[] args) {
	// write your code here

        // gerente -----------------------
        Gerente gerente = new Gerente();

        gerente.setLogin("gerente jonas");
        gerente.setSenha("123");
        gerente.setNome("jonas");
        gerente.setEmail("jonas@outlook.com");
        gerente.setIdFunc(123);
        gerente.setDocumento("123");

        RegistroPonto ge = new RegistroPonto();


        ge.setIdRegPonto(gerente.getIdFunc());
        ge.setFunc(gerente);
        ge.setDataRegistro(LocalDate.now());
        ge.setHoraEntrada(LocalDateTime.of(2020, 07, 22, 10, 15, 30));
        try{
            sleep(1000);
        }catch(Exception ignored){}

        ge.setHoraSaida(LocalDateTime.of(2020, 07, 22, 20, 15, 30));


        /// secretaria -----------------------------------------
        Secretaria secretaria = new Secretaria();


        secretaria.setNome("secretaria maria");
        secretaria.setRamal("E123");
        secretaria.setTelefone("019 1234-5667");
        secretaria.setEmail("maria@outlook.com");
        secretaria.setIdFunc(123);
        secretaria.setDocumento("123");

        RegistroPonto se = new RegistroPonto();

        se.setIdRegPonto(secretaria.getIdFunc());
        se.setFunc(secretaria);

        se.setDataRegistro(LocalDate.now());
        se.setHoraEntrada(LocalDateTime.of(2020, 07, 22, 10, 15, 30));
        try{
            sleep(1000);
        }catch(Exception ignored){}
        se.setHoraSaida(LocalDateTime.of(2020, 07, 22, 20, 15, 30));


        // operador -------------------------------------------------
        Operador operador = new Operador();
        operador.setNome("operador joão");
        operador.setEmail("joao1981@vai.com");
        operador.setIdFunc(789);
        operador.setValorHora(10);

        RegistroPonto ope = new RegistroPonto();


        ope.setIdRegPonto(operador.getIdFunc());
        ope.setFunc(operador);

        ope.setDataRegistro(LocalDate.now());
        ope.setHoraEntrada(LocalDateTime.of(2020, 07, 22, 10, 15, 30));
        try{
            sleep(1000);
        }catch(Exception ignored){}

        ope.setHoraSaida(LocalDateTime.of(2020, 07, 22, 20, 15, 30));

        System.out.println();
        ge.apresentarRegistroPonto();
        se.apresentarRegistroPonto();
        ope.apresentarRegistroPonto();
        System.out.println("=============================================");





    }
}








