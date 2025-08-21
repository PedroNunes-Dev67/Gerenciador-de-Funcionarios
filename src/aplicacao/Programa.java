package aplicacao;

import model.entidades.Desenvolvedor;
import model.entidades.Estagiario;
import model.entidades.Funcionarios;
import model.entidades.Gerente;
import model.enums.Cargos;
import model.excecoes.MinhasExcecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Funcionarios> listaFunc = new ArrayList<>();

        try {
            System.out.print("Quantos funcionarios serão analisados: ");
            int N = sc.nextInt();

            for (int i = 0; i < N; i++) {
                System.out.println("Entre com os dados do funcionario: ");
                System.out.print("Nome do funcionario: ");
                sc.nextLine();
                String nome =  sc.nextLine();
                System.out.print("Salario base: ");
                double salarioBase = sc.nextDouble();
                System.out.print("Cargo do funcionario (GERENTE/ESTAGIARIO/DEV): ");
                Cargos cargos = Cargos.valueOf(sc.next().toUpperCase());
                if (cargos == Cargos.DEV) {
                    System.out.print("Quantidade de projetos: ");
                    int projetos = sc.nextInt();
                    Funcionarios func = new Desenvolvedor(nome, salarioBase, projetos);
                    listaFunc.add(func);
                } else if (cargos == Cargos.GERENTE) {
                    System.out.print("Bônus: ");
                    double bonus = sc.nextDouble();
                    Funcionarios func = new Gerente(nome, salarioBase, bonus);
                    listaFunc.add(func);
                } else {
                    System.out.print("Horas trabalhadas: ");
                    int horasTrabalhadas = sc.nextInt();
                    Funcionarios func = new Estagiario(nome, salarioBase, horasTrabalhadas);
                    listaFunc.add(func);
                }
            }
        }
        catch (MinhasExcecoes e){
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Erro! Campo digitado INCORRETAMENTE!");
        }
        System.out.println();
        for (Funcionarios f : listaFunc){
            System.out.println(f);
        }




        sc.close();
    }
}
