package dao;
import factory.ConnectionFactory;
import java.sql.*;
import java.util.*;
import modelo.Venda;
import javax.swing.*;
import modelo.Produto;
public class VendaDAO {
private Connection connection;

int idVenda;

public VendaDAO(){

this.connection = new ConnectionFactory().getConnection();

}
public boolean criarVenda(Venda venda) {
    boolean ok = false;
    Venda retorno = new Venda();
    String sql = "insert into venda(QtdSuco250, QtdSuco500, QtdSuco750, QtdBiscoito, QtdBatata, Desconto, ValorTotal)values(?,?,?,?,?,?,?)";
    try {
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.setString(1, venda.getQtdSuco250());
        stmt.setString(2, venda.getQtdSuco500());
        stmt.setString(3, venda.getQtdSuco750());
        stmt.setString(4, venda.getQtdBiscoito());
        stmt.setString(5, venda.getQtdBatata());
        stmt.setString(6, venda.getDesconto());
        stmt.setString(7, venda.getValorTotal());
        stmt.execute(); stmt.close();
        ok = true;
} catch (SQLException u){ 
     System.err.println(u.getMessage());
}
    return ok;
}

public boolean removerVenda(Venda venda) {
    boolean ok = false;
    Venda retorno = new Venda();
    String sql = "delete from venda where idvenda = ?";
    try {
        PreparedStatement stmt = connection.prepareStatement(sql);
        
        stmt.setString(1, venda.getIdVenda());
        stmt.execute(); stmt.close();
        ok = true;
} catch (SQLException u){ 
     System.err.println(u.getMessage());
}
    return ok;
}

public List<Produto> recuperaSabores(){
        List<Produto> listaSabor = new ArrayList<Produto>();
String sql = "SELECT * FROM sabor" ;
try {
           PreparedStatement stmt = connection.prepareStatement(sql);
ResultSet rs = stmt.executeQuery();
           if (rs != null) {
while (rs.next()) 
                   {
                       Produto saborConsulta = new Produto();
                       saborConsulta.setEspecificacao(rs.getString(1));
                       listaSabor.add(saborConsulta);
                   }
                rs.close();
                stmt.close();
                return(listaSabor);
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

public int pegaID() {
        String sql = "SELECT MAX(IdVenda) AS IdVenda FROM Venda";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                idVenda = rs.getInt("IdVenda");
                idVenda++;
            } else {
                idVenda = Integer.parseInt("1");
            }
        } catch (SQLException u) {
            System.err.println(u.getMessage());
        }

        return idVenda;
    }

    public List<Venda> recuperaLotes(){
        List<Venda> listaVenda = new ArrayList<Venda>();
String sql = "SELECT IdVenda, QtdSuco250, QtdSuco500, QtdSuco750, QtdBiscoito, "
                + "QtdBatata, Desconto, ValorTotal FROM venda ORDER BY IdVenda" ;
try {
           PreparedStatement stmt = connection.prepareStatement(sql);
ResultSet rs = stmt.executeQuery();
           if (rs != null) {
while (rs.next()) 
                   {
                       Venda vendaConsulta = new Venda();
                       vendaConsulta.setIdVenda(rs.getString(1));
                       vendaConsulta.setQtdSuco250(rs.getString(2));
                       vendaConsulta.setQtdSuco500(rs.getString(3));
                       vendaConsulta.setQtdSuco750(rs.getString(4));
                       vendaConsulta.setQtdBiscoito(rs.getString(5));
                       vendaConsulta.setQtdBatata(rs.getString(6));
                       vendaConsulta.setDesconto(rs.getString(7));
                       vendaConsulta.setValorTotal(rs.getString(8));
                       listaVenda.add(vendaConsulta);
                   }
                rs.close();
                stmt.close();
                return(listaVenda);
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
