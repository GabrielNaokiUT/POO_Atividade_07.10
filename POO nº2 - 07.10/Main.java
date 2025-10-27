public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel Naoki", "123456", 20);
        aluno.exibirDados(); //todos os atributos e o metodo validarIdade exibidos, incluindo os privates//
        System.out.println(" ");
        Aluno student = new Aluno("Fulano de Tal", "654321", -2);
        System.out.println("Aluno: " + student.nome);
        System.out.println("Nº de matrícula do aluno: " + student.matricula); //atributos aluno e matricula exibidos diretamente, mas idade e meétodo validarIdade não podem por serem private//
    }
}
