package com.company.Tansacao;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class DadosTransacao {
    private ArrayList<Transacao> vetTrans = new ArrayList<Transacao>();
    FileOutputStream arqEscrita = null;
    ObjectOutputStream objEscreve = null;


    public void cadastra(Transacao novaTrans){
        this.vetTrans.add(novaTrans);
        System.out.println("Total de transações: ");
        System.out.println(this.vetTrans.size());

        try{
            arqEscrita = new FileOutputStream("DadosTransacao");
            objEscreve = new ObjectOutputStream(arqEscrita);
            objEscreve.writeObject(novaTrans);

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

    public void listar(){
        for(Transacao trans : this.vetTrans){//
            System.out.println("Transação: " + trans.toString());
        }
    }

    public Transacao buscar(int num){
        Transacao transNum = null;
        for (Transacao trans: this.vetTrans){
            if (trans.getNumContrato() == num){
                transNum = trans;
                break;
            }
        }
        return transNum;
    }

    public boolean excluir(int num){
        Transacao transRemove = this.buscar(num);
        if(transRemove != null) {
            this.vetTrans.remove(transRemove);
            return true;
        }else
            return false;
    }

}
