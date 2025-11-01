package u1;

import javax.swing.*;
import java.awt.*;

public class MainApp extends JFrame {

    public MainApp() {
        setTitle("Minha Aplicação Swing");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        add(comboBox);

        JCheckBox checkBox = new JCheckBox("Select Option");
        checkBox.setSelected(false);
        add(checkBox);

        JTextField textField = new JTextField(20);
        add(textField);

        JButton save = new JButton("Salvar");
        JButton close = new JButton("Sair");

        add(save);
        add(close);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainApp frame = new MainApp();
            frame.setVisible(true);
        });
    }
}