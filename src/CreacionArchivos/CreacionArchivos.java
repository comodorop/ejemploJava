/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreacionArchivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author pablo temporal
 */
public class CreacionArchivos {

    private ArrayList<String> leerArchivo(String archivo) throws FileNotFoundException, IOException {
        ArrayList<String> lst = new ArrayList<>();
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        String info = "";
        while ((info = b.readLine()) != null) {
            lst.add(info);
        }
        b.close();
        return lst;
    }

    public void generarConfiguracion() {
        File file = new File("C:\\baseDeDatosCursoJava");
        if (!file.exists()) {
            System.out.println("No existe el directorio");
            file.mkdir();
        }
    }

    public void crearArchivo(String mensaje) {
        String config = "C:\\baseDeDatosCursoJava\\config.txt";
        File f = new File(config);
        BufferedWriter bw = null;
        if (!f.exists()) {
            try {
                bw = new BufferedWriter(new FileWriter(f));
                bw.write(mensaje);
                bw.close();
                JOptionPane.showMessageDialog(null, "Configuracion hecha correctamente");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
