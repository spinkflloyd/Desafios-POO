package poo9_1;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ConversorCaseGUI extends JFrame {

    private JCheckBox cbMaiusculas;
    private JCheckBox cbMinusculas;
    private JTextField campoTexto;
    private ButtonGroup grupoCheckboxes;

    private boolean updatingText = false;

    public ConversorCaseGUI() {
        setTitle("Conversor de Maiúsculas/Minúsculas");
        setSize(450, 180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel painelCheckboxes = new JPanel();
        painelCheckboxes.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        cbMaiusculas = new JCheckBox("Maiúsculas");
        cbMinusculas = new JCheckBox("Minúsculas");

        grupoCheckboxes = new ButtonGroup();
        grupoCheckboxes.add(cbMaiusculas);
        grupoCheckboxes.add(cbMinusculas);

        painelCheckboxes.add(cbMaiusculas);
        painelCheckboxes.add(cbMinusculas);

        cbMaiusculas.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    converterTextoParaMaiusculas();
                }
            }
        });

        cbMinusculas.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    converterTextoParaMinusculas();
                }
            }
        });

        campoTexto = new JTextField(30);

        campoTexto.getDocument().addDocumentListener(new DocumentListener() {
            public void insertUpdate(DocumentEvent e) {
                aplicarConversao();
            }

            public void removeUpdate(DocumentEvent e) {
                aplicarConversao();
            }

            public void changedUpdate(DocumentEvent e) {
            }
        });

        add(painelCheckboxes, BorderLayout.NORTH);
        JPanel painelCampoTexto = new JPanel(new FlowLayout(FlowLayout.CENTER));
        painelCampoTexto.add(campoTexto);
        add(painelCampoTexto, BorderLayout.CENTER);

        setVisible(true);
    }

    private void aplicarConversao() {
        if (updatingText) {
            return;
        }

        if (cbMaiusculas.isSelected()) {
            converterTextoParaMaiusculas();
        } else if (cbMinusculas.isSelected()) {
            converterTextoParaMinusculas();
        }
    }

    private void converterTextoParaMaiusculas() {
        updatingText = true;
        String textoAtual = campoTexto.getText();
        String textoConvertido = textoAtual.toUpperCase();
        if (!textoAtual.equals(textoConvertido)) {
            campoTexto.setText(textoConvertido);
        }
        updatingText = false;
    }

    private void converterTextoParaMinusculas() {
        updatingText = true;
        String textoAtual = campoTexto.getText();
        String textoConvertido = textoAtual.toLowerCase();
        if (!textoAtual.equals(textoConvertido)) {
            campoTexto.setText(textoConvertido);
        }
        updatingText = false;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ConversorCaseGUI();
            }
        });
    }
}