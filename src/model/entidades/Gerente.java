package model.entidades;

public class Gerente extends Funcionarios{

    private Double bonus;

    public Gerente(){
        super();
    }

    public Gerente(String nomeFunc, Double salarioBase, Double bonus) {
        super(nomeFunc, salarioBase);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

    @Override
    public Double calcularSalario(){
        return salarioBase + bonus;
    }

    @Override
    public String toString() {
        return "Gerente: "+getNomeFunc()+" | Salário: "+String.format("%.2f",calcularSalario());
    }
}
