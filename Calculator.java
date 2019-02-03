import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {

    public Calculator() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 260, 205);
        Container container = getContentPane();
        JTextField text = new JTextField();
        JPanel greed = new JPanel();
        JButton[] jbt = new JButton[16];
        greed.setLayout(new GridLayout(4, 4, 5, 12));
            greed.add(jbt[0] = new JButton("7"));
            greed.add(jbt[1] = new JButton("8"));
            greed.add(jbt[2] = new JButton("9"));
            greed.add(jbt[3] = new JButton("/"));
            greed.add(jbt[4] = new JButton("4"));
            greed.add(jbt[5] = new JButton("5"));
            greed.add(jbt[6] = new JButton("6"));
            greed.add(jbt[7] = new JButton("*"));
            greed.add(jbt[8] = new JButton("1"));
            greed.add(jbt[9] = new JButton("2"));
            greed.add(jbt[10] = new JButton("3"));
            greed.add(jbt[11] = new JButton("-"));
            greed.add(jbt[12] = new JButton("0"));
            greed.add(jbt[13] = new JButton("."));
            greed.add(jbt[14] = new JButton("="));
            greed.add(jbt[15] = new JButton("+"));

        jbt[0].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("7");
             }
         });
        jbt[1].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("8");
             }
         });
        jbt[2].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("9");
             }
         });
        jbt[3].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("/");
             }
         });
        jbt[4].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("4");
             }
         });
        jbt[5].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("5");

             }
         });
        jbt[6].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("6");
             }
         });
        jbt[7].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("*");
             }
         });
        jbt[8].addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 text.setText("1");
             }
         });
        jbt[9].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("2");
            }
        });
        jbt[10].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("3");
            }
        });
        jbt[11].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("-");
            }
        });
        jbt[12].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("0");
            }
        });
        jbt[13].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText(".");
            }
        });
        jbt[14].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("=");
            }
        });
        jbt[15].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("+");
            }
        });

        container.add(text, BorderLayout.NORTH);
        container.add(greed, BorderLayout.SOUTH);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
