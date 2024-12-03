package GestorDeContactos;

import java.io.Serializable;

public class Contacto implements Serializable {

    private String nombreContacto;
    private int numeroContacto;
    private String correoContacto;
    private String direccionContacto;

    public Contacto(String nombreContacto,int numeroContacto, String correoContacto, String direccionContacto){
        this.nombreContacto = nombreContacto;
        this.numeroContacto = numeroContacto;
        this.correoContacto = correoContacto;
        this.direccionContacto = direccionContacto;
    }

    public String getNombreContacto() {
        return nombreContacto;
    }

    public int getNumeroContacto(){
        return numeroContacto;
    }

    public String getCorreoContacto(){
        return correoContacto;
    }

    public String getDireccionContacto(){
        return direccionContacto;
    }

    public void setNombreContacto(String nombreContacto){
        this.nombreContacto = nombreContacto;
    }

    public void setNumeroContacto(int numeroContacto){
        this.numeroContacto = numeroContacto;
    }

    public void setCorreoContacto(String correoContacto){
        this.correoContacto = correoContacto;
    }

    public void setDireccionContacto(String direccionContacto){
        this.direccionContacto = direccionContacto;
    }

    @Override
    public String toString(){
        return "Nombre: " + nombreContacto + "\nTelefono: " + numeroContacto + "\nCorreo : " + correoContacto + "\nDireccion: " + direccionContacto;
    }

    


}
