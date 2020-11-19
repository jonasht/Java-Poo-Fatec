package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalFuncionario {
    public List<Funcionario> listaDeFuncionario = new ArrayList<>();



    public static void main(String[] args) {
	// write your code here
        PrincipalFuncionario principal = new PrincipalFuncionario();
        Scanner sc = new Scanner(System.in);
        int opc;

        do{
            System.out.println("menu principal");
            System.out.println("1 - cadastrar");
            System.out.println("2 - bonificar");
            System.out.println("3 - consultar");
            System.out.println("9 - sair");
            System.out.println("opcao:");
            opc = Integer.parseInt(sc.nextLine());

        switch (opc) {
            case 1:
                principal.executarCadastro();
                break;
                case 2:
                    principal.executarBonificacao();
            break;
            case 3:
                principal.executarConsulta();
                break;
            case 9:
                System.out.println("saindo do programa");
                break;
                default:
                    System.out.println("opcao invalida");

        }

        }  while (opc != 9);



    }
    public void executarCadastro() {
               Scanner sc = new Scanner(System.in);
               Funcionario funcionario = new Funcionario();

    System.out.println("digite o nome do funionario");
        funcionario.setNome(sc.nextLine());

        System.out.println("nome do departamento:");
        funcionario.setDepartamento(sc.nextLine());

        System.out.println("RG:");
        funcionario.setRg(sc.nextLine());

        System.out.println("salario:");
        funcionario.setSalario(Double.parseDouble(sc.nextLine()));

        funcionario.setEstaNaEmpresa(true);

        System.out.println("funcionario cadastrado com sucesso");
        listaDeFuncionario.add(funcionario);
        
        System.out.println();
        System.out.println();


    }


    public void executarBonificacao() {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite o rg do funcionario a sesr boneficado");
        String rgDoFuncionario = sc.nextLine();

        for (Funcionario func: listaDeFuncionario){
            if (func.getRg().equals(rgDoFuncionario)){
                System.out.println("digite o valor da boneficação");
                double valor = Double.parseDouble(sc.nextLine());
                func.boneficar(valor);

                System.out.println("funcionario" + func.getNome());
                System.out.println();
                return;
            }
        }
        System.out.println("rg não pertence a funcionario cadastrado");

    }

    public void executarConsulta() {
        for (Funcionario func: listaDeFuncionario){
            System.out.println(func.toString());
            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        }
    }
}
