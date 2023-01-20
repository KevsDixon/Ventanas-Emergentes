package a_ventanasemergentes;
import javax.swing.JOptionPane;
/**
 *
 * @author Kevin 
 */
public class A_VentanasEmergentes {

    public static void main(String[] args) {
     
        String nombre ="";
        int variable_1;
        int variable_2;
        int suma;
       
        
        variable_1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrasa el primer numero"));
        variable_2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrasa el segundo numero"));
         
        suma = variable_1 + variable_2;
        
        // Muestra el contenido capturado que tecleo el usuario
        JOptionPane.showMessageDialog(null,"La suma es : "+ suma);
         
    }
    
}
