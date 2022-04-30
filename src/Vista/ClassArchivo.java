package Vista;


import JerarquiaHerencia.*;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

public class ClassArchivo extends ObjectOutputStream implements Serializable {

    FileOutputStream fos = null;

    public ClassArchivo() throws IOException {
        super();
        
    }
    
    public void agregar (ClassPublicaciones a){
        try{
            fos = new FileOutputStream("datos.txt");
            ObjectOutputStream salida= new ObjectOutputStream(fos);
            salida.writeObject(a);
            salida.close();
            
            
        }catch(IOException e){
            
        }
    }
    

   

}
