package com.company.Pessoa;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class DadosClientes {
    private ArrayList<Cliente> vetClientes = new ArrayList<Cliente>();

    FileOutputStream arqEscrita = null;
    ObjectOutputStream objEscreve = null;


    public void cadastrarClientes(Cliente cli){
        this.vetClientes.add(cli);
        System.out.println("Total de clientes cadastrados: ");
        System.out.println(this.vetClientes.size());

        try{
            arqEscrita = new FileOutputStream("DadosClientes");
            objEscreve = new ObjectOutputStream(arqEscrita);
            objEscreve.writeObject(cli);

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


    public Cliente buscarCliente(String CPF) {
        Cliente cli = null;

        for (Cliente clibusca : this.vetClientes) {
            if (clibusca.getCPF().equals(CPF)) {
                cli = clibusca;
                break;
            }
        }
        return cli;
    }

    public void removerCliente(String CPF){
        Cliente cliRemove = buscarCliente(CPF);
        if(cliRemove != null){
            this.vetClientes.remove(cliRemove);
        }

    }

    public void verClientes(){
        for (Cliente cli : this.vetClientes){
            System.out.println("Cliente: " + cli.toString());
        }
    }

}
