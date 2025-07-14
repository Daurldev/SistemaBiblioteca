package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alex
 */
public class conexionSQL {
     private static conexionSQL instancia;
    private Connection conexion;

    private String host = "localhost:";
    private String port = "1433";
    private String database = "Biblioteca";
    private String user = "sa";
    private String password = "alexdaniel12345";

    private conexionSQL() {
        // Constructor privado para evitar instancias externas
    }

    public static conexionSQL getInstancia() {
        if (instancia == null) {
            instancia = new conexionSQL();
        }
        return instancia;
    }

    public Connection getConexion() throws SQLException {
        if (conexion == null || conexion.isClosed()) {
            String conexionUrl = "jdbc:sqlserver://" + host + port + ";"
                    + "databaseName=" + database + ";"
                    + "user=" + user + ";"
                    + "password=" + password + ";"
                    + "trustServerCertificate=true;"
                    + "loginTimeout=30;";

            try {
                conexion = DriverManager.getConnection(conexionUrl);
                System.out.println("Conexion exitosa a la base de datos");
            } catch (SQLException ex) {
                System.out.println("Error en la conexion: " + ex.getMessage());
                throw ex;
            }
        }
        return conexion;
    }

    public void cerrarConexion() {
        if (conexion != null) {
            try {
                conexion.close();
                System.out.println("Conexión a la base de datos cerrada correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
