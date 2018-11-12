/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.ItemVendido;

/**
 *
 * @author loboandro
 */
public class ItemVendidoDAO {
    
    Connection connection;
    
    public ItemVendidoDAO(){

this.connection = new ConnectionFactory().getConnection();

}
    
    public boolean vendeItem(ItemVendido item) {
        boolean ok = false;
        String sql = "INSERT INTO ItemVendido (IDItem, IDVenda, Especificacao, TamanhoItem, Sabor1, Sabor2, Sabor3, QtdItem)"
                + "VALUES (?,?,?,?,?,?,?,?)";
        String sql2 = "UPDATE produto set QtdDisponivel=QtdDisponivel-? WHERE Especificacao = ? ";
        String sql3 = "UPDATE produto set QtdDisponivel=QtdDisponivel-? WHERE Especificacao = ? ";
        String sql4 = "UPDATE produto set QtdDisponivel=QtdDisponivel-? WHERE Especificacao = ? ";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, item.getIdItem());
            stmt.setInt(2, item.getIdVenda());
            stmt.setString(3, item.getEspecificacao());
            stmt.setString(4, item.getTamanhoItem());
            stmt.setString(5, item.getSabor1());
            stmt.setString(6, item.getSabor2());
            stmt.setString(7, item.getSabor3());
            stmt.setString(8, item.getQtdItem());
            stmt.execute();
            stmt.close();
            
            PreparedStatement stmt2 = connection.prepareStatement(sql2);
            stmt2.setInt(1, Integer.parseInt(item.getQtdItem()));
            stmt2.setString(2, item.getSabor1());
            stmt2.execute();
            stmt2.close();
            
            PreparedStatement stmt3 = connection.prepareStatement(sql2);
            stmt3.setInt(1, Integer.parseInt(item.getQtdItem()));
            stmt3.setString(2, item.getSabor2());
            stmt3.execute();
            stmt3.close();
            
            PreparedStatement stmt4 = connection.prepareStatement(sql2);
            stmt4.setInt(1, Integer.parseInt(item.getQtdItem()));
            stmt4.setString(2, item.getSabor3());
            stmt4.execute();
            stmt4.close();
            ok = true;
        } catch (SQLException u) {
            System.err.println(u.getMessage());
        }
        return ok;
    }
    
    public boolean atualizaItem(ItemVendido item) {
        boolean ok = false;
        String sql = "UPDATE ItemVendido set Especificacao=?, TamanhoItem=?, Sabor1=?, Sabor2=?, Sabor3=?, QtdItem=?"
                + "WHERE IDVenda=? AND IDItem=?";
        
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, item.getEspecificacao());
            stmt.setString(2, item.getTamanhoItem());
            stmt.setString(3, item.getSabor1());
            stmt.setString(4, item.getSabor2());
            stmt.setString(5, item.getSabor3());
            stmt.setString(6, item.getQtdItem());
            stmt.setInt(7, item.getIdVenda());
            stmt.setInt(8, item.getIdItem());
            stmt.execute();
            stmt.close();
            
            ok = true;
        } catch (SQLException u) {
            System.err.println(u.getMessage());
        }
        return ok;
    }
    
    public List<ItemVendido> recuperaItens(String ID){
List<ItemVendido> listaItemVendido = new ArrayList<ItemVendido>();
String sql = "SELECT IDVenda, IDItem, Especificacao, TamanhoItem, Sabor1, Sabor2, Sabor3, QtdItem FROM itemvendido WHERE IDVenda like \'%" + ID + "%\'" ;
try {
           PreparedStatement stmt = connection.prepareStatement(sql);
           ResultSet rs = stmt.executeQuery();
           if (rs != null) {
while (rs.next()) 
                   {
                       ItemVendido itemVendidoConsulta = new ItemVendido();
                       itemVendidoConsulta.setIdVenda(rs.getInt(1));
                       itemVendidoConsulta.setIdItem(rs.getInt(2));
                       itemVendidoConsulta.setEspecificacao(rs.getString(3));
                       itemVendidoConsulta.setTamanhoItem(rs.getString(4));
                       itemVendidoConsulta.setSabor1(rs.getString(5));
                       itemVendidoConsulta.setSabor2(rs.getString(6));
                       itemVendidoConsulta.setSabor3(rs.getString(7));
                       itemVendidoConsulta.setQtdItem(rs.getString(8));
                       listaItemVendido.add(itemVendidoConsulta);
                   }
                rs.close();
                stmt.close();
                return(listaItemVendido);
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
