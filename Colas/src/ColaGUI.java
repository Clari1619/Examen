
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cbv16
 */
public class ColaGUI extends JFrame {
    private Queue<String> cola = new LinkedList<>();
    private JTextArea textArea;

    public ColaGUI() {
        setTitle("Cola GUI");
        setSize(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        textArea = new JTextArea(10, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);

        JButton enqueueButton = new JButton("Encolar");
        JButton dequeueButton = new JButton("Desencolar");
        JButton frontButton = new JButton("Frente de la cola");
        JButton isEmptyButton = new JButton("¿Está vacía?");
        JButton sizeButton = new JButton("Tamaño de la cola");

        enqueueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = JOptionPane.showInputDialog("Ingrese un elemento para encolar:");
                if (input != null) {
                    cola.offer(input);
                    updateTextArea();
                }
            }
        });

        dequeueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!cola.isEmpty()) {
                    cola.poll();
                    updateTextArea();
                } else {
                    JOptionPane.showMessageDialog(ColaGUI.this, "La cola está vacía.");
                }
            }
        });

        frontButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!cola.isEmpty()) {
                    String frontElement = cola.peek();
                    JOptionPane.showMessageDialog(ColaGUI.this, "Frente de la cola: " + frontElement);
                } else {
                    JOptionPane.showMessageDialog(ColaGUI.this, "La cola está vacía.");
                }
            }
        });

        isEmptyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean empty = cola.isEmpty();
                JOptionPane.showMessageDialog(ColaGUI.this, "La cola está vacía: " + empty);
            }
        });

        sizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = cola.size();
                JOptionPane.showMessageDialog(ColaGUI.this, "Tamaño de la cola: " + size);
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(enqueueButton);
        buttonPanel.add(dequeueButton);
        buttonPanel.add(frontButton);
        buttonPanel.add(isEmptyButton);
        buttonPanel.add(sizeButton);

        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(buttonPanel, BorderLayout.SOUTH);
    }

    private void updateTextArea() {
        textArea.setText("");
        for (String item : cola) {
            textArea.append(item + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ColaGUI gui = new ColaGUI();
                gui.setVisible(true);
            }
        });
    }
}
