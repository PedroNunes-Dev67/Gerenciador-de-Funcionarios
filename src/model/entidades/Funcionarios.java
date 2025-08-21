package model.entidades;

import model.excecoes.MinhasExcecoes;

public abstract class Funcionarios {

    private String nomeFunc;
    protected Double salarioBase;

    public Funcionarios(){
    }

    public Funcionarios(String nomeFunc, Double salarioBase) {
        if (salarioBase<=0.0){
            throw new MinhasExcecoes("Erro ao analisar funcionário! Salário base precisa ser maior que zero!");
        }
        this.nomeFunc = nomeFunc;
        this.salarioBase = salarioBase;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract Double calcularSalario();
}
