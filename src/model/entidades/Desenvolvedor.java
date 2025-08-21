package model.entidades;

public class Desenvolvedor extends Funcionarios{

    private Integer projetos;

    public Desenvolvedor(){
        super();
    }

    public Desenvolvedor(String nomeFunc, Double salarioBase, Integer projetos) {
        super(nomeFunc, salarioBase);
        this.projetos = projetos;
    }

    public Integer getProjetos() {
        return projetos;
    }

    public void setProjetos(Integer projetos) {
        this.projetos = projetos;
    }

    @Override
    public Double calcularSalario(){
        return salarioBase + (projetos*500);
    }

    @Override
    public String toString() {
            return "Desenvolvedor: "+getNomeFunc()+" | Salário: "+String.format("%.2f",calcularSalario());
    }
}
