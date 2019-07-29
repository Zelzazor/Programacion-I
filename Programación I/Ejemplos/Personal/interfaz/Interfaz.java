import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Interfaz {

    public Interfaz() {

        JFrame frame = new JFrame("Ajedrez");
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new GridLayout(8, 8));
        CrearBotones(frame);
        frame.setVisible(true);
    }

    private void CrearBotones(Container f) {

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {

                JButton btn = new JButton();
                f.add(btn);

                if ((j % 2 == 1 && i % 2 == 1) || (j % 2 == 0 && i % 2 == 0)) {

                    btn.setBackground(Color.WHITE);

                } else {

                    btn.setBackground(Color.BLACK);

                }

                if (i == 7 && j == 7) {

                    evento_Click(btn);
            
                }

            }

        }
    }

    //Easter egg
    private void evento_Click(AbstractButton btn) {

        btn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

            Pulsar();

            }

        });

    }

    private void Pulsar() {

        JOptionPane.showMessageDialog(null, "Creado por Felipe Ramírez, 2019");

    }

}