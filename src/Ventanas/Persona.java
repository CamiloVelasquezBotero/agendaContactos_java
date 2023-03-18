
package Ventanas;

public class Persona {
    private String nombres, email, telefono;

    public Persona(String nombres, String email, String telefono) {     //Constructor
        this.nombres = nombres;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombres() {        //Getters
        return nombres;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefono() {
        return telefono;
    }
    
    
}
