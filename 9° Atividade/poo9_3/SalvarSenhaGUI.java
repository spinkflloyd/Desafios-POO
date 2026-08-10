package poo9_3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class SalvarSenhaGUI extends JFrame {

    private JPasswordField campoSenha;
    private JButton botaoSalvar;
    private JLabel labelCaminhoArquivo;
    private File arquivoSelecionado;

    public SalvarSenhaGUI() {
        setTitle("Salvar Senha no Arquivo");
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JPanel painelSenha = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        painelSenha.add(new JLabel("Senha:"));
        campoSenha = new JPasswordField(20);
        painelSenha.add(campoSenha);
        add(painelSenha, BorderLayout.NORTH);

        JPanel painelArquivo = new JPanel();
        painelArquivo.setLayout(new BoxLayout(painelArquivo, BoxLayout.Y_AXIS));
        painelArquivo.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        labelCaminhoArquivo = new JLabel("Nenhum arquivo selecionado.");
        labelCaminhoArquivo.setFont(new Font("Arial", Font.ITALIC, 12));
        labelCaminhoArquivo.setAlignmentX(Component.CENTER_ALIGNMENT);

        JButton botaoSelecionarArquivo = new JButton("Selecionar Arquivo");
        botaoSelecionarArquivo.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoSelecionarArquivo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                selecionarArquivo();
            }
        });

        botaoSalvar = new JButton("Salvar Senha no Arquivo");
        botaoSalvar.setAlignmentX(Component.CENTER_ALIGNMENT);
        botaoSalvar.setEnabled(false);
        botaoSalvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                salvarSenhaNoArquivo();
            }
        });

        painelArquivo.add(labelCaminhoArquivo);
        painelArquivo.add(Box.createRigidArea(new Dimension(0, 10)));
        painelArquivo.add(botaoSelecionarArquivo);
        painelArquivo.add(Box.createRigidArea(new Dimension(0, 20)));
        painelArquivo.add(botaoSalvar);

        add(painelArquivo, BorderLayout.CENTER);

        setVisible(true);
    }

    private void selecionarArquivo() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Salvar Senha Como...");

        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            arquivoSelecionado = fileChooser.getSelectedFile();
            if (!arquivoSelecionado.getName().toLowerCase().endsWith(".txt")) {
                arquivoSelecionado = new File(arquivoSelecionado.getAbsolutePath() + ".txt");
            }
            labelCaminhoArquivo.setText("Arquivo selecionado: " + arquivoSelecionado.getAbsolutePath());
            botaoSalvar.setEnabled(true);
        } else {
            arquivoSelecionado = null;
            labelCaminhoArquivo.setText("Nenhum arquivo selecionado.");
            botaoSalvar.setEnabled(false);
        }
    }

    private void salvarSenhaNoArquivo() {
        if (arquivoSelecionado == null) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione um arquivo primeiro.",
                    "Erro ao Salvar",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        char[] senha = campoSenha.getPassword();

        if (senha.length == 0) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, digite uma senha.",
                    "Aviso",
                    JOptionPane.WARNING_MESSAGE);
            Arrays.fill(senha, ' ');
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(arquivoSelecionado))) {
            writer.print(senha);
            JOptionPane.showMessageDialog(this,
                    "Senha salva com sucesso em:\n" + arquivoSelecionado.getAbsolutePath(),
                    "Confirmação",
                    JOptionPane.INFORMATION_MESSAGE);
            campoSenha.setText("");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this,
                    "Erro ao salvar a senha no arquivo:\n" + ex.getMessage(),
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        } finally {
            Arrays.fill(senha, ' ');
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SalvarSenhaGUI();
            }
        });
    }
}