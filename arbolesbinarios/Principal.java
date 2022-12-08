
package arbolesbinarios;

import javax.swing.JOptionPane;


public class Principal {
    
    public static void main (String[] args){
      
        int opcion=0;
        int numero;
        Principal objp = new Principal();
        ArbolBin arbol = new ArbolBin ();
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, objp.MenuArboles()));
            switch(opcion)
            {
                case 1: arbol.CrearRaiz(1);
                        arbol.Crear(arbol.getRaiz());
                break;
                
                case 2: numero=Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el numero a buscar"));
                        boolean variable = arbol.Buscar(arbol.getRaiz(), numero);
                        arbol.Inicializar();
                        if (variable==true)
                        {
                            JOptionPane.showMessageDialog(null,"El numero esta en el Arbol");
                        }else
                        {
                            JOptionPane.showMessageDialog(null,"El numero no esta en el Arbol");
                        }
                break;
                
                case 3:if(arbol.Estavacio()==false)
                        { 
                            arbol.Inicializar();
                            JOptionPane.showMessageDialog(null,"Los numeros pares del arbol son:  "+arbol.ExtraerPares(arbol.getRaiz()));
                        }break;
                case 4:if(arbol.Estavacio()==false)
                        { 
                            arbol.Inicializar();
                            JOptionPane.showMessageDialog(null,"Los numeros impares del arbol son:  "+arbol.ExtraerImpares(arbol.getRaiz()));
                        }break;
               
            }
        }while(opcion<6);
    }
    
    public String MenuArboles() {
        return "MENÚ Árboles\n\n"
                + "1. Crear arbol\n"
                + "2. Buscar\n"
                + "3. Obtener numeros pares\n"
                + "4. Obtener numeros impares\n"
                + "5. Sumatoria de todos los nodos\n"
                + "6. Terminar";
     }//fin de menu arboles
}
