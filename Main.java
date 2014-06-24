/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package commissioncalculator;

/**
 *
 * @author Frostysmooth aka Justin Mirabal
 */
public class Main {

     /**
     * @param args the command line arguments
     */
    private CommissionForm frame;

     public Main()
     {
        frame = new CommissionForm();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setTitle("Justin Mirabal PRG420 Commission Calculator");
     }

    public static void main(String[] args) {
        // TODO code application logic here
        Main app = new Main();
    }
}
