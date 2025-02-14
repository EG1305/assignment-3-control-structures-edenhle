import javax.swing.JOptionPane;

public class SpeedDetector2 {
    public static void main(String[] args) {
        
        String input;
        input = JOptionPane.showInputDialog("Please enter your speed");
        int speed = Integer.parseInt(input);
        JOptionPane.showMessageDialog(null, "Your speed is " + speed);

        if (speed > 60) {
            JOptionPane.showMessageDialog(null, "You are speeding", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        else   {
            JOptionPane.showMessageDialog(null, "You are not speeding");

        } 
        System.exit(0);
    }
}
