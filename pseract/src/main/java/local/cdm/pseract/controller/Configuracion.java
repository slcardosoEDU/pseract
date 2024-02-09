package local.cdm.pseract.controller;

import java.io.IOException;
import java.util.Properties;

/**
 * Esta clase contine todas las constantes de la aplicacion.
 * Esta constantes se cargan de un fichero de propiedades configuracion.properties.
 * @author Samuel
 */
public class Configuracion {
    private final  String PROPS_FILE = "configuracion.properties";
    private static Configuracion conf;
//    private  String URL_RNE;
    
    private Configuracion() throws IOException{
        //Cargamos el fichero de configuracion del entorno correspondiente.
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        Properties pros = new Properties();
        pros.load(loader.getResourceAsStream(PROPS_FILE));
        //Obtenemos la variables de configuracion del fichero.
        
//        URL_RNE = pros.getProperty("URL_RNE");
    }
    
    public static Configuracion get() throws IOException{
        if(conf==null){
            conf = new Configuracion();
        }
        return conf;
    }
    
    //Metodos para obtener las variables de configuracion.
    
//    public String URL_RNE(){
//        return URL_RNE;
//    }

}
