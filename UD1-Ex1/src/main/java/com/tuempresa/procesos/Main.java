package com.tuempresa.procesos;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            // Primer proceso con F(10, 20, 1500)
            ProcessBuilder pb1 = new ProcessBuilder("java", "-cp", "target/classes", "com.tuempresa.procesos.SumaProceso", "10", "20", "1500", "result1.txt");
            pb1.inheritIO().start();

            // Segundo proceso con F(10, 20, 300)
            ProcessBuilder pb2 = new ProcessBuilder("java", "-cp", "target/classes", "com.tuempresa.procesos.SumaProceso", "10", "20", "300", "result2.txt");
            pb2.inheritIO().start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
