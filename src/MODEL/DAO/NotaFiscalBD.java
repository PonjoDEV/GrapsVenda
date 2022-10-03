package MODEL.DAO;

import java.util.Vector;

import MODEL.NotaFiscal;

public class NotaFiscalBD {
    
    public static Vector<NotaFiscal> notasFiscais;

    public static void iniciarBDNotasFiscais(){
        notasFiscais = new Vector();
    }

    public static Vector<NotaFiscal> recuperarNotasFiscais(){
        return notasFiscais;
    }
}
