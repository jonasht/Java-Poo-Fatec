package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        LoginESenha idandPassowords = new LoginESenha();

        /// cadastrando
        idandPassowords.setLongininfo("felipe", "1234");

        LoginPage loginPage = new LoginPage(idandPassowords.getLoginInfo());


    }
}
