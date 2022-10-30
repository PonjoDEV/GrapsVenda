package CONTROLLER;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import MODEL.Produto;

import MODEL.DAO.ProdutoBD;

public class ProdutoControl {

    public static void cadastroProduto() {

        int codInter;
        int codProduto;
        String nomeProduto;
        double precoCompraProduto;
        double precoVendaProduto;
        int codFornFK;

        Scanner cadastro = new Scanner(System.in);

        System.out.println("Digite o nome do Produto");
        nomeProduto = cadastro.next();

        System.out.println("Digite o código do Fornecedor");
        codFornFK = cadastro.nextInt();
        
        System.out.println("Digite o código de barras do Produto");
        codProduto = cadastro.nextInt();

        System.out.println("Digite o preço de compra do Produto");  
        precoCompraProduto = cadastro.nextInt();

        System.out.println("Digite o preço de venda do Produto");
        precoVendaProduto = cadastro.nextInt();

        codInter = ProdutoBD.produtos.size();

        Produto novoProduto = new Produto(codInter,  codProduto,  nomeProduto,  precoCompraProduto,
             precoVendaProduto,  codFornFK);

        ProdutoBD.produtos.add(novoProduto);        


    }
}