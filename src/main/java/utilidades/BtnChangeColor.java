package utilidades;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * @author Alex
 */
public class BtnChangeColor {
     // Método para cambiar el color de fondo y texto de un botón
    public static void cambiarColorBoton(JButton boton, Color colorFondo, Color colorTexto) {
        boton.setOpaque(true); // Asegura que el fondo sea visible
        boton.setBorderPainted(false); // Opcional: elimina bordes si es necesario
        boton.setBackground(colorFondo);
        boton.setForeground(colorTexto);
    }

// Función para actualizar el color de fondo y texto de cada botón
    public static void actualizarColoresBotones(JButton botonActivo, JButton... botones) {
        for (JButton boton : botones) {
            if (boton.equals(botonActivo)) {
                cambiarColorBoton(boton, Color.BLACK, Color.WHITE); // Botón activo
            } else {
                cambiarColorBoton(boton, Color.WHITE, Color.BLACK); // Otros botones
            }
        }
    }
}
