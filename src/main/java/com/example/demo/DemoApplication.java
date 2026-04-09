package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList; // <--- ERROR 1: Import no usado (para Checkstyle)

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    // <--- ERROR 2: Nombre de método que incumple Google Checks (para Checkstyle)
    public void Mi_Metodo_Con_Errores_De_Nombre() {
        System.out.println("Esto es para el reporte");
    }

} // <--- Asegúrate de que esta llave final existe