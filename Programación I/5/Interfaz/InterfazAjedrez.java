import javax.swing.*;
import java.awt.*;

class InterfazAjedrez {

    JFrame frame = new JFrame("Ajedrez");

    public InterfazAjedrez() {

        crearFrame();
        crearBotones(frame);

    }

    private void crearBotones(Container f) {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                JButton btn = new JButton();
                f.add(btn);

                if ((j % 2 != 0 && i % 2 != 0) || (j % 2 == 0 && i % 2 == 0)) {

                    btn.setBackground(Color.WHITE);

                } else {

                    btn.setBackground(Color.BLACK);

                }

            }

        }
    }

    private void crearFrame(){

        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(8,8));
        frame.setVisible(true);
        
    }

}