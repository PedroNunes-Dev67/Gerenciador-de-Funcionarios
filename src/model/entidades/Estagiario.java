package model.entidades;

public class Estagiario extends Funcionarios{

    private Integer horasTrabalhadas;

    public Estagiario(){
        super();
    }

    public Estagiario(String nomeFunc, Double salarioBase, Integer horasTrabalhadas) {
        super(nomeFunc, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public Integer getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public Double calcularSalario(){
        return salarioBase + (horasTrabalhadas * 15);
    }

    @Override
    public String toString() {
        return "Estagiario: "+getNomeFunc()+" | Salário: "+String.format("%.2f",calcularSalario());
    }
}
