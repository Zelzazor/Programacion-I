import javax.swing.*;

class InterfazT {

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            public void run(){

                new Interfaz();

            }

        });
    
    }
}