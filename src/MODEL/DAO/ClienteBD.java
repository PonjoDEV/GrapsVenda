package MODEL.DAO;

import java.util.Vector;

import MODEL.Cliente;

public class ClienteBD {
    public static Vector<Cliente> clientes;

    public static void iniciarBDCliente(){
        clientes = new Vector();
    }

    /* public static void inserirCliente(Vector<Cliente>armazenaCliente){
        for (int i = 0; i < armazenaCliente.size(); i++) {
            clientes.add(armazenaCliente.get(i));            
        }
    } */

    public static Vector<Cliente> recuperarCliente(){
        return clientes;
    }
}
