package poo_prova_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private String nome;
    private String cpf;
    private String departamento;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cpf, String departamento, String cargo, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.departamento = departamento;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    //construtor default aqui
    //metodos aqui
     //to string aqui

    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", cpf=" + cpf + ", departamento=" + departamento + ", cargo=" + cargo + ", salario=" + salario + ", ativo=" + ativo + '}';
    }
    
}
