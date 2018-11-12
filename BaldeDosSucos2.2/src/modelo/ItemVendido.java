/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author loboandro
 */
public class ItemVendido {
    
    
    private int idItem;
    private int idVenda;
    private String especificacao;
    private String tamanhoItem;
    private String sabor1;
    private String sabor2;
    private String sabor3;
    private String qtdItem;

    /**
     * @return the idItem
     */
    public int getIdItem() {
        return idItem;
    }

    /**
     * @param idItem the idItem to set
     */
    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    /**
     * @return the idVenda
     */
    public int getIdVenda() {
        return idVenda;
    }

    /**
     * @param idVenda the idVenda to set
     */
    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
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
     * @return the tamanhoItem
     */
    public String getTamanhoItem() {
        return tamanhoItem;
    }

    /**
     * @param tamanhoItem the tamanhoItem to set
     */
    public void setTamanhoItem(String tamanhoItem) {
        this.tamanhoItem = tamanhoItem;
    }

    /**
     * @return the sabor1
     */
    public String getSabor1() {
        return sabor1;
    }

    /**
     * @param sabor1 the sabor1 to set
     */
    public void setSabor1(String sabor1) {
        this.sabor1 = sabor1;
    }

    /**
     * @return the sabor2
     */
    public String getSabor2() {
        return sabor2;
    }

    /**
     * @param sabor2 the sabor2 to set
     */
    public void setSabor2(String sabor2) {
        this.sabor2 = sabor2;
    }

    /**
     * @return the sabor3
     */
    public String getSabor3() {
        return sabor3;
    }

    /**
     * @param sabor3 the sabor3 to set
     */
    public void setSabor3(String sabor3) {
        this.sabor3 = sabor3;
    }

    /**
     * @return the qtdItem
     */
    public String getQtdItem() {
        return qtdItem;
    }

    /**
     * @param qtdItem the qtdItem to set
     */
    public void setQtdItem(String qtdItem) {
        this.qtdItem = qtdItem;
    }

}