import javax.swing.JOptionPane;
public class HelloWorld {
    public static void main(String[] args) {
        String boasvindas = "Hello, World!";
        String learn = "Vou aprender a linguagem java do basico ao avançado.";
        String nomep = "Guilherme Dolphin.";
        int age = 32;
               
        System.out.println(boasvindas);
        System.out.println("My name is " + nomep);
        System.out.println("I'm " + age + " years old.");
        System.out.println(learn);
        
        JOptionPane.showMessageDialog(null, boasvindas);
        JOptionPane.showMessageDialog(null, "My name is " + nomep);
        JOptionPane.showMessageDialog(null, "I'm " + age + " years old.");
        JOptionPane.showMessageDialog(null, learn);
    }
}
