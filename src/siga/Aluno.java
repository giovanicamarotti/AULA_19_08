package siga;


public class Aluno extends Pessoa {

    private String matricula;
    private double media;

    /*Gio: Foi-se criada um construtor que pede o nome e a matrícula do aluno para que se crie um objeto consistente
    além disso os getters e setters apropriados estão criados*/
public Aluno(String nome, String matricula) {
    super(nome);
    this.matricula = matricula;
    }


public String getMatricula() {
    return matricula;
}

public void setMatricula(String matricula) {
    this.matricula = matricula;
}

public double getMedia() {
    return media;
}

public void setMedia(double media) {
if (media < 0 || media > 10) {
    throw new IllegalArgumentException("Média inválida: " + media);
    }
    this.media = media;
}

}