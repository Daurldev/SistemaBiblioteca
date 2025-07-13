package com.mycompany.libro;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.SwingUtilities;

public class Libro {

    public static void main(String[] args) {
       SwingUtilities.invokeLater(() ->{
           FlatMacLightLaf.setup();
           new Dashboard().setVisible(true);
       });
    }
}
