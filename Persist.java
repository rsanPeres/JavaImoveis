package com.company;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {
    public static boolean gravar(Object imobiliaria, String arquivo){
        try {
            FileOutputStream gravaArquivo = new FileOutputStream(arquivo);//gera arquivo
            ObjectOutputStream objGravar = new ObjectOutputStream(gravaArquivo);// insere obj arquivos
            objGravar.writeObject(imobiliaria);
            objGravar.flush();
            objGravar.close();
            gravaArquivo.flush();
            gravaArquivo.close();
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
}
