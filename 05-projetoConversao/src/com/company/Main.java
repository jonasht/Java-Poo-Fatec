package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        String strValor = "10";
        // converte strValor para int
        int soma = Integer.parseInt(strValor) + x;

        System.out.println("a soma dos valores:" + soma);
        
        float y = 12.123f;
        String strValor2 = "12.2123";
        float resultado = y + Float.parseFloat(strValor2);
        System.out.println("a soma dos calores " + resultado);
        
        float dado = 2323243.23f;
        String frase = "um magistrado perde ";
        String completar = "por mes";
        String fraseCompleta = frase + Float.toString(dado) + completar;
        
        /*
        passar de String para Numerico Tipo.parseTipo(variavelString)
        
        Passar de Numerico para string Tipo.toString(variavelTipo)
         */
        
        int somar_inteiro = 30 + (int)10.8f + 20;
        System.out.println("somar_inteiro = " + somar_inteiro);
        
        float somar_float = 23 + 23.2f + 30;
        System.out.println("somar_float = " + somar_float);
    }
}
