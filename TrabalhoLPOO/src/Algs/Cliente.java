package Algs;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcos
 */
public class Cliente {
    private int idCliente; 
    private static int contCliente = 0;
    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;
    private String endereco;
    private double renda;
    private int idConta;
    private boolean haveConta = false;
    
    public Cliente(String nome, String sobrenome, String rg, String cpf, String endereco, double renda) {
        this.idCliente = 5500 + contCliente;
        Cliente.contCliente++;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.renda = renda;
    }

    public int getId(){
        return idCliente;
    }
 
    public void setIdConta(int idConta){
        this.idConta = idConta;
        this.haveConta = true;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public double getRenda() {
        return renda;
    }
    
    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    public boolean getHaveConta() {
        return haveConta;
    }
}
