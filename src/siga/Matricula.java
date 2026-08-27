package siga;

public class Matricula {

    private double valorBase;
    private String tipoDesconto;   

    public double calcularMensalidade() {
        if (tipoDesconto.equals("BOLSISTA")) {
            return valorBase * 0.5;
        } else if (tipoDesconto.equals("CONVENIO")) {
            return valorBase * 0.8;
        } else if (tipoDesconto.equals("FUNCIONARIO")) {
            return valorBase * 0.7;
        } else {
            return valorBase; 
        }
    }
}
