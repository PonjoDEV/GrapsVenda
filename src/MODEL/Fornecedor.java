package MODEL;
public class Fornecedor {

    private int codForn;
    private String nomeForn;

    public Fornecedor(int codForn, String nomeForn) {
        this.codForn = codForn;
        this.nomeForn = nomeForn;
    }

    public int getCodForn() {
        return codForn;
    }
    public void setCodForn(int codForn) {
        this.codForn = codForn;
    }
    public String getNomeForn() {
        return nomeForn;
    }
    public void setNomeForn(String nomeForn) {
        this.nomeForn = nomeForn;
    }    
    
}
