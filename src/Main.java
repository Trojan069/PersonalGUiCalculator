import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Calc");
        reader.setSize(200,200);
        reader.setVisible(true);
        reader.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        reader.setResizable(false);
        reader.setLocationRelativeTo(null);


    }
}
