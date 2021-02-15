import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SwingDemo extends JFrame {
 private JPanel mainPanel;
 private JButton exitButton;
 public SwingDemo(String title) {
 super(title);
 mainPanel = (JPanel) this.getContentPane();
 exitButton = new JButton("Bye Bye!");
 exitButton.addActionListener(new ActionListener() {
 @Override

            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                }
                });
                mainPanel.add(exitButton, BorderLayout.SOUTH);
                }
                public static void main(String... args) {
                SwingDemo swingDemo = new SwingDemo("Swing Demo Window");
                swingDemo.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                swingDemo.setSize(new Dimension(500, 500));
                swingDemo.setVisible(true);
                }
               }