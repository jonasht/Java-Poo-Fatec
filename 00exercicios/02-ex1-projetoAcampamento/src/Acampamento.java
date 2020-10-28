public class Acampamento {
    public String nome;
    public char equipe = ' ';
    public int idade;


    public void imprimir(){
        System.out.println("\n=====================");
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        if (equipe != ' ')
        System.out.println("equipe = " + equipe);
        System.out.println("=====================");

    }
    public void separarGrupo(){
        if (idade >= 6)
            equipe = 'A';
        if (idade >= 11)
            equipe = 'B';
        if (idade > 21)
            equipe = 'C';

    }
}
