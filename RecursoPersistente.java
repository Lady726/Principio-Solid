import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class RecursoPersistente {
    public void load();
    public void save();
}
//implementacion
public class ConfiguracionSistema implements RecursoPersistente{
    public void load(){
        System.out.println("Configuracion sistema cargado.");
    }
    public void save(){
        System.out.println("Configuracion sistema almacenada.");
    }
}
public class ConfiguracionUsuario implements RecursoPersistente {
    public void load(){
        System.out.println("Configuracion de usuario cargada.");
    }
    public void save(){
        System.out.println("Configuracion de usuario almacenada.");
    }
}
public class ConfiguracionHoraria implements RecursoPersistente{
    public void load(){
        System.out.println("Configuracion horaria cargada.");
    }
    public void save(){
        System.out.println("ERROR!!!, La hora no se puede almacenar, es solo de lectura.");
    }
}
public class Configuracion{
    Vector<RecursoPersistente>conf=new Vector<RecursoPersistente>();
    public  void cargarConfiguracion(){
        conf.add(new ConfiguracionSistema());
        conf.add(new ConfiguracionUsuario());
        conf.add(new ConfiguracionHoraria());

        for (Iterator<RecursoPersistente> i = conf.iterator(); i.hasNext();)
        i.next().load();
    }
    public void salvarConfiguracion(){
        for(Iterator<RecursoPersistente> i =conf.iterator(); i.hasNext();)
        i.next().save();
    }
}