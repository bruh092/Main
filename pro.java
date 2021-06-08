import javax.swing.JOptionPane;
public class pro {
    
    public static void main(String[] args) {

        String pass= JOptionPane.showInputDialog("Enter your pass");
        JOptionPane.showMessageDialog(null,"Successfully log in " +pass );

        int name = Integer.parseInt(JOptionPane.showInputDialog("enter your username"));
        JOptionPane.showMessageDialog(null, "your username is "+name+" right");

    }
    
}
