/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import factory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import modelo.Lote;

/**
 *
 * @author loboandro
 */
public class LoteDAO {
    
    private Connection connection;
    String idLote;
    String tipoProdutoLote;
    String especificacao;
    String qtdUnitaria;
    String fornecedor;
    String dataEntrada;
    String dataSaida;
    String horaEntrada;
    String horaSaida;
    String validade;
    
    public LoteDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public boolean adiciona(Lote lote) {
        boolean ok = false;
        String sql = "INSERT INTO Lote (IdLote, TipoProdutoLote, Especificacao, QtdUnitaria, Fornecedor, "
                + "DataEntrada, HoraEntrada, Validade)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        String sql2 = "INSERT INTO LoteDel (IdLoteDel, TipoProdutoLoteDel, EspecificacaoDel, QtdUnitariaDel, FornecedorDel, "
                + "DataEntradaDel, HoraEntradaDel, ValidadeDel)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, lote.getIdLote());
            stmt.setString(2, lote.getTipoProdutoLote());
            stmt.setString(3, lote.getEspecificacao());
            stmt.setString(4, lote.getQtdUnitaria());
            stmt.setString(5, lote.getFornecedor());
            stmt.setString(6, lote.getDataEntrada());
            stmt.setString(7, lote.getHoraEntrada());
            stmt.setString(8, lote.getValidade());
            stmt.execute();
            stmt.close();
            
            PreparedStatement stmt2 = connection.prepareStatement(sql2);
            stmt2.setString(1, lote.getIdLote());
            stmt2.setString(2, lote.getTipoProdutoLote());
            stmt2.setString(3, lote.getEspecificacao());
            stmt2.setString(4, lote.getQtdUnitaria());
            stmt2.setString(5, lote.getFornecedor());
            stmt2.setString(6, lote.getDataEntrada());
            stmt2.setString(7, lote.getHoraEntrada());
            stmt2.setString(8, lote.getValidade());
            stmt2.execute();
            stmt2.close();
            
            ok = true;
        } catch (SQLException u) {
            System.err.println(u.getMessage());
        }
        return ok;
    }
    
    public Lote recupera(Lote lote) {
        Lote retorno = new Lote();
        String sql = "SELECT TipoProdutoLote, Especificacao, QtdUnitaria, Fornecedor, "
                + "Validade FROM lote WHERE IdLote = ?" ;
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, lote.getIdLote().toString());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                rs.first();
                retorno.setTipoProdutoLote(rs.getString(1));
                retorno.setEspecificacao(rs.getString(2));
                retorno.setQtdUnitaria(rs.getString(3));
                retorno.setFornecedor(rs.getString(4));
                retorno.setValidade(rs.getString(5));
            } else {
                retorno = null;
            }
            rs.close();
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return (retorno);
    }
    
    
    public List<Lote> recuperaLotes(){
        List<Lote> listaLote = new ArrayList<Lote>();
String sql = "SELECT IdLote, TipoProdutoLote, Especificacao, QtdUnitaria, Fornecedor, "
                + "DataEntrada, HoraEntrada, Validade FROM Lote ORDER BY IdLote" ;
try {
           PreparedStatement stmt = connection.prepareStatement(sql);
ResultSet rs = stmt.executeQuery();
           if (rs != null) {
while (rs.next()) 
                   {
                       Lote loteConsulta = new Lote();
                       loteConsulta.setIdLote(rs.getString(1));
                       loteConsulta.setTipoProdutoLote(rs.getString(2));
                       loteConsulta.setEspecificacao(rs.getString(3));
                       loteConsulta.setQtdUnitaria(rs.getString(4));
                       loteConsulta.setFornecedor(rs.getString(5));
                       loteConsulta.setDataEntrada(rs.getString(6));
                       loteConsulta.setHoraEntrada(rs.getString(7));
                       loteConsulta.setValidade(rs.getString(8));
                       listaLote.add(loteConsulta);
                   }
                rs.close();
                stmt.close();
                return(listaLote);
           }
           else
           {
                rs.close();
                stmt.close();
                return null;
           }
        

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
    public boolean exclui(Lote lote) {
        boolean ok = false;
        String sql =  "DELETE FROM lote WHERE IdLote = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, lote.getIdLote());

            if (stmt.executeUpdate() > 0) {
                ok = true;
            }
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ok;
    }
    
    public String getIdLote() {
        return idLote;
    }

    /**
     * @param idLote the idLote to set
     */
    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    /**
     * @return the tipoProdutoLote
     */
    public String getTipoProdutoLote() {
        return tipoProdutoLote;
    }

    /**
     * @param tipoProdutoLote the tipoProdutoLote to set
     */
    public void setTipoProdutoLote(String tipoProdutoLote) {
        this.tipoProdutoLote = tipoProdutoLote;
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
     * @return the qtdUnitaria
     */
    public String getQtdUnitaria() {
        return qtdUnitaria;
    }

    /**
     * @param qtdUnitaria the qtdUnitaria to set
     */
    public void setQtdUnitaria(String qtdUnitaria) {
        this.qtdUnitaria = qtdUnitaria;
    }

    /**
     * @return the fornecedor
     */
    public String getFornecedor() {
        return fornecedor;
    }

    /**
     * @param fornecedor the fornecedor to set
     */
    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    /**
     * @return the dataEntrada
     */
    public String getDataEntrada() {
        return dataEntrada;
    }

    /**
     * @param dataEntrada the dataEntrada to set
     */
    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    /**
     * @return the dataSaida
     */
    public String getDataSaida() {
        return dataSaida;
    }

    /**
     * @param dataSaida the dataSaida to set
     */
    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }

    /**
     * @return the horaEntrada
     */
    public String getHoraEntrada() {
        return horaEntrada;
    }

    /**
     * @param horaEntrada the horaEntrada to set
     */
    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    /**
     * @return the horaSaida
     */
    public String getHoraSaida() {
        return horaSaida;
    }

    /**
     * @param horaSaida the horaSaida to set
     */
    public void setHoraSaida(String horaSaida) {
        this.horaSaida = horaSaida;
    }

    /**
     * @return the validade
     */
    public String getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(String validade) {
        this.validade = validade;
    }
    
}
