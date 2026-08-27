package siga;

public class Professor extends Pessoa {
    
    //Gio: Encapsulamento aplicado e um construtor criado para garantir estabilidade em nosso objeto
    private String siape;


    public Professor(String nome, String siape) {
        super(nome);
        this.siape = siape;
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }
}
