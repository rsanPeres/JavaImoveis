package com.company;


import com.company.Pessoa.Cliente;
import com.company.Pessoa.DadosClientes;
import com.company.Pessoa.DadosFuncionarios;
import com.company.Pessoa.Funcionario;
import com.company.Tansacao.DadosTransacao;
import com.company.Tansacao.Transacao;
import com.company.imoveis.*;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //o main transformado em uma interface poderia diminuir a quantidade de código
        // ser mais amigável para os usuários
        //não seria necessário tantas frases para a pessoa inserir o dado adequadamente

        DadosImovel gIm = new DadosImovel();
        DadosClientes gCli = new DadosClientes();
        DadosFuncionarios gFun = new DadosFuncionarios();
        DadosTransacao gTrans = new DadosTransacao();

        Cliente cli = new Cliente();
        Funcionario fun = new Funcionario();
        Transacao trans = new Transacao();
        Casa cs = new Casa();
        Apartamento ap = new Apartamento();
        SalaComercial sc = new SalaComercial();
        Terreno trr = new Terreno();

        Scanner in = new Scanner(System.in);

        int op = 10, telefone, tipo, contrato;
        String nome, sexo, prof, email, cpf, id, negocio;
        double valor;
        float area;



        while (op != 0) {
            menuOP();
            System.out.println("\nDigite a opção desejada: ");
            op = in.nextInt();

            switch (op){
                case 1:
                    System.out.println("Digite 1 para Alterar funcionarios\n Sigite 2 para alterar Imoveis: \n" +
                            " digite 3 para alterar clientes: \n digite 4 par alterar transações: \n");
                    tipo = in.nextInt();
                    if(tipo == 1){
                        System.out.println("\nDigite o nome: ");
                        nome = in.nextLine();
                        System.out.println("\nDigite o CPF: ");
                        cpf = in.nextLine();
                        System.out.println("\nDigite o sexo: ");
                        sexo = in.nextLine();
                        System.out.println("\nDigite o telefone(somente números): ");
                        telefone =  in.nextInt();
                        System.out.println("\nDigite o email: ");
                        email = in.nextLine();

                        fun.setNome(nome);
                        fun.setEmail(email);
                        fun.setSexo(sexo);
                        fun.setTelefone1(telefone);
                        fun.setCPF(cpf);

                        gFun.cadastrarFuncionarios(fun);
                        break;
                    }
                    if (tipo == 2) {
                        System.out.println("Digite 1 para casa\n Digite 2 para apartamento\n Digite 3 para sala comercial \nDigite 4 para terreno");
                        tipo = in.nextInt();
                        if( tipo == 1){
                            System.out.println("\nDigite id do imovel: ");
                            id = in.nextLine();
                            System.out.println("\nDigite tipo do negócio: ");
                            negocio = in.nextLine();
                            System.out.println("\nPreço proprietário: ");
                            valor = in.nextDouble();
                            System.out.println("\nDigite a area do imovel: ");
                            area = in.nextFloat();

                            cs.setImovelID(id);
                            cs.setTipoNegocio(negocio);
                            cs.setPrecoProprietario(valor);
                            cs.setAreaImovel(area);

                            gIm.cadastraImovel(cs);
                            break;

                        }if (tipo == 2){
                            System.out.println("\nDigite id do imovel: ");
                            id = in.nextLine();
                            System.out.println("\nDigite tipo do negócio: ");
                            negocio = in.nextLine();
                            System.out.println("\nPreço proprietário: ");
                            valor = in.nextDouble();
                            System.out.println("\nDigite o andar: ");
                            tipo = in.nextInt();
                            System.out.println("\nDigite a area do imovel: ");
                            area = in.nextFloat();

                            ap.setImovelID(id);
                            ap.setTipoNegocio(negocio);
                            ap.setPrecoProprietario(valor);
                            ap.setAndar(tipo);
                            ap.setAreaImovel(area);

                            gIm.cadastraImovel(ap);

                            break;

                        }if(tipo == 3){
                            System.out.println("\nDigite id do imovel: ");
                            id = in.nextLine();
                            System.out.println("\nDigite tipo do negócio: ");
                            negocio = in.nextLine();
                            System.out.println("\nPreço proprietário: ");
                            valor = in.nextDouble();
                            System.out.println("\nDigite a area do imovel: ");
                            area = in.nextFloat();

                            sc.setImovelID(id);
                            sc.setAreaComercial(area);
                            sc.setPrecoProprietario(valor);
                            sc.setTipoNegocio(negocio);

                            gIm.cadastraImovel(sc);

                            break;

                        }if(tipo == 4){
                            System.out.println("\nDigite id do imovel: ");
                            id = in.nextLine();
                            System.out.println("\nDigite tipo do negócio: ");
                            negocio = in.nextLine();
                            System.out.println("\nPreço proprietário: ");
                            valor = in.nextDouble();
                            System.out.println("\nDigite a area do imovel: ");
                            area = in.nextFloat();
                            System.out.println("\nDigite 1 para aclive e declive: ");
                            tipo = in.nextInt();
                            if(tipo == 1){
                                trr.setAcliveDeclive(true);
                            }
                            trr.setImovelID(id);
                            trr.setTipoNegocio(negocio);
                            trr.setPrecoProprietario(valor);
                            trr.setAreaTerreno(area);

                            gIm.cadastraImovel(trr);

                            break;
                        }

                        break;
                    }
                    if (tipo == 3){
                        System.out.println("\nDigite o nome: ");
                        nome = in.nextLine();
                        System.out.println("\nDigite o CPF: ");
                        cpf = in.nextLine();
                        System.out.println("\nDigite o sexo: ");
                        sexo = in.nextLine();
                        System.out.println("\nDigite a profissão: ");
                        prof = in.nextLine();
                        System.out.println("\nDigite o telefone(somente números): ");
                        telefone =  in.nextInt();
                        System.out.println("\nDigite o email: ");
                        email = in.nextLine();
                        cli.setNome(nome);
                        cli.setEmail(email);
                        cli.setSexo(sexo);
                        cli.setTelefone1(telefone);
                        cli.setCPF(cpf);
                        cli.setProfissao(prof);
                        gCli.cadastrarClientes(cli);

                        break;

                    }if (tipo == 4){
                        System.out.println("\nDigite o numero do contrato: ");
                        contrato = in.nextInt();
                        System.out.println("\nDigite o valor: ");
                        valor = in.nextDouble();
                        trans.setValorTransacao(valor);
                        trans.setNumContrato(contrato);
                        gTrans.cadastra(trans);
                    }
                    break;
                case 2:
                    System.out.println("\nDigite 1 para Alterar funcionarios\n Sigite 2 para alterar Imoveis: \n" +
                            " digite 3 para alterar clientes: \n digite 4 par alterar transações: \n");
                    tipo = in.nextInt();
                    if(tipo == 1){
                        System.out.println("\nDigite o CPF do funcionario: ");
                        cpf = in.nextLine();
                        gFun.removerFuncionario(cpf);
                        break;

                    }if(tipo == 2){
                        System.out.println("\nDigite o id do imovel: ");
                        id = in.nextLine();
                        gIm.removeImovel(id);
                        break;

                    }if (tipo == 3){
                        System.out.println("\nDigite o CPF do cliente: ");
                        cpf = in.nextLine();
                        gCli.removerCliente(cpf);
                        break;

                    }if(tipo == 4){
                        System.out.println("\nDigite o numero do contrato: ");
                        contrato = in.nextInt();
                        gTrans.excluir(contrato);
                    }
                    break;
                case 3:
                    System.out.println("\nDigite 1 para Alterar funcionarios\n Sigite 2 para alterar Imoveis: \n digite 3 para alterar clientes: \n digite 4 par alterar transações: \n");
                    tipo = in.nextInt();
                    if(tipo == 1){
                        System.out.println("\nDigite o CPF do funcionario: ");
                        cpf = in.nextLine();
                        gFun.buscarFuncionario(cpf);
                        break;

                    }if(tipo == 2){
                        System.out.println("\nDigite o id do imovel: ");
                        id = in.nextLine();
                        gIm.verImovelporID(id);
                        break;

                    }if (tipo == 3){
                        System.out.println("\nDigite o CPF do cliente: ");
                        cpf = in.nextLine();
                        gCli.buscarCliente(cpf);
                        break;

                    }if(tipo == 4){
                        System.out.println("\nDigite o numero do contrato: ");
                        contrato = in.nextInt();
                        gTrans.buscar(contrato);
                    }
                    break;
                case 4:
                    System.out.println("\nDigite 1 para alterar funcionarios\n Digite 2 para alterar imoveis\n digite 3 para alterar Clientes \n digite 4 para alterar Transações");
                    tipo = in.nextInt();
                    if(tipo == 1){

                        gFun.verFuncionario();
                        break;

                    }if(tipo == 2){
                        gIm.verImoveis();
                        break;

                    }if (tipo == 3){
                        gCli.verClientes();
                        break;

                    }if(tipo == 4){
                        gTrans.listar();
                    }
                    break;
            }
        }
    }

    public static void menuOP(){
        System.out.println("\n1. Adicionar: \n2. Remover: \n3. Ver um: " +
                "\n4. Ver todos: \n0. Sair: \n");
    }
}
