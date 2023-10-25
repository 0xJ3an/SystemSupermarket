/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package system;
import com.formdev.flatlaf.themes.FlatMacDarkLaf;

/**
 *
 * @author j3anp
 */
public class System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       FlatMacDarkLaf.setup();
        Login window = new Login();
    }
    
}
