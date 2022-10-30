package CONTROLLER;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import MODEL.Fornecedor;

import MODEL.DAO.FornecedorBD;

public class FornecedorControl {

    public static void cadastroFornecedor() {

        int idFornecedor;
        String nomeFornecedor;

        Scanner cadastro = new Scanner(System.in);

        System.out.println("Digite o CNPJ do Fornecedor");
        idFornecedor = cadastro.nextInt();


        System.out.println("Digite o nome do Fornecedor");
        nomeFornecedor = cadastro.next();

        Fornecedor novoFornecedor = new Fornecedor(idFornecedor, nomeFornecedor);

        FornecedorBD.fornecedores.add(novoFornecedor);

    }
}