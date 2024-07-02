package app.demo;

import javax.swing.*;

public class Airline {
    private JPanel MainPane;
    private JButton button1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Airline");
        frame.setContentPane(new Airline().MainPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
