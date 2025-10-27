public class Aluno {

    public String nome;
    private int idade;
    protected String matricula;

    public Aluno(String nome, String matricula, int idade){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }
    public void exibirDados(){
        System.out.println("Nome do Aluno: " + nome + "\n" +
            "Nº de matrícula do aluno: " + matricula + "\n" +
            "Idade: " +  idade);
        validarIdade();
    }
    private void validarIdade(){
        if(idade > 0){
            System.out.println("Idade válida.");
        }
        else{
            System.out.println("Idade inválida.");
        }
    }
}
