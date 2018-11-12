package dao;

import factory.ConnectionFactory;
import modelo.Login;
import java.sql.*;
import javax.swing.*;
import java.util.*;

public class LoginDAO {

    private Connection connection;
    String Login;
    String Senha;

    public LoginDAO() {

        this.connection = new ConnectionFactory().getConnection();

    }

    public Login valida(Login Login) {
        Login retorno = new Login();
        String sql = "select * from funcionario where Login= ? , Senha = ? , Cargo = ? ";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Login.getLogin());
            stmt.setString(2, Login.getSenha());
            stmt.setString(3, Login.getCargo());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                rs.first();
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
}
