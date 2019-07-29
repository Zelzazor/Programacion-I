package key.pruebarec;
import java.io.*;

import javax.swing.*;


public class EscrituraArchivo {
    private JFileChooser buscar;
    private OutputStreamWriter archivo;
    private BufferedWriter bufer;
    
    public boolean buscarArchivo(){
        buscar = new JFileChooser();
        int status = buscar.showSaveDialog(null);
        if(status ==  JFileChooser.APPROVE_OPTION){
            
            InterfazTexto.ruta_guardada = buscar.getSelectedFile().getAbsolutePath();
            return true;
        }
        else if (status == JFileChooser.CANCEL_OPTION){
            return false;
        }
        return true;
    }
    
    public boolean guardarArchivo(JTextArea textarea, JFrame frame){
        try{
            
            String linea;
            String ruta = InterfazTexto.ruta_guardada;
            if (!ruta.equals("")){
                archivo = new OutputStreamWriter(new FileOutputStream(ruta), "UTF8");
                bufer = new BufferedWriter(archivo);
                linea = textarea.getText();
                //System.out.println(linea);
                bufer.write(linea);
                frame.setTitle("Editor Zelzazor - "+ruta);
            }
        }
        catch(IOException ioe){
            JOptionPane.showMessageDialog(null, "ERROR: El archivo no pudo ser encontrado en la ruta especificada");
        }
        finally{
            try {
                bufer.close();
                archivo.close();
                
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "ERROR: cerrada inválida");
            }
            catch (Exception ex){
                
            }
        }
        return true;
    }
}
