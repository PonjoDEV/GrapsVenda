package MODEL.DAO;

import java.util.Vector;

import MODEL.Produto;

public class ProdutoBD {
    
    public static Vector<Produto> produtos;

    public static void iniciarBDProdutos(){
        produtos = new Vector();
    }

    public static Vector<Produto> recuperarProdutos(){
        return produtos;
    }
}
