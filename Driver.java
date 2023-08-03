import javax.swing.*;

/**
 * This class is the driver class of the Vending Machine Factory
 *  @author Rowell Herrera and Daniella Ughoc S11A
 */
public class Driver {
    /**
     * This method is the main method
     * @param args the array of strings passed to the main function
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame("Vending Machine Factory");
        frame.setContentPane(new MainMenu(frame).mainMenu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
