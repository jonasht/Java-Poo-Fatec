package com.company;

public class GereciarFarmaceutica {

    public static void main(String[] args) {
	// write your code here
        // write your code here
        //Criando a farmaceutica
        Farmaceutica farmaceutica = new Farmaceutica();
        farmaceutica.setIdFarmaceutica(1);
        farmaceutica.setNomeFarmaceutica("Laboratório Corona");
        farmaceutica.setCidade("Mogi Guaçu");
        farmaceutica.setUf("SP");


        //Criar dois medicamentos de uma mesma farmaceutica
        //Aspirina, segundo Gelol
        Medicamento medicamento1 = new Medicamento();
        medicamento1.setId(1);
        medicamento1.setMedicamento("Aspirina");
        medicamento1.setConcentracao("5G");
        medicamento1.setForma("Comprimido");
        medicamento1.setNumRegistro("1234");
        medicamento1.setPreco(323.89);
        medicamento1.alterarPreco();
        medicamento1.setFarmaceutica(farmaceutica);
        medicamento1.registrarData();
        medicamento1.imprimir();

        Medicamento medicamento2 = new Medicamento();
        medicamento2.setId(2);
        medicamento2.setMedicamento("Gelol");
        medicamento2.setConcentracao("concentrado");
        medicamento2.setForma("Aerosol");
        medicamento2.setNumRegistro("234");
        medicamento2.setPreco(15.99);
        medicamento2.alterarPreco();
        medicamento2.setFarmaceutica(farmaceutica);
        medicamento2.registrarData();
        medicamento2.imprimir();



    }
}
