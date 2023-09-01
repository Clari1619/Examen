/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbv16
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CajeroAutomaticoGUI extends JFrame {
    private JLabel lblMensaje;
    private JTextField txtCuenta;
    private JPasswordField txtPIN;
    private JButton btnIngresar;
    private JPanel panelMenu;
    private JButton btnVerBalance;
    private JButton btnSacarDinero;
    private JButton btnIngresarDinero;
    private JButton btnComprarDolares;
    private JButton btnVenderDolares;
    private JButton btnSalir;

    private String[] numerosCuenta = {"123456", "234567", "345678", "456789", "567890"};
    private String[] pines = {"1111", "2222", "3333", "4444", "5555"};
    private double[] fondos = {1000.0, 2000.0, 3000.0, 4000.0, 5000.0};
    private double[] balances = {0.0, 0.0, 0.0, 0.0, 0.0};

    private int usuarioActual = -1; // Índice del usuario autenticado actualmente

    public CajeroAutomaticoGUI() {
        setTitle("Cajero Automático");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Panel de autenticación
        JPanel panelAutenticacion = new JPanel(new GridLayout(3, 2));
        panelAutenticacion.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        JLabel lblCuenta = new JLabel("Número de cuenta:");
        txtCuenta = new JTextField();
        JLabel lblPIN = new JLabel("PIN:");
        txtPIN = new JPasswordField();
        lblMensaje = new JLabel();
        btnIngresar = new JButton("Ingresar");

        panelAutenticacion.add(lblCuenta);
        panelAutenticacion.add(txtCuenta);
        panelAutenticacion.add(lblPIN);
        panelAutenticacion.add(txtPIN);
        panelAutenticacion.add(lblMensaje);
        panelAutenticacion.add(btnIngresar);

        // Panel del menú principal
        panelMenu = new JPanel(new GridLayout(6, 1));
        panelMenu.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        btnVerBalance = new JButton("Ver balance");
        btnSacarDinero = new JButton("Sacar dinero");
        btnIngresarDinero = new JButton("Ingresar dinero");
        btnComprarDolares = new JButton("Comprar dólares");
        btnVenderDolares = new JButton("Vender dólares");
        btnSalir = new JButton("Salir");

        panelMenu.add(btnVerBalance);
        panelMenu.add(btnSacarDinero);
        panelMenu.add(btnIngresarDinero);
        panelMenu.add(btnComprarDolares);
        panelMenu.add(btnVenderDolares);
        panelMenu.add(btnSalir);

        // Agregar paneles al JFrame
        setLayout(new CardLayout());
        add(panelAutenticacion, "AUTENTICACION");
        add(panelMenu, "MENU_PRINCIPAL");

        // Evento de botón "Ingresar"
        btnIngresar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cuenta = txtCuenta.getText();
                String pin = new String(txtPIN.getPassword());
                int indiceUsuario = autenticarUsuario(cuenta, pin);
                if (indiceUsuario != -1) {
                    usuarioActual = indiceUsuario;
                    lblMensaje.setText("");
                    cambiarPanel("MENU_PRINCIPAL");
                } else {
                    lblMensaje.setText("Cuenta o PIN incorrecto.");
                }
                txtCuenta.setText("");
                txtPIN.setText("");
            }
        });

        // Evento de botón "Ver balance"
        btnVerBalance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double balance = balances[usuarioActual];
                double fondo = fondos[usuarioActual];
                JOptionPane.showMessageDialog(null, "Balance: $" + balance + "\nFondos disponibles: $" + fondo);
            }
        });

        // Evento de botón "Sacar dinero"
        btnSacarDinero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a retirar:");
                try {
                    double cantidad = Double.parseDouble(input);
                    if (cantidad > 0 && cantidad <= fondos[usuarioActual]) {
                        fondos[usuarioActual] -= cantidad;
                        balances[usuarioActual] -= cantidad;
                        JOptionPane.showMessageDialog(null, "Retiro exitoso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad inválida o insuficiente fondos.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida.");
                }
            }
        });

        // Evento de botón "Ingresar dinero"
        btnIngresarDinero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Ingrese la cantidad de dinero a ingresar:");
                try {
                    double cantidad = Double.parseDouble(input);
                    if (cantidad > 0) {
                        balances[usuarioActual] += cantidad;
                        JOptionPane.showMessageDialog(null, "Ingreso exitoso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cantidad inválida.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Cantidad inválida.");
                }
            }
        });

        // Evento de botón "Comprar dólares"
        btnComprarDolares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verificar si el usuario tiene una cuenta en dólares
                if (usuarioActual >= 0 && usuarioActual < fondos.length && fondos[usuarioActual] > 0) {
                    // Lógica para comprar dólares
                    JOptionPane.showMessageDialog(null, "Comprar dólares - Opción en desarrollo.");
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene una cuenta en dólares.");
                }
            }
        });

        // Evento de botón "Vender dólares"
        btnVenderDolares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Verificar si el usuario tiene una cuenta en dólares
                if (usuarioActual >= 0 && usuarioActual < fondos.length && fondos[usuarioActual] > 0) {
                    // Lógica para vender dólares
                    JOptionPane.showMessageDialog(null, "Vender dólares - Opción en desarrollo.");
                } else {
                    JOptionPane.showMessageDialog(null, "No tiene una cuenta en dólares.");
                }
            }
        });

        // Evento de botón "Salir"
        btnSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                usuarioActual = -1;
                cambiarPanel("AUTENTICACION");
            }
        });
    }

    private int autenticarUsuario(String cuenta, String pin) {
        for (int i = 0; i < numerosCuenta.length; i++) {
            if (numerosCuenta[i].equals(cuenta) && pines[i].equals(pin)) {
                return i;
            }
        }
        return -1;
    }

    private void cambiarPanel(String panel) {
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(getContentPane(), panel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                CajeroAutomaticoGUI gui = new CajeroAutomaticoGUI();
                gui.setVisible(true);
            }
        });
    }
}

