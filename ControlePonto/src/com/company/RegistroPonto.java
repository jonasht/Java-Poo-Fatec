package com.company;

import java.time.LocalDate;

public class RegistroPonto {
    private long idRegPonto;
    private Funcionario func;
    private LocalDate dataRegistro;
    private LocalDate horaEntrada;
    private LocalDate horaSaida;

    public long getIdRegPonto() {
        return idRegPonto;
    }

    public void setIdRegPonto(long idRegPonto) {
        this.idRegPonto = idRegPonto;
    }

    public Funcionario getFunc() {
        return func;
    }

    public void setFunc(Funcionario func) {
        this.func = func;
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public LocalDate getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalDate horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalDate getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(LocalDate horaSaida) {
        this.horaSaida = horaSaida;
    }
    public void apresentarRegistroPonto(){
        System.out.println("nome do funcionario: " + func.getNome());
        System.out.println("data de registro: " + getDataRegistro());
        System.out.println("hora de entrada: " + getHoraEntrada());
        System.out.println("hora de saida: " + getHoraSaida());

    }
}
