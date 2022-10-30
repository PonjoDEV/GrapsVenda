import CONTROLLER.ClienteControl;
import CONTROLLER.NotaFiscalControl;
import MODEL.Cliente;
import MODEL.Fornecedor;
import MODEL.Produto;
import MODEL.DAO.ClienteBD;
import MODEL.DAO.FornecedorBD;
import MODEL.DAO.NotaFiscalBD;
import MODEL.DAO.ProdutoBD;

public class App {
    public static void main(String[] args) throws Exception {

        //initializing fake BD's
        ClienteBD.iniciarBDCliente();
        FornecedorBD.iniciarBDFornecedores();
        NotaFiscalBD.iniciarBDNotasFiscais();
        ProdutoBD.iniciarBDProdutos();

        //registering a customer to use as example
        Cliente novoCliente = new Cliente("Gabriel", "rua tal", 1230);
        ClienteBD.clientes.add(novoCliente);

        //registering a product provider as a example
        Fornecedor novoFornecedor = new Fornecedor(1, "Elma Chips");
        FornecedorBD.fornecedores.add(novoFornecedor);

        //registering products 
        Produto novoProduto0 = new Produto(0, 4616509, "Fandangos", 0.50, 1.8, 1);
        Produto novoProduto1 = new Produto(1, 4616510, "Doritos", 0.50, 3, 1);        
        Produto novoProduto2 = new Produto(2, 4616511, "Ruffles", 0.50, 2.50, 1);
        ProdutoBD.produtos.add(novoProduto0);
        ProdutoBD.produtos.add(novoProduto1);
        ProdutoBD.produtos.add(novoProduto2);


        

        //TESTE da emissão da NF
        NotaFiscalControl.cadastroNF();
    }
}
