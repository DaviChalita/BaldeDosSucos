package dao;

import factory.ConnectionFactory;
import java.sql.*;
import modelo.Produto;
import java.util.ArrayList;
import java.util.List;


public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public boolean adiciona(Produto sabor) {
        boolean ok = false;
        String sql = "INSERT INTO produto (Especificacao, TipoProduto, QtdDisponivel) VALUES (?, 'Polpa', 0)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, sabor.getEspecificacao());
            stmt.execute();
            stmt.close();
            ok = true;
        } catch (SQLException u) {
            System.err.println(u.getMessage());
        }
        return ok;
    }
    
    public List<Produto> recuperaSabores(){
        List<Produto> listaSabor = new ArrayList<Produto>();
String sql = "SELECT Especificacao FROM produto WHERE TipoProduto = 'Polpa' ORDER BY Especificacao" ;
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
    
    public List<Produto> recuperaSaboresDisponiveis(){
        List<Produto> listaSabor = new ArrayList<Produto>();
String sql = "SELECT Especificacao FROM produto WHERE TipoProduto = 'Polpa' AND QtdDisponivel > 2 ORDER BY Especificacao" ;
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
    
    public List<Produto> recuperaExtrasDisponiveis(){
        List<Produto> listaExtra = new ArrayList<Produto>();
String sql = "SELECT Especificacao FROM produto WHERE TipoProduto <> 'Polpa' AND QtdDisponivel > 0 ORDER BY Especificacao" ;
try {
           PreparedStatement stmt = connection.prepareStatement(sql);
ResultSet rs = stmt.executeQuery();
           if (rs != null) {
while (rs.next()) 
                   {
                       Produto extraConsulta = new Produto();
                       extraConsulta.setEspecificacao(rs.getString(1));
                       listaExtra.add(extraConsulta);
                   }
                rs.close();
                stmt.close();
                return(listaExtra);
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
    
    public List<Produto> recuperaProdutosDisponiveis(){
        List<Produto> listaSabor = new ArrayList<Produto>();
String sql = "SELECT TipoProduto, Especificacao, QtdDisponivel FROM produto WHERE QtdDisponivel > 0 ORDER BY TipoProduto" ;
try {
           PreparedStatement stmt = connection.prepareStatement(sql);
ResultSet rs = stmt.executeQuery();
           if (rs != null) {
while (rs.next()) 
                   {
                       Produto saborConsulta = new Produto();
                       saborConsulta.setTipoProduto(rs.getString(1));
                       saborConsulta.setEspecificacao(rs.getString(2));
                       saborConsulta.setQtdDisponivel(Integer.parseInt(rs.getString(3)));
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
    
    public boolean exclui(String sabor) {
        boolean ok = false;
        String sql = "DELETE FROM Produto WHERE Especificacao = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, sabor);

            if (stmt.executeUpdate() > 0) {
                ok = true;
            }
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ok;
    }

        public boolean atualiza(Produto produto) {
        boolean ok = false;
        String sql = "UPDATE produto set QtdDisponivel=(SELECT lote.QtdUnitaria+produto.QtdDisponivel from lote WHERE lote.TipoProdutoLote = ? AND lote.Especificacao = ?) WHERE Especificacao = ?";
        //String sql2 = "DELETE FROM lote WHERE IdLote = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getTipoProduto());
            stmt.setString(2, produto.getEspecificacao());
            stmt.setString(3, produto.getEspecificacao());
            
          //  PreparedStatement stmt2 = connection.prepareStatement(sql2);
           // stmt2.setString(1, produto.getIDProduto());

            if (stmt.executeUpdate() > 0) {
                ok = true;
            }
            stmt.close();
            //stmt2.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ok;
    }
        
        public boolean desconta(Produto produto) {
        boolean ok = false;
        String sql = "UPDATE produto set QtdDisponivel= QtdDisponivel-? WHERE Especificacao = ?";
        //String sql2 = "DELETE FROM lote WHERE IdLote = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, produto.getTipoProduto());
            stmt.setString(2, produto.getEspecificacao());
            stmt.setString(3, produto.getEspecificacao());
            
          //  PreparedStatement stmt2 = connection.prepareStatement(sql2);
           // stmt2.setString(1, produto.getIDProduto());

            if (stmt.executeUpdate() > 0) {
                ok = true;
            }
            stmt.close();
            //stmt2.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ok;
    }
        
}