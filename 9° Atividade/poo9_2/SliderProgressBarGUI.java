package poo9_2;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderProgressBarGUI extends JFrame {

    private JSlider slider;
    private JProgressBar progressBar;
    private JLabel valorLabel;

    public SliderProgressBarGUI() {
        setTitle("Slider e Barra de Progresso");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        slider = new JSlider(SwingConstants.HORIZONTAL, 0, 100, 0);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        slider.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                int valorAtual = slider.getValue();
                progressBar.setValue(valorAtual);
                valorLabel.setText("Valor: " + valorAtual);
            }
        });

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);
        progressBar.setValue(0);

        valorLabel = new JLabel("Valor: 0", SwingConstants.CENTER);
        valorLabel.setFont(new Font("Arial", Font.BOLD, 18));

        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(new BoxLayout(painelCentral, BoxLayout.Y_AXIS));
        painelCentral.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        painelCentral.add(slider);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 20)));
        painelCentral.add(progressBar);
        painelCentral.add(Box.createRigidArea(new Dimension(0, 20)));
        painelCentral.add(valorLabel);

        add(painelCentral, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SliderProgressBarGUI();
            }
        });
    }
}