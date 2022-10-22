package com.company.Pessoa;

import com.company.Endereco.Endereco;
import com.company.validaCPF.ValidaCPF;
import com.company.validaData.ValidaData;

public class DadosPessoa extends ValidaData implements ValidaCPF {
    protected String CPF;
    protected String nome;
    protected int telefone1;
    protected int telefone2;
    protected String email;
    protected String sexo;
    protected String profissao;
    protected Endereco address;

    public DadosPessoa(){}

    public DadosPessoa(String CPF, String nome, int telefone1, String email, String profissao, Endereco address) {
        setCPF(CPF);
        setNome(nome);
        setTelefone1(telefone1);
        setEmail(email);
        setProfissao(profissao);
        setAddress(address);
    }

    public DadosPessoa(String CPF, String nome, int telefone1, int telefone2, String email, String sexo, String profissao, Endereco address) {
        setCPF(CPF);
        setNome(nome);
        setTelefone1(telefone1);
        setTelefone2(telefone2);
        setEmail(email);
        setSexo(sexo);
        setProfissao(profissao);
        setAddress(address);
    }

    public String getCPF() {
        return CPF;
    }

    public boolean setCPF(String CPF) {
            boolean temp = ValidaCPF.isCPF(CPF);
            if(temp == true) {
                this.CPF = CPF;
                return true;
            }else {
                return false;
            }
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome.length() > 0) {
            this.nome = nome;
            return true;
        }
        return false;

    }

    public int getTelefone1() {
        return telefone1;
    }

    public boolean setTelefone1(int telefone1) {
        if (telefone1 > 0) {
            this.telefone1 = telefone1;
            return true;
        }
        return false;

    }

    public int getTelefone2() {
        return telefone2;
    }

    public boolean setTelefone2(int telefone2) {
        if (telefone2 > 0) {
            this.telefone2 = telefone2;
            return true;
        }
        return false;
    }

    public String getEmail() {
        return email;
    }

    public boolean setEmail(String email) {
        if (email.length() > 0) {
            this.email = email;
            return true;
        }
        return false;
    }

    public String getSexo() {
        return sexo;
    }

    public boolean setSexo(String sexo) {
        if (sexo.length() > 0) {
            this.sexo = sexo;
            return true;
        }
        return false;
    }

    public String getProfissao() {
        return profissao;
    }

    public boolean setProfissao(String profissao) {
        if(profissao.length() > 0) {
            this.profissao = profissao;
            return true;
        }
        return false;
    }

    public Endereco getAddress() {
        return address;
    }

    public void setAddress(Endereco address) {
        this.address = address;
    }
    public String toString(){
        return getCPF() +", "+ getNome() +", "+ getEmail() +", "+ getProfissao() +", "
                + getSexo() +", "+ getTelefone1() +", "+ getTelefone2() +", "+ address.toString();
    }
}
