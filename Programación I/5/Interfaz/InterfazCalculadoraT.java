import javax.swing.*;

class InterfazCalculadoraT {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run(){

                new InterfazCalculadora();

            }

        });
    
    }
}