package com.company.Pessoa;

import com.company.Endereco.Endereco;
import com.company.Login.Login;
import com.company.Tansacao.Transacao;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Corretor extends Funcionario{
    private static final double comissao = 0.05;
    private Date tempoCorretor;
    private String formado;
    private double vendasMes;
    private Transacao trans;

    public Corretor(String CPF, String nome, int telefone1, String email, String profissao, Endereco address, Date dataIngresso, Login login, double salarioTotal, String formado) {
        super(CPF, nome, telefone1, email, profissao, address, dataIngresso, login, salarioTotal);
        setFormado(formado);
    }

    public Corretor(String CPF, String nome, int telefone1, int telefone2, String email, String sexo, String profissao, Endereco address, Date dataIngresso, double salarioBase, Login login, double comissao, Date tempoCorretor, String formado, double vendasMes) {
        super(CPF, nome, telefone1, telefone2, email, sexo, profissao, address, dataIngresso, salarioBase, login);
        setComissao(comissao);
        setTempoCorretor(tempoCorretor);
        setFormado(formado);
        setVendasMes(vendasMes);
    }

    public static double getComissao() {
        return comissao;
    }

    public static boolean setComissao(double comissao) {
        if(comissao > 0) {
            comissao = comissao;
            return true;
        }else
            return false;
    }

    public Date getTempoCorretor() {
        return tempoCorretor;
    }

    public boolean setTempoCorretor(Date tempoCorretor) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String dat = format.format(tempoCorretor);

        if (isDateValid(dat)){
            tempoCorretor = tempoCorretor;
            return true;

        }else
            return false;
    }

    public String getFormado() {
        return formado;
    }

    public boolean setFormado(String formado) {
        if(formado.length() > 0) {
            formado = formado;
            return true;
        }else
            return false;
    }

    public double getVendasMes() {
        return vendasMes;
    }

    public boolean setVendasMes(double vendasMes) {
        if(vendasMes > 0) {
            this.vendasMes = vendasMes;
            return true;
        }else
            return false;
    }

    public double calcularSalario(){
        this.salarioTotal = salarioBase + (vendasMes * comissao);
        return salarioTotal;

    }

    public boolean zeraVendas(){
        if(vendasMes > 0) {
            this.vendasMes = 0;
            return true;
        }else
            return false;
    }

    @Override
    public String toString() {
        return "Corretor: " + super.toString() + "tempoCorretor: " + tempoCorretor +
                ", formado: " + formado + ", vendasMes: " + vendasMes + ", trans: " + trans;
    }
}
