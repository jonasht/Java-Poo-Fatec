package com.company;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();

    public static void main(String[] args) {

	// write your code here

        Scanner leitura = new Scanner(System.in);
        ContaTeste contaTeste = new ContaTeste();

        int opc = 0;

        do {
            System.out.println(" =-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-==-=-= ");
            System.out.println("\tmenu principal");
            System.out.println(" 1 cadastrar");
            System.out.println(" 2 depositar");
            System.out.println(" 3 sacar");
            System.out.println(" 4 consultar");
            System.out.println(" 5 para sair");

            opc = Integer.parseInt(leitura.nextLine());
            switch (opc){
                case 1:
                    contaTeste.exeCadastrar();
                    break;
                case 2:
                    contaTeste.exeDepositar();
                    break;
                case 3:
                    contaTeste.exeSacar();
                    break;
                case 4:
                    contaTeste.exeConsultar();
                    break;
                case 5:
                    System.out.println("fim");
                    break;
                default:
                    System.out.println("opção digitada invalida");

            }


        }while (opc != 5 );

    }

    public  void exeCadastrar(){

        Scanner leitura = new Scanner(System.in);

        System.out.printf("=-=-=-=-=-=-==-=-=-=-=-=-==-=-=-=-=-=-==-=-=-=-=-=-=");

        System.out.println("Nome do cliente: ");
        cc.nomeCliete = leitura.nextLine();

        System.out.println("na agencia:");
        cc.agencia = leitura.nextLine();

        System.out.println("numero da conta: ");
        cc.conta = leitura.nextLine();

        System.out.println("conta cadastrada com sucesso");


    }

    public void exeConsultar(){

        System.out.println("situação da conta");
        cc.mostrar();

    }

    public void exeSacar(){
        Scanner leitura = new Scanner(System.in);
        double valorSaque;

        System.out.println("qual valor do saque:");
        valorSaque = double.parseDouble(leitura);

        if (cc.sacar(valorSaque) == 1){
            System.out.println("saque foi feito com sucesso");
        }else {
            System.out.println("saldo insuficiente");
        }

    }

    public void exeDepositar(){
        Scanner leitura = new Scanner(System.in);

        System.out.println("qual valor do deposito:");
        double valorDeposito = double.parseDouble(leitura.nextLine());

        cc.depositar(valorDeposito);
    }
}
