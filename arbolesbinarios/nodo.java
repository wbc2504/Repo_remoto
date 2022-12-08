
package arbolesbinarios;


public class nodo {
    
    private int dato;
    private nodo sig, ant;
    
     public nodo(nodo li, int d, nodo ld) {
        dato = d;
        sig = ld;
        ant = li;
    }//fin método nodo

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public nodo getSig() {
        return sig;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }

    public nodo getAnt() {
        return ant;
    }

    public void setAnt(nodo ant) {
        this.ant = ant;
    }
     
}

