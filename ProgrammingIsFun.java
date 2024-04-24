import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ProgrammingIsFun {

    private static final String[] COLORS = {"Red", "Yellow", "Black", "Orange", "Green"};

    public static void main(String[] args) {
        JFrame frame = new JFrame("Programming is Fun");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 150);
        frame.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Programming is Fun");
        label.setFont(new Font("Arial", Font.BOLD, 24));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);

        ButtonGroup buttonGroup = new ButtonGroup();
        for (String color : COLORS) {
            JRadioButton radioButton = new JRadioButton(color);
            radioButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getActionCommand().equals(color)) {
                        switch (color) {
                            case "Red":
                                label.setForeground(Color.RED);
                                break;
                            case "Yellow":
                                label.setForeground(Color.YELLOW);
                                break;
                            case "Black":
                                label.setForeground(Color.BLACK);
                                break;
                            case "Orange":
                                label.setForeground(Color.ORANGE);
                                break;
                            case "Green":
                                label.setForeground(Color.GREEN);
                                break;
                        }
                    }
                }
            });
            buttonGroup.add(radioButton);
            panel.add(radioButton);
        }

        JButton leftButton = new JButton("<=");
        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for moving the text to the left
                int x = label.getLocation().x;
                if (x > 0) {
                    label.setLocation(x - 10, label.getLocation().y);
                }
            }
        });
        panel.add(leftButton);

        JButton rightButton = new JButton(">=");
        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code for moving the text to the right
                int x = label.getLocation().x;
                int width = label.getWidth();
                int panelWidth = panel.getWidth();
                if (x + width < panelWidth) {
                    label.setLocation(x + 10, label.getLocation().y);
                }
            }
        });
        panel.add(rightButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}
