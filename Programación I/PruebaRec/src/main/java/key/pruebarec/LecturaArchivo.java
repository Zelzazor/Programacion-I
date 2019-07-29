package key.pruebarec;
import java.io.*;
import javax.swing.*;

public class LecturaArchivo {
    private JFileChooser buscar;
    private InputStreamReader archivo;
    private BufferedReader bufer;
    
    
    public void buscarArchivo(){
        
        buscar = new JFileChooser();
        int status = buscar.showOpenDialog(null);
        if (status ==  JFileChooser.APPROVE_OPTION){
            InterfazTexto.ruta_guardada = buscar.getSelectedFile().getAbsolutePath();
        }
        
    }
    public void abrirArchivo(JTextArea textarea, JFrame frame){
        try{
            StringBuilder linea = new StringBuilder();
            int caracter;
            String ruta = InterfazTexto.ruta_guardada;
            if(!"".equals(ruta)){
            archivo = new InputStreamReader(new FileInputStream(ruta), "UTF8");
            bufer = new BufferedReader(archivo);
            
            
            if(!"".equals(textarea.getText())){
                textarea.setText("");
            }
            
            while ((caracter = bufer.read()) != -1){
                linea.append((char) caracter);
            }
             textarea.setText(linea.toString());
             InterfazTexto.ruta_guardada = ruta;
             frame.setTitle("Editor Zelzazor - " + ruta);
            }
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "ERROR: El archivo no pudo ser encontrado en la ruta especificada");
        }
            try{
                bufer.close();
                archivo.close();
                //JOptionPane.showMessageDialog(null, "Archivo abierto satisfactoriamente");
            }
            catch(Exception ioe){
                //JOptionPane.showMessageDialog(null, "ERROR: "+ioe.toString());
            }
    }
    
    public String getInfoArchivo(){
        String x = "";
        try{
        StringBuilder linea = new StringBuilder();
        int caracter;
        String ruta = InterfazTexto.ruta_guardada;
        archivo = new InputStreamReader(new FileInputStream(ruta), "UTF8");
        bufer = new BufferedReader(archivo);
         while ((caracter = bufer.read()) != -1){
                linea.append((char) caracter);
            }
        x = linea.toString();
        }
        catch(IOException ioe){
            //JOptionPane.showMessageDialog(null, "ERROR: El archivo no pudo ser encontrado en la ruta especificada");
        }

            try {
                bufer.close();
                archivo.close();
            } catch (Exception ex) {
                //JOptionPane.showMessageDialog(null, "ERROR: cerrada inválida");
            }
        
        return x;
    }
}
