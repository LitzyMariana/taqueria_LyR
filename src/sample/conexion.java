package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {

    //volvemos constantes las bariables con final
    private static final String host = "localhost";
    private static final String  user = "topicos20";
    private static final String pwd = "Conectar123";
    private static final String db = "taqueria";

    public static Connection con;

    public static void crearConexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //se abre el socket hacia el SGBD
            con = DriverManager.getConnection("jdbc:mysql://"+host+":3306/"+db+"?useSSL=false",user,pwd);
        } catch (Exception e ) {
            e.printStackTrace();
        }
    }
}
