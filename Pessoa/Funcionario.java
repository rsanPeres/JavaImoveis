package com.company.Pessoa;

import com.company.Endereco.Endereco;
import com.company.Login.Login;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Funcionario extends DadosPessoa{
    protected Date dataIngresso;
    protected static double salarioBase;
    protected Login login;
    protected double salarioTotal;

    public Funcionario(){}

    public Funcionario(String CPF, String nome, int telefone1, String email, String profissao, Endereco address, Date dataIngresso, Login login, double salarioTotal) {
        super(CPF, nome, telefone1, email, profissao, address);
        this.dataIngresso = dataIngresso;
        this.login = login;
        this.salarioTotal = salarioTotal;
    }

    public Funcionario(String CPF, String nome, int telefone1, int telefone2, String email, String sexo, String profissao, Endereco address, Date dataIngresso, double salarioBase, Login login) {
        super(CPF, nome, telefone1, telefone2, email, sexo, profissao, address);
        setDataIngresso(dataIngresso);
        setSalarioBase(salarioBase);
        setLogin(login);
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public boolean setDataIngresso(Date dataIngresso) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        String dat = format.format(dataIngresso);
        if(isDateValid(dat)) {
            this.dataIngresso = dataIngresso;
            return true;
        }else
            return false;
    }

    public static double getSalarioBase() {
        return salarioBase;
    }

    public static boolean setSalarioBase(double salarioBase) {
        if(salarioBase > 0) {
            salarioBase = salarioBase;
            return true;
        }else
            return false;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public boolean setSalarioTotal(double salarioTotal) {
        if(salarioTotal > 0) {
            this.salarioTotal = salarioTotal;
            return true;
        }else
            return false;
    }

    public String recuperaSenha(String usuario){
        return this.login.getSenha();
    }

    public void alteraSenha(String senha){
       this.login.setSenha(senha);
    }

    public double calcularSalario(){
        return getSalarioBase();
    }

    @Override
    public String toString() {
        return "Funcionario: " + super.toString() + "dataIngresso: " + dataIngresso + ", salarioTotal=" + salarioTotal;
    }
}
