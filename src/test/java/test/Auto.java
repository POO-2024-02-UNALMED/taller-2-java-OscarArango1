package test;

public class Auto {
 String modelo;
 int precio;
 Asiento[] asientos;
 String marca;
 Motor motor;
 int registro;
 static int cantidadCreados = 0; 

 public Auto() {
     cantidadCreados++; 
 }

 public int cantidadAsientos() {
     int contador = 0;
     if (asientos != null) {
         for (Asiento asiento : asientos) {
             if (asiento != null) {
                 contador++;
             }
         }
     }
     return contador;
 }

 public String verificarIntegridad() {
     if (motor == null || motor.registro != registro) {
         return "Las piezas no son originales";
     }
     if (asientos != null) {
         for (Asiento asiento : asientos) {
             if (asiento != null && asiento.registro != registro) {
                 return "Las piezas no son originales";
             }
         }
     }
     return "Auto original";
 }
}
