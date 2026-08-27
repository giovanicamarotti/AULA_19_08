package siga;

//Gio: Foram substituídos os atributos públicos por privados, e foram criados os getters e setters apropriados para garantir a integridade do objeto
public class Main {

    public static void main(String[] args) {
        System.out.println("=== SIGA - Sistema de Gestão Acadêmica Simplificado ===");
        System.out.println("Versão INICIAL (a ser refatorada na Aula 1)\n");

        // Criação de um aluno. Como não há construtor, preenchemos campo a campo.
        Aluno a1 = new Aluno("Maria Silva", "2026001");
        a1.setMedia(8.5);
        a1.setAtivo(true);


        Aluno a2 = new Aluno("João Souza", "2026002");
        a2.setMedia(-5);      
        a2.setAtivo(true);

        imprimirAluno(a1);
        imprimirAluno(a2);

        Professor p1 = new Professor("Ana Pereira", "SP12345");
        p1.setAtivo(true);

        imprimirProfessor(p1);

        System.out.println("\nObserve que o programa aceitou médias inválidas (-5 e 15).");
        System.out.println("Sua tarefa na Aula 1 é refatorar este código para impedir isso.");

}

private static void imprimirAluno(Aluno aluno) {
    System.out.println("Aluno: " + aluno.getNome()
            + " | Matrícula: " + aluno.getMatricula()
            + " | Média: " + aluno.getMedia()
            + " | Ativo: " + (aluno.isAtivo() ? "sim" : "não"));
}

private static void imprimirProfessor(Professor professor) {
    System.out.println("Professor: " + professor.getNome() + " (SIAPE " + professor.getSiape() + ")"
            + " Ativo: " + (professor.isAtivo() ? "sim" : "não"));
}
}