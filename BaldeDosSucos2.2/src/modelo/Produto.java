package modelo;

public class Produto {

    private String IDProduto;
    private String tipoProduto;
    private String especificacao;
    private int qtdDisponivel;

    /**
     * @return the IDProduto
     */
    public String getIDProduto() {
        return IDProduto;
    }

    /**
     * @param IDProduto the IDProduto to set
     */
    public void setIDProduto(String IDProduto) {
        this.IDProduto = IDProduto;
    }

    /**
     * @return the tipoProduto
     */
    public String getTipoProduto() {
        return tipoProduto;
    }

    /**
     * @param tipoProduto the tipoProduto to set
     */
    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    /**
     * @return the especificacao
     */
    public String getEspecificacao() {
        return especificacao;
    }

    /**
     * @param especificacao the especificacao to set
     */
    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
        
    }

    /**
     * @return the qtdDisponivel
     */
    public int getQtdDisponivel() {
        return qtdDisponivel;
    }

    /**
     * @param qtdDisponivel the qtdDisponivel to set
     */
    public void setQtdDisponivel(int qtdDisponivel) {
        this.qtdDisponivel = qtdDisponivel;
    }
    

}