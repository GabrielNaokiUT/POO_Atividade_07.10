public class Main {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Gabriel Naoki", "123456", 20);
        aluno.exibirDados();
        Aluno student = new Aluno("Fulano de Tal", "654321", 20);
        student.exibirDados();
        aluno.nome = "João da Siva";
        aluno.matricula = "010203";
        aluno.exibirDados();
    }
}

//tentar acessar o atributo idade e o método validarIdade vai dar erro, por serem private//
//já ao tentar acessar nome e matricula dá certo por serem public e protected, respectivamente//