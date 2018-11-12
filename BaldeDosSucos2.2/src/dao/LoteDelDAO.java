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
import modelo.LoteDel;

/**
 *
 * @author loboandro
 */
public class LoteDelDAO {
    
    private Connection connection;
    String idLoteDelDel;
    String tipoProdutoLoteDelDel;
    String saborPolpaDel;
    String qtdUnitariaDel;
    String fornecedorDel;
    String dataEntradaDel;
    String dataSaidaDel;
    String horaEntradaDel;
    String horaSaidaDel;
    String validadeDel;
    
    public LoteDelDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public boolean adicionaSaida(LoteDel loteDel) {
        boolean ok = false;
        String sql = "UPDATE LoteDel SET DataSaidaDel = ?, HoraSaidaDel = ? WHERE IdLoteDel = ?;";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, loteDel.getDataSaidaDel());
            stmt.setString(2, loteDel.getHoraSaidaDel());
            stmt.setString(3, loteDel.getIdLoteDel());
            stmt.execute();
            stmt.close();
            ok = true;
        } catch (SQLException u) {
            System.err.println(u.getMessage());
        }
        return ok;
    }
    
    public List<LoteDel> recuperaLotesDel(){
        List<LoteDel> listaLoteDel = new ArrayList<LoteDel>();
String sql = "SELECT IdLoteDel, TipoProdutoLoteDel, EspecificacaoDel, QtdUnitariaDel, FornecedorDel, "
                + "DataEntradaDel, DataSaidaDel, HoraEntradaDel, HoraSaidaDel, ValidadeDel FROM LoteDel ORDER BY IdLoteDel" ;
try {
           PreparedStatement stmt = connection.prepareStatement(sql);
ResultSet rs = stmt.executeQuery();
           if (rs != null) {
while (rs.next()) 
                   {
                       LoteDel LoteDelConsulta = new LoteDel();
                       LoteDelConsulta.setIdLoteDel(rs.getString(1));
                       LoteDelConsulta.setTipoProdutoLoteDel(rs.getString(2));
                       LoteDelConsulta.setEspecificacaoDel(rs.getString(3));
                       LoteDelConsulta.setQtdUnitariaDel(rs.getString(4));
                       LoteDelConsulta.setFornecedorDel(rs.getString(5));
                       LoteDelConsulta.setDataEntradaDel(rs.getString(6));
                       LoteDelConsulta.setDataSaidaDel(rs.getString(7));
                       LoteDelConsulta.setHoraEntradaDel(rs.getString(8));
                       LoteDelConsulta.setHoraSaidaDel(rs.getString(9));
                       LoteDelConsulta.setValidadeDel(rs.getString(10));
                       listaLoteDel.add(LoteDelConsulta);
                   }
                rs.close();
                stmt.close();
                return(listaLoteDel);
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
    
    
}

