package sample.Login;

import javafx.collections.ObservableList;
import sample.conexion;

import java.sql.Connection;

public class RolDAO {

    int id_rol;
    String tipo_rol;

    public RolDAO(int id_rol, String tipo_rol){
        this.id_rol = id_rol;
        this.tipo_rol = tipo_rol;
    }

    public int getId_rol() {return id_rol; }
    public void setId_rol(int id_rol) { this.id_rol = id_rol; }
    public String getTipo_rol() { return tipo_rol; }
    public void setTipo_rol(String tipo_rol) { this.tipo_rol = tipo_rol; }

    private Connection con;
    public RolDAO(){con = conexion.con;}

    public void selectRol(){
        //ObservableList
    }
}
