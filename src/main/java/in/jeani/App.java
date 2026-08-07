package in.jeani;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import in.jeani.jmeter.jenv.ui.EnvSelectionPanel;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        // 1. Create the main window frame
        JFrame frame = new JFrame("JEnv - Environment Selector");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        frame.setLocationRelativeTo(null); // Centers the window

        JPanel panel = new EnvSelectionPanel();

        // 5. Add the panel to the frame and display it
        frame.add(panel);
        frame.setVisible(true);
    }
}
