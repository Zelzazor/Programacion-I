import javax.swing.*;
import java.awt.*;

class InterfazCalculadora{

    JButton[] buttons = new JButton[24];
    JPanel panel = new JPanel(new GridLayout(6,4,12,12));
    Font fuente = new Font("Consolas", 1, 48);
    JFrame frame = new JFrame("Calculadora");

    public InterfazCalculadora(){
        
        crearFrame();
        crearCajaDeTexto();
        crearBotones(buttons);
        InsertarBotones(buttons, panel);
        insertarPanel(panel);
        
    }

    private void insertarPanel(Container C) {
        frame.getContentPane().add(C, BorderLayout.CENTER);
    }

    private void crearFrame() {
        frame.setVisible(true);
        frame.setSize(300, 400);
        frame.setMinimumSize(new Dimension(300, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void InsertarBotones(AbstractButton[] botones, Container C){
        for (int i = 0; i < botones.length; i++){

            C.add(botones[i]);

        }
    }

    private void crearBotones(AbstractButton[] botones) {

        for (int i = 0; i < botones.length; i++) {

            botones[i] = new JButton();

        }

        

        elementoBotones(buttons);

    }

    private void elementoBotones(AbstractButton[] botones){

        botones[21].setText("0");
        botones[16].setText("1");
        botones[17].setText("2");
        botones[18].setText("3");
        botones[14].setText("4");
        botones[13].setText("5");
        botones[12].setText("6");
        botones[8].setText("7");
        botones[9].setText("8");
        botones[10].setText("9");
        botones[7].setText("÷");
        botones[11].setText("*");
        botones[15].setText("-");
        botones[19].setText("+");
        botones[23].setText("=");
        botones[22].setText(".");
        botones[20].setText("±");
        botones[6].setText("←");
        botones[5].setText("C");
        botones[4].setText("CE");
        botones[3].setText("1/x");
        botones[2].setText("x²");
        botones[1].setText("√");
        botones[0].setText("%");
        botones[21].setBackground(Color.BLACK);
        botones[16].setBackground(Color.BLACK);
        botones[17].setBackground(Color.BLACK);
        botones[18].setBackground(Color.BLACK);
        botones[14].setBackground(Color.BLACK);
        botones[13].setBackground(Color.BLACK);
        botones[12].setBackground(Color.BLACK);
        botones[8].setBackground(Color.BLACK);
        botones[9].setBackground(Color.BLACK);
        botones[10].setBackground(Color.BLACK);
        botones[21].setForeground(Color.WHITE);
        botones[16].setForeground(Color.WHITE);
        botones[17].setForeground(Color.WHITE);
        botones[18].setForeground(Color.WHITE);
        botones[14].setForeground(Color.WHITE);
        botones[13].setForeground(Color.WHITE);
        botones[12].setForeground(Color.WHITE);
        botones[8].setForeground(Color.WHITE);
        botones[9].setForeground(Color.WHITE);
        botones[10].setForeground(Color.WHITE);
        botones[7].setBackground(Color.ORANGE);
        botones[11].setBackground(Color.ORANGE);
        botones[15].setBackground(Color.ORANGE);
        botones[19].setBackground(Color.ORANGE);
        botones[23].setBackground(Color.ORANGE);
        botones[22].setBackground(Color.ORANGE);
        botones[20].setBackground(Color.ORANGE);
        botones[6].setBackground(Color.WHITE);
        botones[5].setBackground(Color.WHITE);
        botones[4].setBackground(Color.WHITE);
        botones[3].setBackground(Color.WHITE);
        botones[2].setBackground(Color.WHITE);
        botones[1].setBackground(Color.WHITE);
        botones[0].setBackground(Color.WHITE);
    }
    

    private void crearCajaDeTexto(){

        JTextField cajaDeTexto = new JTextField(30);
        cajaDeTexto.setFont(fuente);
        cajaDeTexto.setHorizontalAlignment(SwingConstants.RIGHT); 
        cajaDeTexto.setPreferredSize(new Dimension(200, 50));
        cajaDeTexto.setText("0");
        cajaDeTexto.setEditable(false);
        frame.add(cajaDeTexto, BorderLayout.NORTH);

    }
}