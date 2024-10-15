package com.tuempresa.procesos;

import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SumaProceso {

    public static void main(String[] args) {
      

        int numBase = Integer.parseInt(args[0]);
        int numVeces = Integer.parseInt(args[1]);
        int timeSleep = Integer.parseInt(args[2]);
        String outputFile = args[3];

        try (FileWriter writer = new FileWriter(outputFile, true)) {
            for (int i = 0; i < numVeces; i++) {
                int resultado = (numBase + i) + (numBase + i + 1);
                String timestamp = new SimpleDateFormat("HH:mm:ss").format(new Date());

                writer.write("Resultado: " + resultado + " - Hora: " + timestamp + "\n");
                System.out.println("Resultado: " + resultado + " - Hora: " + timestamp);

                Thread.sleep(timeSleep);
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
