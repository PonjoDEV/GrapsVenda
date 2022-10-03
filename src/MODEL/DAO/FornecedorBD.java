package MODEL.DAO;

import java.util.Vector;

import MODEL.Fornecedor;

public class FornecedorBD {
    public static Vector<Fornecedor> fornecedores;

    public static void iniciarBDFornecedores(){
        fornecedores = new Vector();
    }

    public static Vector<Fornecedor> recuperarFornnecedores(){
        return fornecedores;
    }
}
