package MODEL;
public class Cliente {
    private String nomeCliente;
    private String endCliente;
    private int cpfCliente;
    
    
    public Cliente(String nomeCliente, String endCliente, int cpfCliente) {
        this.nomeCliente = nomeCliente;
        this.endCliente = endCliente;
        this.cpfCliente = cpfCliente;
    }


    public String getNomeCliente() {
        return nomeCliente;
    }


    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }


    public String getEndCliente() {
        return endCliente;
    }


    public void setEndCliente(String endCliente) {
        this.endCliente = endCliente;
    }


    public int getCpfCliente() {
        return cpfCliente;
    }


    public void setCpfCliente(int cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    
}
