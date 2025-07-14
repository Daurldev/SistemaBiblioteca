package presentacion;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import datos.conexionSQL;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Libro {
     private static Connection conexion;

    public static void main(String[] args) {
           FlatMacDarkLaf.setup();
           new Login().setVisible(true);
          conexionSQL conectar = conexionSQL.getInstancia();
          try {
           conexion = conectar.getConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
        
    }
}
