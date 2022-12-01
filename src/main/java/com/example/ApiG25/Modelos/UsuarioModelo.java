package com.example.ApiG25.Modelos;

import org.springframework.data.annotation.Id;

public class UsuarioModelo {

    @Id
    private Long documento;
    private String nombre;
    private String apellido;
    private String correo;
    private String telefono;
    private String genero;
    
    public Long getDocumento() {
        return documento;
    }
    public void setDocumento(Long documento) {
        this.documento = documento;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    


    
}
