package com.company;

import java.util.Scanner;

public class ContaTeste {

    //atributo
    public Conta cc = new Conta(); //operador new para criar um objeto

    public static void main(String[] args) {
        //Entrada de dados do usuário. Preciso da Classe Scanner
        ContaTeste gerenciar = new ContaTeste(); //gerenciar a aplicacao
        Scanner sc = new Scanner(System.in);

        int opc = 0;
        do{
            System.out.println("--------------------------------");
            System.out.println("|- M E N U  P R I N C I P A L -|");
            System.out.println("--------------------------------");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Consultar");
            System.out.println("3.. Depositar");
            System.out.println("4.. Sacar");
            System.out.println("9.. Sair");
            System.out.printf("Digite sua opcao: ");
            opc = Integer.parseInt(sc.nextLine());
            System.out.println();
            switch (opc){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execConsultar();
                    break;
                case 3:
                    gerenciar.execDepositar();
                    break;
                case 4:
                    gerenciar.execSacar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc!=9);
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta");
        cc.setConta(sc.nextLine());
        System.out.println("Digite o nome do cliente");
        cc.setNomeCliente(sc.nextLine());
        System.out.println("Digite o nome da agencia");
        cc.setAgencia(sc.nextLine());
        System.out.println("Cadastrado com sucesso");
    }
    public void execConsultar(){
        cc.imprimir();
    }
    public void execDepositar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do deposito");
        double valor = Double.parseDouble(sc.nextLine());
        cc.depositar(valor);
        System.out.println("Valor depositado na conta");
    }
    public void execSacar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do saque");
        double valor = Double.parseDouble(sc.nextLine());
        if(cc.sacar(valor)==1){
            System.out.println("Saque efetuado com sucesso");
        }else{
            System.out.println("Saldo insuficiente na conta");
        }
    }
}
