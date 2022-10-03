package MODEL;
public class Produto {

    private int codInter;
    private int codProduto;
    private String nomeProduto;
    private double precoCompraProduto;
    private double precoVendaProduto;
    private int codFornFK;

    public Produto(int codInter, int codProduto, String nomeProduto, double precoCompraProduto,
            double precoVendaProduto, int codFornFK) {
        this.codInter = codInter;
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
        this.precoCompraProduto = precoCompraProduto;
        this.precoVendaProduto = precoVendaProduto;
        this.codFornFK = codFornFK;
    }

    public int getCodInter() {
        return codInter;
    }

    public void setCodInter(int codInter) {
        this.codInter = codInter;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoCompraProduto() {
        return precoCompraProduto;
    }

    public void setPrecoCompraProduto(double precoCompraProduto) {
        this.precoCompraProduto = precoCompraProduto;
    }

    public double getPrecoVendaProduto() {
        return precoVendaProduto;
    }

    public void setPrecoVendaProduto(double precoVendaProduto) {
        this.precoVendaProduto = precoVendaProduto;
    }

    public int getCodFornFK() {
        return codFornFK;
    }

    public void setCodFornFK(int codFornFK) {
        this.codFornFK = codFornFK;
    }


    
    
}
