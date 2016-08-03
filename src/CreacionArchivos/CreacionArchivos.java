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
import javax.swing.JOptionPane;

/**
 *
 * @author pablo temporal
 */
public class CreacionArchivos {

    private void leerArchivo(String archivo) throws FileNotFoundException, IOException {
        String cadena;
        FileReader f = new FileReader(archivo);
        BufferedReader b = new BufferedReader(f);
        String info = "";
        while ((cadena = b.readLine()) != null) {
            info = cadena;
            System.out.println(cadena);
        }
        b.close();
        info = info.replaceAll("\\\\", "/");
        String[] informacion = info.split("/");
        String empresa = informacion[(informacion.length - 1)];
        String[] numEmpresa = empresa.split("\\.");
        int logitud = numEmpresa[0].length();
        String numeroEmpresa = "";
        numeroEmpresa += numEmpresa[0].charAt(logitud - 2);
        numeroEmpresa += numEmpresa[0].charAt(logitud - 1);
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
