package dao;

import gui.FuncionarioGUI;
import factory.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Funcionario;

public class FuncionarioDAO {

    private Connection connection;
    Long Matricula;
    String Nome;
    String Cpf;
    String Rg;
    String DataNasc;
    String EstadoCivil;
    String Sexo;
    String Email;
    String Cargo;
    int Telefone;
    int Celular;

    int DataInicio;
    int DataTermino;
    String Login;
    String Senha;
    float Salario;
    float Auxilio;
    int HorarioTrabCom;
    int HorarioTrabFim;
    int IntervCom;
    int IntervFim;

    
     public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }
    
    public String getLogin() {
        return Login;
    }
    
    public void setLogin(String Login) {
        this.Login = Login;
    }
    
    public String getRg() {
        return Rg;
    }
    
    public void setRg(String Rg) {
        this.Rg = Rg;
    }
    
    public String getEmail() {
        return Email;
    }
    
    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getCargo() {
        return Cargo;
    }
    
    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    public FuncionarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public boolean adiciona(Funcionario funcionario) {
        boolean ok = false;
        String sql = "INSERT INTO Funcionario (Nome, Cpf, Rg, DataNasc, EstadoCivil, Sexo, Email, Telefone, "
                + "Celular, Cargo, DataInicio, DataTermino, Login, Senha, Salario, Auxilio, HorarioTrabCom,"
                + " HorarioTrabFim, IntervCom, IntervFim) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getRg());
            stmt.setString(4, funcionario.getData_Nasc());
            stmt.setString(5, funcionario.getEstado_Civil());
            stmt.setString(6, funcionario.getSexo());
            stmt.setString(7, funcionario.getEmail());
            stmt.setString(8, funcionario.getTelefone());
            stmt.setString(9, funcionario.getCelular());
            stmt.setString(10, funcionario.getCargo());
            stmt.setString(11, funcionario.getData_Inicio());
            stmt.setString(12, funcionario.getData_Termino());
            stmt.setString(13, funcionario.getLogin());
            stmt.setString(14, funcionario.getSenha());
            stmt.setFloat(15, funcionario.getSalario());
            stmt.setFloat(16, funcionario.getAuxilio());
            stmt.setString(17, funcionario.getHorario_Trab_Com());
            stmt.setString(18, funcionario.getHorario_Trab_Fim());
            stmt.setString(19, funcionario.getInterv_Com());
            stmt.setString(20, funcionario.getInterv_Fim());
            stmt.execute();
            stmt.close();
            ok = true;
        } catch (SQLException u) {
            System.err.println(u.getMessage());
        }
        return ok;
    }

    public Long pegaMatricula() {
        String sql = "SELECT Matricula FROM Funcionario ORDER BY Matricula DESC";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Matricula = rs.getLong("Matricula");
                Matricula++;
            } else {
                Matricula = Long.parseLong("1");
            }
        } catch (SQLException u) {
            System.err.println(u.getMessage());
        }

        return Matricula;
    }

    public Funcionario recupera(Funcionario funcionario) {
        Funcionario retorno = new Funcionario();
        String sql = "SELECT Nome, Cpf, Rg, DataNasc, EstadoCivil, Sexo, Email, Telefone, Celular, Cargo, DataInicio, DataTermino, Login, Senha,"
                + " Salario, Auxilio, HorarioTrabCom, HorarioTrabFim, IntervCom, IntervFim FROM Funcionario"
                + " WHERE Matricula = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getMatricula().toString());
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                rs.first();
                retorno.setNome(rs.getString(1));
                retorno.setCpf(rs.getString(2));
                retorno.setRg(rs.getString(3));
                retorno.setData_Nasc(rs.getString(4));
                retorno.setEstado_Civil(rs.getString(5));
                retorno.setSexo(rs.getString(6));
                retorno.setEmail(rs.getString(7));
                retorno.setTelefone(rs.getString(8));
                retorno.setCelular(rs.getString(9));
                retorno.setCargo(rs.getString(10));
                retorno.setData_Inicio(rs.getString(11));
                retorno.setData_Termino(rs.getString(12));
                retorno.setLogin(rs.getString(13));
                retorno.setSenha(rs.getString(14));
                retorno.setSalario(Float.parseFloat(rs.getString(15)));
                retorno.setAuxilio(Float.parseFloat(rs.getString(16)));
                retorno.setHorario_Trab_Com(rs.getString(17));
                retorno.setHorario_Trab_Fim(rs.getString(18));
                retorno.setInterv_Com(rs.getString(19));
                retorno.setInterv_Fim(rs.getString(20));
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
    
    

    public boolean altera(Funcionario funcionario) {
        boolean ok = false;
        String sql = "UPDATE Funcionario set Nome = ?, Cpf = ?, Rg = ?, DataNasc = ?, EstadoCivil = ?, Sexo = ?, Email = ?, Telefone = ?, Celular = ?, Cargo = ?, DataInicio = ?, DataTermino = ?, "
                + "Login = ?, Senha = ?, Salario = ?, Auxilio = ?, HorarioTrabCom = ?, HorarioTrabFim = ?, IntervCom = ?, IntervFim = ? WHERE Matricula = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            stmt.setString(3, funcionario.getRg());
            stmt.setString(4, funcionario.getData_Nasc());
            stmt.setString(5, funcionario.getEstado_Civil());
            stmt.setString(6, funcionario.getSexo());
            stmt.setString(7, funcionario.getEmail());
            stmt.setString(8, funcionario.getTelefone());
            stmt.setString(9, funcionario.getCelular());
            stmt.setString(10, funcionario.getCargo());
            stmt.setString(11, funcionario.getData_Inicio());
            stmt.setString(12, funcionario.getData_Termino());
            stmt.setString(13, funcionario.getLogin());
            stmt.setString(14, funcionario.getSenha());
            stmt.setFloat(15, funcionario.getSalario());
            stmt.setFloat(16, funcionario.getAuxilio());
            stmt.setString(17, funcionario.getHorario_Trab_Com());
            stmt.setString(18, funcionario.getHorario_Trab_Fim());
            stmt.setString(19, funcionario.getInterv_Com());
            stmt.setString(20, funcionario.getInterv_Fim());
            stmt.setString(21, funcionario.getMatricula().toString());

            if (stmt.executeUpdate() > 0) {
                ok = true;
            }
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ok;
    }

    public boolean exclui(Long Matricula) {
        boolean ok = false;
        String sql = "DELETE FROM Funcionario WHERE Matricula = ?";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, Matricula.toString());

            if (stmt.executeUpdate() > 0) {
                ok = true;
            }
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
        return ok;
    }
    
    public List<Funcionario> recuperaFuncionarios(){
        List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
String sql = "SELECT Matricula, Nome, Cargo, DataInicio, DataTermino, Salario, Auxilio FROM Funcionario ORDER BY Nome" ;
try {
           PreparedStatement stmt = connection.prepareStatement(sql);
ResultSet rs = stmt.executeQuery();
           if (rs != null) {
while (rs.next()) 
                   {
                       Funcionario funcionarioConsulta = new Funcionario();
                       funcionarioConsulta.setMatricula(Long.parseLong(rs.getString(1)));
                       funcionarioConsulta.setNome(rs.getString(2));
                       funcionarioConsulta.setCargo(rs.getString(3));
                       funcionarioConsulta.setData_Inicio(rs.getString(4));
                       funcionarioConsulta.setData_Termino(rs.getString(5));
                       funcionarioConsulta.setSalario(Float.parseFloat(rs.getString(6)));
                       funcionarioConsulta.setAuxilio(Float.parseFloat(rs.getString(7)));
                       listaFuncionario.add(funcionarioConsulta);
                   }
                rs.close();
                stmt.close();
                return(listaFuncionario);
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
    
    
    public boolean verifCpf() {
        
        int dig1, dig2, erro;
        char CPF[] = getCpf().toCharArray();

        dig1 = dig2 = erro = 0;

        int s1 = Integer.parseInt(String.valueOf(CPF[0]));
        int s2 = Integer.parseInt(String.valueOf(CPF[1]));
        int s3 = Integer.parseInt(String.valueOf(CPF[2]));
        int s4 = Integer.parseInt(String.valueOf(CPF[4]));
        int s5 = Integer.parseInt(String.valueOf(CPF[5]));
        int s6 = Integer.parseInt(String.valueOf(CPF[6]));
        int s7 = Integer.parseInt(String.valueOf(CPF[8]));
        int s8 = Integer.parseInt(String.valueOf(CPF[9]));
        int s9 = Integer.parseInt(String.valueOf(CPF[10]));

        int soma = ((s1 * 10) + (s2 * 9) + (s3 * 8) + (s4 * 7) + (s5 * 6)
                + (s6 * 5) + (s7 * 4) + (s8 * 3) + (s9 * 2));

        int resto = (soma % 11);

        if (resto < 2) {
            dig1 = 0;
        } else {
            dig1 = 11 - resto;
        }
        soma = ((s1 * 11) + (s2 * 10) + (s3 * 9) + (s4 * 8) + (s5 * 7)
                + (s6 * 6) + (s7 * 5) + (s8 * 4) + (s9 * 3) + (dig1 * 2));
        resto = (soma % 11);

        if (resto < 2) {
            dig2 = 0;
        } else {
            dig2 = 11 - resto;
        }

        int a = Integer.parseInt(String.valueOf(CPF[12]));
        int b = Integer.parseInt(String.valueOf(CPF[13]));

        if (dig1 == a && dig2 == b) {                        

            if (CPF[0] == '1' && CPF[1] == '1' && CPF[2] == '1'
                    && CPF[4] == '1' && CPF[5] == '1' && CPF[6] == '1'
                    && CPF[8] == '1' && CPF[9] == '1' && CPF[10] == '1') {
                erro++;
            }
            if (CPF[0] == '2' && CPF[1] == '2' && CPF[2] == '2'
                    && CPF[4] == '2' && CPF[5] == '2' && CPF[6] == '2'
                    && CPF[8] == '2' && CPF[9] == '2' && CPF[10] == '2') {
                erro++;
            }
            if (CPF[0] == '3' && CPF[1] == '3' && CPF[2] == '3'
                    && CPF[4] == '3' && CPF[5] == '3' && CPF[6] == '3'
                    && CPF[8] == '3' && CPF[9] == '3' && CPF[10] == '3') {
                erro++;
            }
            if (CPF[0] == '4' && CPF[1] == '4' && CPF[2] == '4'
                    && CPF[4] == '4' && CPF[5] == '4' && CPF[6] == '4'
                    && CPF[8] == '4' && CPF[9] == '4' && CPF[10] == '4') {
                erro++;
            }
            if (CPF[0] == '5' && CPF[1] == '5' && CPF[2] == '5'
                    && CPF[4] == '5' && CPF[5] == '5' && CPF[6] == '5'
                    && CPF[8] == '5' && CPF[9] == '5' && CPF[10] == '5') {
                erro++;
            }
            if (CPF[0] == '6' && CPF[1] == '6' && CPF[2] == '6'
                    && CPF[4] == '6' && CPF[5] == '6' && CPF[6] == '6'
                    && CPF[8] == '6' && CPF[9] == '6' && CPF[10] == '6') {
                erro++;
            }
            if (CPF[0] == '7' && CPF[1] == '7' && CPF[2] == '7'
                    && CPF[4] == '7' && CPF[5] == '7' && CPF[6] == '7'
                    && CPF[8] == '7' && CPF[9] == '7' && CPF[10] == '7') {
                erro++;
            }
            if (CPF[0] == '8' && CPF[1] == '8' && CPF[2] == '8'
                    && CPF[4] == '8' && CPF[5] == '8' && CPF[6] == '8'
                    && CPF[8] == '8' && CPF[9] == '8' && CPF[10] == '8') {
                erro++;
            }
            if (CPF[0] == '9' && CPF[1] == '9' && CPF[2] == '9'
                    && CPF[4] == '9' && CPF[5] == '9' && CPF[6] == '9'
                    && CPF[8] == '9' && CPF[9] == '9' && CPF[10] == '9') {
                erro++;
            }
            if (CPF[0] == '0' && CPF[1] == '0' && CPF[2] == '0'
                    && CPF[4] == '0' && CPF[5] == '0' && CPF[6] == '0'
                    && CPF[8] == '0' && CPF[9] == '0' && CPF[10] == '0') {
                erro++;
            }
                        
            if (erro != 0) {
                JOptionPane.showMessageDialog(null, "CPF inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
                return false;
            } else {
                return true;
            }
           
        }
        else {
            JOptionPane.showMessageDialog(null, "CPF inválido", "ERRO", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
}
    public boolean verifEmail(){;
        boolean ok = true;
        String email = getEmail();
        if ((email.contains("@")) && (email.contains(".")) && (!email.contains(" "))) {
            String usuario = new String(email.substring(0, email.lastIndexOf('@')));
            String dominio = new String(email.substring(email.lastIndexOf('@') + 1, email.length()));
            if ((usuario.length() >= 1) && (!usuario.contains("@")) && (dominio.contains(".")) && (!dominio.contains("@"))
                    && (dominio.indexOf(".") >= 1) && (dominio.lastIndexOf(".") < dominio.length() - 1)) {
                ok = true;
            } else {
                JOptionPane.showMessageDialog(null, "E-mail inválido", "ERRO", JOptionPane.ERROR_MESSAGE);                                
                ok = false;

            }
        } else {
            JOptionPane.showMessageDialog(null, "E-mail inválido", "ERRO", JOptionPane.ERROR_MESSAGE);             
            ok = false;
        }
        return ok;
    }
    
    public boolean verifDataNasc(String dados[]){
        boolean ok;

        if (Integer.parseInt(dados[0]) >= 32) {
            JOptionPane.showMessageDialog(null, "Essa data não existe");
            ok = false;
        } else {
            if (Integer.parseInt(dados[1]) >= 13) {
                JOptionPane.showMessageDialog(null, "Esse mês não existe");
                ok = false;
            } else {
                if (Integer.parseInt(dados[2]) >= 1998) {
                    JOptionPane.showMessageDialog(null, "Você é muito novo para se cadastrar");
                    ok = false;
                } else{
                    ok = true;
                }
            }
        }
        return ok;
    }
    
    public boolean verifData(String dados[]){
        boolean ok;

        if (Integer.parseInt(dados[0]) >= 32) {
            JOptionPane.showMessageDialog(null, "Essa data não existe");
            ok = false;
        } else {
            if (Integer.parseInt(dados[1]) >= 13) {
                JOptionPane.showMessageDialog(null, "Esse mês não existe");
                ok = false;
            } else {
                ok = true;                
            }
        }
        return ok;
    }
    
    
    public boolean verifHora(String pega){
        boolean ok=true;
        
        String hora = null;
        String minuto = null;
        int conta_pega = 0;
        int conta_hora = 0;
        int conta_minuto = 0;

        
        pega = pega.trim();
        if (pega.equals(":")) {
            JOptionPane.showMessageDialog(null, "Digite a hora", "Operador", JOptionPane.ERROR_MESSAGE);
            ok = false;            
        } else {
        conta_pega = pega.length();
        if (conta_pega < 5) {
            JOptionPane.showMessageDialog(null, "Digite a hora", "Operador", JOptionPane.ERROR_MESSAGE);
            ok = false;
        } else {

        hora = pega.substring(0, 2);
        minuto = pega.substring(3, 5);
        conta_hora = Integer.parseInt(hora);
        conta_minuto = Integer.parseInt(minuto);

        if (conta_hora > 23) {
            JOptionPane.showMessageDialog(null, "Hora digitada inválida", "Operador", JOptionPane.ERROR_MESSAGE);
            ok = false;
        } else {
        if (conta_minuto > 59) {
            JOptionPane.showMessageDialog(null, "Hora digitada inválida", "Operador", JOptionPane.ERROR_MESSAGE);
            ok = false;
        } else {
            ok = true;
        }
        
        
    }
        }
        }
        return ok;
    }

    public boolean verifCpfBd(){ 
        boolean ok;        
        String sql = "SELECT Cpf FROM Funcionario WHERE Cpf = ?";
     
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, getCpf().toString());            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {                
                JOptionPane.showMessageDialog(null, "CPF já cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);                
                rs.first();
                ok = false;                
            } else {
                ok = true;
            }           
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }        
        
       return ok;   
    }

    public boolean verifLoginBd(){ 

        boolean ok;
        
        String sql = "SELECT Login FROM Funcionario WHERE Login = ?";
     
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, getLogin().toString());
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                FuncionarioGUI document = new FuncionarioGUI();
                JOptionPane.showMessageDialog(null, "Login já cadastrado, utilize outro", "ERRO", JOptionPane.ERROR_MESSAGE);                
                rs.first();
                ok = false;
            } else {
                ok = true;
            }            
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
                     
         return ok;          
    }
    
    public boolean verifRgBd(){ 

        boolean ok;
        
        String sql = "SELECT Rg FROM Funcionario WHERE Rg = ?";
     
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, getRg().toString());
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                FuncionarioGUI document = new FuncionarioGUI();
                JOptionPane.showMessageDialog(null, "Rg já cadastrado", "ERRO", JOptionPane.ERROR_MESSAGE);                
                rs.first();
                ok = false;
            } else {
                ok = true;
            }           
            stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
                     
         return ok;          
    }
                                
    public boolean verifEmailBd(){ 

        boolean ok;
        
        String sql = "SELECT Email FROM Funcionario WHERE Email = ?";
     
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, getEmail().toString());
            
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                FuncionarioGUI document = new FuncionarioGUI();
                JOptionPane.showMessageDialog(null, "Email já cadastrado, utilize outro", "ERRO", JOptionPane.ERROR_MESSAGE);                
                rs.first();
                ok = false;
            } else {
                ok = true;
            }
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }        
         return ok;
    }
                                }
