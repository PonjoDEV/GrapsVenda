package MODEL;

import java.util.Vector;

public class NotaFiscal {
    private int numeroNF;
    private double valorNF;
    private Vector<String> listaNF;
    private Vector <Integer> precosNF;


    public NotaFiscal(int numeroNF, double totalNF, Vector<String> listaNF, Vector<Integer> precosNF) {
        this.numeroNF = numeroNF;
        this.valorNF = totalNF;
        this.listaNF = listaNF;
        this.precosNF = precosNF;
    }


    public int getNumeroNF() {
        return numeroNF;
    }


    public void setNumeroNF(int numeroNF) {
        this.numeroNF = numeroNF;
    }


    public double getValorNF() {
        return valorNF;
    }


    public void setValorNF(double valorNF) {
        this.valorNF = valorNF;
    }


    public Vector<String> getListaNF() {
        return listaNF;
    }


    public void setListaNF(Vector<String> listaNF) {
        this.listaNF = listaNF;
    }


    public Vector<Integer> getPrecosNF() {
        return precosNF;
    }


    public void setPrecosNF(Vector<Integer> precosNF) {
        this.precosNF = precosNF;
    }

    
    
}
