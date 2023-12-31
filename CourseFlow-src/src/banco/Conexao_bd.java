package banco;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class Conexao_bd {
	 public Connection conexao;

	    public void conectar() throws SQLException {
	        try {
	            String url = "jdbc:mysql://localhost:3306/courseflow";
	            String usuario = "root";
	            String senha = "";

	            conexao = DriverManager.getConnection(url, usuario, senha);
	        } catch (SQLException ex) {
	            throw new SQLException("Não foi possível conectar ao banco de dados.\n" + ex.getMessage());
	        }
	    }

	    public ResultSet executarConsulta(String sql) throws SQLException {
	        conectar();
	        try (PreparedStatement consulta = conexao.prepareStatement(sql)) {
	            return consulta.executeQuery();
	        } catch (SQLException ex) {
	            throw new SQLException("Não foi possível executar a CONSULTA solicitada.\n" + ex.getMessage());
	        }
	    }

	    public void executarComando(String sql) throws SQLException {
	        conectar();
	        try (PreparedStatement comando = conexao.prepareStatement(sql)) {
	            comando.executeUpdate();
	        } catch (SQLException ex) {
	            throw new SQLException("A instrução não foi realizada.\n" + ex.getMessage());
	        } finally {
	            if (conexao != null && !conexao.isClosed()) {
	                conexao.close();
	            }
	        }
	    }
	}
