package poo9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InversorTextoGUI extends JFrame {

    private JTextField campoTexto;
    private JButton botaoInverter;

    public InversorTextoGUI() {
        setTitle("Inversor de Texto");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        setLayout(new FlowLayout()); 

        campoTexto = new JTextField(25); 
        add(campoTexto);

        botaoInverter = new JButton("Inverter");
        add(botaoInverter);

        botaoInverter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                inverterTexto();
            }
        });

        setVisible(true);
    }

    private void inverterTexto() {
        String textoOriginal = campoTexto.getText();
        if (textoOriginal.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, digite um texto para inverter.", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        StringBuilder sb = new StringBuilder(textoOriginal);
        String textoInvertido = sb.reverse().toString();

        JDialog dialog = new JDialog(this, "Texto Invertido", true); 
        dialog.setSize(300, 100);
        dialog.setLocationRelativeTo(this); 
        dialog.setLayout(new FlowLayout());

        JLabel labelTextoInvertido = new JLabel("O texto invertido é: " + textoInvertido);
        dialog.add(labelTextoInvertido);

        JButton botaoOk = new JButton("OK");
        botaoOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dialog.dispose(); 
            }
        });
        dialog.add(botaoOk);

        dialog.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InversorTextoGUI();
            }
        });
    }
}