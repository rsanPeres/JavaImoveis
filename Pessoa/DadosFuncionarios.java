package com.company.Pessoa;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DadosFuncionarios {

        private ArrayList<Funcionario> vetFuncionarios = new ArrayList<Funcionario>();

        FileOutputStream arqEscrita = null;
        ObjectOutputStream objEscreve = null;


        public void cadastrarFuncionarios(Funcionario func) {
            this.vetFuncionarios.add(func);
            System.out.println("Total de Funcionarios cadastrados: ");
            System.out.println(this.vetFuncionarios.size());

            try {
                arqEscrita = new FileOutputStream("DadosFuncionarios");
                objEscreve = new ObjectOutputStream(arqEscrita);
                objEscreve.writeObject(func);

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (arqEscrita != null) arqEscrita.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }


        public Funcionario buscarFuncionario(String CPF) {
            Funcionario func = null;

            for (Funcionario funcBusca : this.vetFuncionarios) {
                if (funcBusca.getCPF().equals(CPF)) {
                    func = funcBusca;
                    break;
                }
            }
            return func;
        }

        public void removerFuncionario(String CPF) {
            Funcionario funcRemove = buscarFuncionario(CPF);
            if (funcRemove != null) {
                this.vetFuncionarios.remove(funcRemove);
            }

        }

        public void verFuncionario() {
            for (Funcionario func : this.vetFuncionarios) {
                System.out.println("Funcionario: " + func.toString());
            }
        }
    }

