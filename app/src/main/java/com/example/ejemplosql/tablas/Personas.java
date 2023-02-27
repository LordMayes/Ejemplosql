package com.example.ejemplosql.tablas;

public class Personas
{
    private Integer id;
    private String Nombres;
    private String Apellidos;
    private Integer Edad;
    private String Correo;

    public Personas(Integer id, String nombres, String apellidos, Integer edad, String correo) {
        this.id = id;
        Nombres = nombres;
        Apellidos = apellidos;
        Edad = edad;
        Correo = correo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public Personas(){

    }
}
