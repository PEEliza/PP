
package examen_1ra_evaluacion_test_covid;

public class TestCovid {
 private int edad;
 private boolean Ecronica;
 private double peso; // El peso es en kilogramos
 private double estatura; // La estatura es en metros

 
 public TestCovid(){
     edad = 70;
     Ecronica = true; //No tiene una enfermedad crónica
     peso = 56.8;
     estatura = 1.75;
   }
 
 public TestCovid(int edadTest, boolean EcronicaTest,double pesoTest,double estaturaTest){
     edad = edadTest;
     Ecronica= EcronicaTest;
     peso = pesoTest;
     estatura = estaturaTest;    
    }
  
 private void calcularIMC(){
     double IMC;
     IMC = peso / (estatura*estatura);
 }
 
 public void calcularPersonaRiesgo(){
    
    if ((edad >= 65) ||  (Ecronica = true) ||  (IMC > 30))
        System.out.println("PERSONA DE RIESGO");
    else  
        System.out.println("PERSONA SIN RIESGO");
 }
 
 public int getEdad(){
     return edad;
 }
 public boolean getEcronica(){
     return Ecronica;
 }
 public double getPeso(){
     return peso; 
 }
 public double getEstatura(){
     return estatura;
 }
 public void setEdad(int valor){
     edad = valor;
 }
 public void setEcronica(boolean valor){
     Ecronica = valor;
 }
 public void setPeso(double valor){
     peso = valor;
 }
 public void setEstatura(double valor){
     estatura = valor;
 }
 public void imprimirDatos(){
     System.out.println("DATOS TEST");
     System.out.println("EDAD: " + edad);
     System.out.println("PADECE DE ENFERMEDAD CRONICA: " + Ecronica);
     System.out.println("PESO: " + peso);
     System.out.println("ESTATURA: " + estatura);
 }
 
}
