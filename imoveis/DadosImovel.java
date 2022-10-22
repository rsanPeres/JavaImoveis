package com.company.imoveis;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;



public class DadosImovel {
    private ArrayList<Imovel> vetImoveis = new ArrayList<Imovel>();
    private CaracteristicasImovel imEspecial = new CaracteristicasImovel();
    private Casa casa = new Casa();

    FileOutputStream arqEscrita = null;
    ObjectOutputStream objEscreve = null;

    public void cadastraImovel(Imovel im){
        this.vetImoveis.add(im);
        System.out.println("Total de imoveis cadastrados: ");
        System.out.println(this.vetImoveis.size());

        try{
            arqEscrita = new FileOutputStream("DadosImoveis");
            objEscreve = new ObjectOutputStream(arqEscrita);


            objEscreve.writeObject(im);

        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally{
            try {
                if(arqEscrita !=null) arqEscrita.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        }
    }

    public boolean removeImovel(String imovelID){
        Imovel iremove = this.verImovelporID(imovelID);
        if(iremove != null) {
            this.vetImoveis.remove(iremove);
            return true;
        }else
            return false;
    }

    public Imovel verImovelporID(String imovelID){
        Imovel im = null;
        for(Imovel imov : this.vetImoveis){
            if(imov.getImovelID().equals(imovelID)){
                im = imov;
                break;
            }
        }
        return im;
    }

    public void verImoveis(){
        for (Imovel im : this.vetImoveis){
            System.out.println("Imoveis: " + im.toString());
        }
    }

/*
    public String verImovelNegocio(String tipoNegocio){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (imo.getTipoNegocio().equals(tipoNegocio)){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }

    public String verImovelTempoDisponível(Date dataDisponibilidade){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (imo.getDataDisponibilidade().compareTo(dataDisponibilidade) == 0){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }


    public String verImovelDataConstrucao(Date dataConstrucao){

        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (imo.dataConstrucao.compareTo(dataConstrucao) == 0){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }

    public String verImovelPrecoProprietario(double precoProprietario){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (Double.compare(imo.getPrecoProprietario(), precoProprietario) == 0){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;

    }

    public String verImovelRua(String rua){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (imo.address.getRua().equals(rua)){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }

    public String verImovelCEP(int numCep){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (Integer.valueOf(imo.address.getCep()).equals(Integer.valueOf(numCep))){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }


    public String verImovelCidade(String cidade){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (imo.address.getCidade().equals(cidade)){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }

    public String verImovelEstado(String estado){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (imo.address.getEstado().equals(estado)){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }


    public String verImovelBairro(String bairro){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (imo.address.getBairro().equals(bairro)){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }

    public String verImovelGaragem(int qtdVagaGaragem){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (Integer.valueOf(imo.getQtdSuites()).equals(Integer.valueOf(qtdVagaGaragem))){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }

    public String verImovelSuite(int qtdSuites){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (Integer.valueOf(imo.getQtdSuites()).equals(Integer.valueOf(qtdSuites))){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }

    public String verImovelQuartos(int qtdQuartos){
        String imov = null;

        for (Imovel imo: this.vetImoveis){
            if (Integer.valueOf(imo.getQtdQuartos()).equals(qtdQuartos)){
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }
    public String verImovelArmarios(boolean armariosEmbutidos) {
        String imov = null;

        for (Imovel imo : this.vetImoveis) {
            if (imo.isArmariosEmbutidos() == armariosEmbutidos) {
                imov = imo.toString();
                System.out.println("Imovel: " + imov);
            }
        }
        return imov;
    }
*/
}

