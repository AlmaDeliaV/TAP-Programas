/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Publicaciones;

import java.util.ArrayList;
import java.util.Iterator;
import JerarquiaHerencia.*;
import Vista.*;


public class ManPublic {

    static ArrayList<ClassPublicaciones> ArrPublic = new ArrayList<ClassPublicaciones>();
    private ClassPublicaciones objPublic;
    private ClassLibro objLibro;
    private ClassRevista objRevista;
    private ClassPeriodico objPeriodico;
    

    public ManPublic() {
        
        
    }
    

    public ManPublic(String tit, double precio, int np,String autor) {
        objPublic = new ClassPublicaciones();
        objPublic.setTitulo(tit);
        objPublic.setPrecio(precio);
        objPublic.setnPaginas(np);
        objPublic.setAutor(autor);
    }

    public void alta(String ISBN, String Autor, String ediccion) {
        objLibro = new ClassLibro();

        //guardar todos  los atributos de la clase libro
        objLibro.setTitulo(objPublic.getTitulo());//los hereda de la clase padre
        objLibro.setPrecio(objPublic.getPrecio());
        objLibro.setnPaginas(objPublic.getnPaginas());
        objLibro.setAutor(Autor);
        objLibro.setISBN(ISBN);
        objLibro.setEdiccion(ediccion);
        ArrPublic.add(objLibro);//agregarlo a el arrayList
        
        

    }
    
    public void alta(String ISNN, int numero, int year,String Period) {
        objRevista = new ClassRevista();

        //guardar todos  los atributos de la clase Revista
        objRevista.setTitulo(objPublic.getTitulo());//los hereda de la clase padre
        objRevista.setPrecio(objPublic.getPrecio());
        objRevista.setnPaginas(objPublic.getnPaginas());
        objRevista.setAutor(objPublic.getAutor());
        objRevista.setISNN(ISNN);
        objRevista.setNumero(numero);
        objRevista.setYear(year);
        objRevista.setPeriodicidad(Period);
        ArrPublic.add(objRevista);//agregarlo a el arrayList
        

    }
    public void alta(String Fecha, String Periodicidad) {
        objPeriodico = new ClassPeriodico();

        //guardar todos  los atributos de la clase Revista
        objPeriodico.setTitulo(objPublic.getTitulo());//los hereda de la clase padre
        objPeriodico.setPrecio(objPublic.getPrecio());
        objPeriodico.setAutor(objPublic.getAutor());
        objPeriodico.setnPaginas(objPublic.getnPaginas());
        objPeriodico.setPeriodicidad(Periodicidad);
        objPeriodico.setFecha(Fecha);
        ArrPublic.add(objPeriodico);//agregarlo a el arrayList
        

    }
    public void tablas(){
        String a,b,c,d,e,f;
        tablaLibros tli = new tablaLibros();
        tablaRevistas tr = new tablaRevistas();
        tablaPeriodicos tp= new tablaPeriodicos();
        
        Iterator<ClassPublicaciones> itrTable = ArrPublic.iterator();
        while(itrTable.hasNext()){
            ClassPublicaciones p= itrTable.next();
            if(p instanceof ClassLibro){
                
               ClassLibro book = new ClassLibro();
                book=(ClassLibro) p;//castearlo 
                a=p.getTitulo();
                b=p.getAutor();
                c=((ClassLibro) p).getISBN();
                d=String.valueOf(p.getnPaginas());
                e=String.valueOf(p.getPrecio());
                f=((ClassLibro) p).getEdiccion();
                String tl[]={a,b,c,d,e,f};
                tli.llenarT(tl);
                
            }
            if (p instanceof ClassRevista){
                ClassRevista revis = new ClassRevista();
                revis=(ClassRevista) p;//castearlo 
                a=p.getTitulo();
                b=p.getAutor();
                c=((ClassRevista) p).getISNN();
                d=String.valueOf(p.getnPaginas());
                e=String.valueOf(p.getPrecio());
                f= String.valueOf(((ClassRevista) p).getNumero());
                String g= String.valueOf(((ClassRevista) p).getYear());
                String h = String.valueOf(((ClassRevista) p).getPeriodicidad());
                String tR[]={a,b,c,d,e,f,g,h};
                tr.llenarT(tR);
            }
            if(p instanceof ClassPeriodico){
                ClassPeriodico newsp = new ClassPeriodico();
                newsp =(ClassPeriodico) p;
                a= p.getTitulo();
                b=p.getAutor();
                c=((ClassPeriodico) p).getFecha();
                d=String.valueOf(p.getnPaginas());
                e=String.valueOf(p.getPrecio());
                f=((ClassPeriodico) p).getPeriodicidad();
                String tP[]= {a,b,c,d,e,f};
                tp.llenarT(tP);
            }
        }
    }
  
   
}
