package com.mycompany.tdadocentes;

/**
 * Clase principal para lanzar la aplicación
 * @author Lenovo
 */
public class TdaDocentes {

    public static void main(String[] args) {
        // Llama y muestra el formulario visual
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame().setVisible(true);
        });
    }
}