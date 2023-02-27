package com.example.ejemplosql.configuracion;

public class Transacciones
{
    public static final String NameDataBase = "TLENG";

    public static final String tablaperson = "personas";

    public static String id = "id";
    public static String nombres = "nombres";
    public static String apellidos = "apellidos";
    public static String edad = "edad";
    public static String correo = "correo";

    public static String CreateTBPersonas = "CREATE personas (id INTEGER PRIMARY KEY AUTOINCREMENT)" +
            "nombres TEXT , apellidos TEXT, edad INTEGER, correo TEXT)";

    public static String DropTBPersonas = "DROP TABLE IF EXISTS personas";
}
