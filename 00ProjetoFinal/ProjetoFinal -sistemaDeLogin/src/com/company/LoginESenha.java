package com.company;

import java.util.HashMap;

public class LoginESenha {

    // hash mapa
    HashMap<String, String> longininfo = new HashMap<String, String>();
    public HashMap<String, String> getLongininfo() {
        return longininfo;
    }

    public void setLongininfo(String login, String senha) {

        longininfo.put(login, senha);
    }
    LoginESenha(){

        longininfo.put("jonas", "123");
        longininfo.put("professor", "123");

    }

    protected HashMap getLoginInfo(){
        return longininfo;
    }
}
