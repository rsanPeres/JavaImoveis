package com.company.Endereco;

public class Endereco {
    protected String rua;
    protected  int num;
    protected String complemento;
    protected int cep;
    protected String cidade;
    protected String estado;
    protected String bairro;

    public Endereco(String rua, int num, String cidade, String estado){
        setRua(rua);
        setNum(num);
        setCidade(cidade);
        setEstado(estado);
    }

    public Endereco(String rua, int num, String complemento, int cep, String cidade, String estado, String bairro) {
        setRua(rua);
        setNum(num);
        setComplemento(complemento);
        setCep(cep);
        setCidade(cidade);
        setEstado(estado);
        setBairro(bairro);
    }

    public String getRua() {
        return rua;
    }

    public boolean setRua(String rua) {
        if (rua.length() > 0) {
            this.rua = rua;
            return true;
        }else
            return false;
    }

    public int getNum() {
        return num;
    }

    public boolean setNum(int num) {
        if (num > 0) {
            this.num = num;
            return true;
        }else
            return false;
    }

    public String getComplemento() {
        return complemento;
    }

    public boolean setComplemento(String complemento) {
        if(complemento.length() > 0) {
            this.complemento = complemento;
            return true;
        }else
            return false;
    }

    public int getCep() {
        return cep;
    }

    public boolean setCep(int cep) {
        if(cep > 0) {
            this.cep = cep;
            return true;
        }else
            return false;
    }

    public String getCidade() {
        return cidade;
    }

    public boolean setCidade(String cidade) {
        if(cidade.length() > 0) {
            this.cidade = cidade;
            return true;
        }else
            return false;
    }

    public String getEstado() {
        return estado;
    }

    public boolean setEstado(String estado) {
        if(estado.length() > 0) {
            this.estado = estado;
            return true;
        }else
            return false;
    }

    public String getBairro() {
        return bairro;
    }

    public boolean setBairro(String bairro) {
        if(bairro.length() > 0) {
            this.bairro = bairro;
            return true;
        }else
            return false;
    }

    public String toString(){
        return getRua() +", "+ getNum() +", "+ getComplemento() +", "+ getCep() +", "+ getBairro() +", "+ getCidade() +", "+ getEstado();
    }

}
