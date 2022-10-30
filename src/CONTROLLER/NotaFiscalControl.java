package CONTROLLER;

import java.util.Scanner;
import java.util.Vector;

import MODEL.Cliente;
import MODEL.NotaFiscal;
import MODEL.DAO.ClienteBD;
import MODEL.DAO.NotaFiscalBD;
import MODEL.DAO.ProdutoBD;

public class NotaFiscalControl {

    public static void cadastroNF() {
        int i = 1;
        Scanner in = new Scanner(System.in);

        Vector nomesProdutos = new Vector<String>();
        Vector precoProdutos = new Vector<Integer>();

        double totalNF = 0;

        while (i != 0) {

            System.out.println("Digite o código interno do próximo produto, ou 0 para encerrar a venda");
            i = in.nextInt();
            if (i == 0) {
                System.out.println("Compra finalizada ");
            } else {

                if (i >= ProdutoBD.produtos.size()||i<0) {
                    System.out.println("Código inválido, tente novamente");

                } else {
                    nomesProdutos.add(ProdutoBD.produtos.get(i).getNomeProduto());
                    precoProdutos.add(ProdutoBD.produtos.get(i).getPrecoVendaProduto());

                    totalNF += ProdutoBD.produtos.get(i).getPrecoVendaProduto();
                }
            }
        }
        
        String nomeCliente = "Não cadastrado";
        System.out.println("Informe o CPF do cliente se for cadastrado, caso não seja digite 0");
        int CPF = in.nextInt();
        
        if (CPF!=0) {
            for (int j = 0; j < ClienteBD.clientes.size(); j++) {
                if (CPF==ClienteBD.clientes.get(j).getCpfCliente()) {
                    nomeCliente = ClienteBD.clientes.get(j).getNomeCliente();
                }
            }
        } 


        int indice = NotaFiscalBD.notasFiscais.size();

        System.out.println("Nota fiscal n° "+indice+" Cliente "+nomeCliente);

        for (int j = 0; j < nomesProdutos.size(); j++) {
            System.out.print(nomesProdutos.get(j)+" "+precoProdutos.get(j)+"\n");
        }

        System.out.println("Valor total: "+totalNF);


        NotaFiscal novaNF = new NotaFiscal(indice, totalNF, nomesProdutos, precoProdutos);

        NotaFiscalBD.notasFiscais.add(novaNF);

    }
}
