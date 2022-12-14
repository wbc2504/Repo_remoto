package arbolesbinarios;
import java.io.*;
public class Archivo
{
    File Arch;//archivo logico
    FileReader ArchLectura;//objeto para modo lectura del archivo
    BufferedReader BufferAlm;//objeto que reserva un espacio en memoria donde se guarda la informaci�n
    FileWriter ArchEscritura;//objeto para modo escritura del archivo
    PrintWriter objImpresion;//objeto para grabar directamente en el archivo tipo texto
   
   public String AbrirArchivoModoLectura(String ruta)
    {
        String mensaje="¡Se abrio de modo lectura!";
        try{
            Arch= new File(ruta);
            ArchLectura= new FileReader(Arch);
            BufferAlm = new BufferedReader(ArchLectura); 
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de abrir modo lectura
    
    public String CerrarArchivoModoLectura()
    {
        String mensaje="¡Se cerro de modo lectura!";
        try{
           
           BufferAlm.close();
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de cerrar modo lectura
        
    public String AbrirArchivoModoEscritura(String ruta)
    {
        String mensaje="¡Se abrio de modo escritura!";
        try{
            Arch= new File(ruta);
            ArchEscritura= new FileWriter(Arch,true);
            objImpresion = new PrintWriter(ArchEscritura);
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de abrir modo escritura
    
    public String CerrarArchivoModoEscritura()
    {
        String mensaje="Se cerro de modo escritura";
        try{
            
            objImpresion.close();
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de cerrar modo escritura

    public String[] LeerRegistro(int nroatri)//leer una linea del archivo plano de texto
    {
        String Reg="",mensaje;
        String vec[];
        vec=new String[nroatri];//numero de atributos privados de la clase, menos uno por el indexado cero
        try{
            Reg=BufferAlm.readLine();
            vec=Reg.split(",");//metodo mas apropiado para dividir una cadena es  String.split(TOKEN o separador)
            
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return vec;
    }//fin de leer reg
    
    public String GrabarRegistro(String Reg) //escribir o sea grabar una linea en el archivo plano de texto
    {
        String mensaje="Grabar un registro";
        try{            
            objImpresion.print(Reg);
            objImpresion.println(); 
        }
        catch(Exception objException){
            mensaje=objException.getMessage();          
        }
        return mensaje;
    }//fin de grabar el registro separado
    
 }//fin clase archivo
 
