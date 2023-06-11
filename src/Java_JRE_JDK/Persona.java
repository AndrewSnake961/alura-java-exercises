package Java_JRE_JDK;
public class Persona {
  String nombre;
  String apellido;
  int edad;

  void datosDefault() {
    this.nombre = "Andres";
    this.apellido = "Builes";
    this.edad = 28;
  }

  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.datosDefault();
    System.out.println(persona.nombre);
  }
}      
    
    
    
