package com.miempresa.presentacion.FGeneral;

import javax.swing.*;

public class Fpracticas extends JFrame {
    public Fpracticas() {
        // Configura el JFrame (ventana principal)
        setTitle("Formulario de Prácticas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Añade la barra de menú
        createMenuBar();

        // Llama al método para inicializar los componentes
        initialize();
    }

    private void createMenuBar() {
        // Crea la barra de menú
        JMenuBar menuBar = new JMenuBar();

        // Crea los menús
        JMenu menuArchivo = new JMenu("Archivo");
        JMenu menuFunciones = new JMenu("Funciones");
        JMenu menuProductos = new JMenu("Productos");
        JMenu menuExtras = new JMenu("Extras");

        // Crea y añade ítems al menú Archivo
        JMenuItem itemNuevo = new JMenuItem("Nuevo");
        JMenuItem itemAbrir = new JMenuItem("Abrir");
        JMenuItem itemGuardar = new JMenuItem("Guardar");
        JMenuItem itemSalir = new JMenuItem("Salir");
        menuArchivo.add(itemNuevo);
        menuArchivo.add(itemAbrir);
        menuArchivo.add(itemGuardar);
        menuArchivo.addSeparator(); // Añade un separador
        menuArchivo.add(itemSalir);

        // Asigna un ActionListener a cada ítem del menú, llamando a funciones
        // específicas
        itemNuevo.addActionListener(e -> onNuevo());
        itemAbrir.addActionListener(e -> onAbrir());
        itemGuardar.addActionListener(e -> onGuardar());
        itemSalir.addActionListener(e -> onSalir());

        // Crea y añade ítems al menú Funciones
        JMenuItem itemFuncion1 = new JMenuItem("Función 1");
        JMenuItem itemFuncion2 = new JMenuItem("Función 2");
        menuFunciones.add(itemFuncion1);
        menuFunciones.add(itemFuncion2);

        // Asigna ActionListeners para ítems del menú Funciones
        itemFuncion1.addActionListener(e -> onFuncion1());
        itemFuncion2.addActionListener(e -> onFuncion2());

        // Crea y añade ítems al menú Extras
        JMenuItem itemExtra1 = new JMenuItem("Extra 1");
        JMenuItem itemExtra2 = new JMenuItem("Extra 2");
        menuExtras.add(itemExtra1);
        menuExtras.add(itemExtra2);

        JMenuItem itemListarP = new JMenuItem("Listar");
        JMenuItem itemCrearP = new JMenuItem("Crear");
        menuProductos.add(itemListarP);
        menuProductos.add(itemCrearP);

        itemListarP.addActionListener(e -> onListarP());
        itemCrearP.addActionListener(e -> onCrearP());

        // Asigna ActionListeners para ítems del menú Extras
        itemExtra1.addActionListener(e -> onExtra1());
        itemExtra2.addActionListener(e -> onExtra2());

        // Añade los menús a la barra de menú
        menuBar.add(menuArchivo);
        menuBar.add(menuFunciones);
        menuBar.add(menuExtras);
        menuBar.add(menuProductos);

        // Establece la barra de menú en el JFrame
        setJMenuBar(menuBar);
    }

    // Métodos específicos para manejar las acciones de los ítems del menú
    private void onNuevo() {
        JOptionPane.showMessageDialog(this, "Acción: Nuevo");
    }

    private void onAbrir() {
        JOptionPane.showMessageDialog(this, "Acción: Abrir");
    }

    private void onGuardar() {
        JOptionPane.showMessageDialog(this, "Acción: Guardar");
    }

    private void onSalir() {
        System.exit(0); // Cierra la aplicación
    }

    private void onFuncion1() {
        JOptionPane.showMessageDialog(this, "Acción: Función 1");
    }

    private void onFuncion2() {
        JOptionPane.showMessageDialog(this, "Acción: Función 2");
    }

    private void onExtra1() {
        JOptionPane.showMessageDialog(this, "Acción: Extra 1");
    }

    private void onExtra2() {
        JOptionPane.showMessageDialog(this, "Acción: Extra 2");
    }

    private void onListarP() {
        JOptionPane.showMessageDialog(this, "Acción: listar p");
    }

    private void onCrearP() {
        JOptionPane.showMessageDialog(this, "Acción: crear p");
    }

    public void initialize() {
        // Crea el panel principal
        JPanel mainPanel = new JPanel();
        setLocationRelativeTo(null);

        // Añade componentes al panel
        JLabel labelNombre = new JLabel("Nombre:");
        JTextField textFieldNombre = new JTextField(20);

        JLabel labelApellido = new JLabel("Apellido:");
        JTextField textFieldApellido = new JTextField(20);

        JButton buttonGuardar = new JButton("Guardar");

        // Añade los componentes al panel
        mainPanel.add(labelNombre);
        mainPanel.add(textFieldNombre);
        mainPanel.add(labelApellido);
        mainPanel.add(textFieldApellido);
        mainPanel.add(buttonGuardar);

        // Añade el panel a la ventana principal
        this.add(mainPanel);
    }

    public static void main(String[] args) {
        // Crea la instancia de la ventana y la muestra
        Fpracticas frame = new Fpracticas();
        frame.setVisible(true);
    }
}
