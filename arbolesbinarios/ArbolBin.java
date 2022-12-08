
package arbolesbinarios;
import javax.swing.JOptionPane;

public class ArbolBin 
{
   
    private nodo raiz;

    public ArbolBin()
    {
    raiz=null;
    }
   
    //auxiliar
    int info ;
    nodo q, aux; 
    String texto="";
    int cont=0;
    boolean sw;
    
 public boolean Estavacio()
 {
     if (raiz==null)
        {
            JOptionPane.showMessageDialog(null,"ÁRBOL VACIO!!!!");  
            return true;
        }
        else
        {
            return false;
        }   
 }//fin esta vacio
  
 public void CrearRaiz(int info) 
    {   
       setRaiz(new nodo(null,info,null)); 
       q=getRaiz();
    }
    //fin crearRaiz
  public void IngresarHijos(nodo q) 
 {        
      info=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero correspondiente"));
      aux=new nodo(null,info,null); 
    
 }//fin de ingresar hijo
 
public void InsertarNodos(nodo q)
{
    int resp;
   resp=JOptionPane.showConfirmDialog(null,"Ingresar hijo izquierdo (Anterior) de "+q.getDato(),"Ingreso de datos",JOptionPane.YES_NO_OPTION);
   
   if (resp==JOptionPane.YES_OPTION)
   {
            IngresarHijos(q); 
            q.setAnt(aux); 
   }//fin si
   
   resp=JOptionPane.showConfirmDialog(null,"Ingresar hijo derecho (Siguiente) de "+q.getDato(),"Ingreso de datos",JOptionPane.YES_NO_OPTION);
   
   if (resp==JOptionPane.YES_OPTION)
   {
            IngresarHijos(q); 
            q.setSig(aux); 
   }//fin si
}//Fin InsertarNodos

//metodo recursivo para crear el arbol
    public void Crear(nodo q)
    {        
      //caso base o caso degenerado 
          if(q!=null) 
          {//este metodo esta en preorden
            InsertarNodos(q); 
            //llamada recursiva por la izquierda
            Crear(q.getAnt()) ;
            //llamada recursiva por la derecha
            Crear(q.getSig()) ;
          }// fin si
    }//fin crear
    
    public void Inicializar()
    {
        texto=""; 
        cont=0;
        sw=false;
    }
    
    public String ExtraerPares(nodo q)
    {     
        if(q!=null) 
          {
            
            ExtraerPares(q.getAnt()) ;
            if ((q.getDato())% 2==0)
            {
            texto=texto+"( "+q.getDato()+" )"; 
            }
            ExtraerPares(q.getSig()) ;
          }// fin si
          return texto;
    }//fin crear
    
    public String ExtraerImpares(nodo q)
    {        
        if(q!=null) 
          {
     
            ExtraerImpares(q.getAnt()) ;
            if ((q.getDato())% 2!=0)
            {
            texto=texto+"( "+q.getDato()+" )"; 
            }
            ExtraerImpares(q.getSig()) ;
          }
          return texto;
    }     

 public boolean Buscar(nodo q, int numero)
  {
    if(q!=null)
    {
      if (numero==q.getDato())
      {
        sw=true;
      }else
          
    Buscar(q.getAnt(), numero);
    Buscar(q.getSig(), numero);
    }
    return sw;
  }//fin buscar
 

    public nodo getRaiz() {
        return raiz;
    }

    public void setRaiz(nodo raiz) {
        this.raiz = raiz;
    }
    
    
}//fin clase