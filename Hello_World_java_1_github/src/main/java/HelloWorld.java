import javax.swing.JOptionPane;
public class HelloWorld {
    public static void main(String[] args) {
        String boasvindas = "Hello, World!";
        String learn = "Vou aprender a linguagem java do basico ao avançado.";
        String nomep = "Guilherme Dolphin.";
        int age = 32;
               
        System.out.println(boasvindas);
        System.out.println("Meu nome é " + nomep + ".");
        System.out.println("Tenho " + age + " anos.");
        System.out.println(learn);
        
        JOptionPane.showMessageDialog(null, boasvindas);
        JOptionPane.showMessageDialog(null, "Meu nome é " + nomep);
        JOptionPane.showMessageDialog(null, "Tenho " + age + " anos.");
        JOptionPane.showMessageDialog(null, learn);
    }
}
