import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
String name=JOptionPane.showInputDialog(null, "What is you name?");
JOptionPane.showMessageDialog(null , "Hello, "+name);
JOptionPane.showMessageDialog(null , "From your name we have derived your social security number. I will now bill the 1,000,000 dollars to your account, "+name);
}
}
