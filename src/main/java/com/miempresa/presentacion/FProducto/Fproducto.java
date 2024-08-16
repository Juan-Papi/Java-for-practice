package com.miempresa.presentacion.FProducto;

import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;

import com.miempresa.negocio.datasources.ProductDatasourceImpl;
import com.miempresa.negocio.repositories.ProductRepositoryImpl;
import com.miempresa.presentacion.PruebaProducto;

public class Fproducto extends JFrame {

    PruebaProducto pruebaProducto = new PruebaProducto(new ProductRepositoryImpl(new ProductDatasourceImpl()));

    public Fproducto() {
        // Configura el JFrame (ventana principal)
        setTitle("Gestionar Productos");
        setSize(800, 600);
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

        // Asigna ActionListeners para ítems del menú Extras
        itemExtra1.addActionListener(e -> onExtra1());
        itemExtra2.addActionListener(e -> onExtra2());

        // Añade los menús a la barra de menú
        menuBar.add(menuArchivo);
        menuBar.add(menuFunciones);
        menuBar.add(menuExtras);

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

    private void initialize() {
        // Crea el panel principal
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(10, 10));

        // Título grande y centrado
        JLabel titulo = new JLabel("GESTIONAR PRODUCTO", SwingConstants.CENTER);
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        mainPanel.add(titulo, BorderLayout.NORTH);

        // Panel para los campos de entrada
        JPanel panelCampos = new JPanel();
        panelCampos.setLayout(new GridLayout(4, 2, 10, 10));

        panelCampos.add(new JLabel("ID:"));
        JTextField txtID = new JTextField();
        panelCampos.add(txtID);

        panelCampos.add(new JLabel("Nombre:"));
        JTextField txtNombre = new JTextField();
        panelCampos.add(txtNombre);

        panelCampos.add(new JLabel("Precio:"));
        JTextField txtPrecio = new JTextField();
        panelCampos.add(txtPrecio);

        panelCampos.add(new JLabel("Categoría:"));
        JComboBox<String> comboCategoria = new JComboBox<>(
                new String[] { "Electrónica", "Ropa", "Alimentos", "Otros" });
        panelCampos.add(comboCategoria);

        // Panel para los botones
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout());

        JButton btnInsertar = new JButton("Insertar");
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnEliminar = new JButton("Eliminar");

        panelBotones.add(btnInsertar);
        panelBotones.add(btnActualizar);
        panelBotones.add(btnEliminar);

        // Panel para los botones y la tabla
        JPanel panelBotonesTabla = new JPanel();
        panelBotonesTabla.setLayout(new BorderLayout(10, 10));
        panelBotonesTabla.add(panelBotones, BorderLayout.NORTH);

        // Tabla para mostrar los productos
        String[] columnas = { "ID", "Nombre", "Precio", "Categoría" };
        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        JTable tablaProductos = new JTable(modeloTabla);

        JScrollPane scrollPane = new JScrollPane(tablaProductos);
        scrollPane.setPreferredSize(new Dimension(750, 200));

        panelBotonesTabla.add(scrollPane, BorderLayout.CENTER);

        // Añade los componentes al panel principal
        mainPanel.add(panelCampos, BorderLayout.CENTER);
        mainPanel.add(panelBotonesTabla, BorderLayout.SOUTH);

        // Añade el panel principal a la ventana
        this.add(mainPanel);
    }

    public static void main(String[] args) {
        // Crea la instancia de la ventana y la muestra
        Fproducto frame = new Fproducto();
        frame.setVisible(true);
    }
}
