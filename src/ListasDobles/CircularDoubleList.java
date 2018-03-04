package ListasDobles;

public class ListaDoble {
    
    private NodoDoble cabeza;
    private NodoDoble cola;
    
    
    
    public NodoDoble getCabeza() {
        
        return this.cabeza;
        
    }
    
    public void recorrerNodos(){
        
        NodoDoble aux = this.cabeza;
        
        while(aux != null){
            
            System.out.print("(" + aux.getDato() + ")");
            
            aux = aux.getProximoNodo();
        
        }
        
    }
    
    public int contarNodos(){
        
        int cuenta = 0;
        
        NodoDoble aux = this.cabeza;
        
        for(; aux != null; cuenta++){
            
            aux = aux.getProximoNodo();
        
        }
        
        return cuenta;
    }
    
    public void insertarPrimero(NodoDoble nuevoNodo){
        if(cabeza != null){
            nuevoNodo.setProximoNodo(cabeza);
            cabeza.setNodoAnterior(nuevoNodo);
        }
        else{
            cola = nuevoNodo;
        }
        cabeza = nuevoNodo;
    }
    
    public void insertarUltimo(NodoDoble nuevoNodo){
        
        if(cola != null){
            nuevoNodo.setNodoAnterior(cola);
            cola.setProximoNodo(nuevoNodo);
        }
        else{
            cabeza = nuevoNodo;
        }
        cola = nuevoNodo;
        
    }
    
    
    public void eliminarPrimero(){
        
        if(this.cabeza != null){
            
            if(this.cabeza == this.cola) {
                
                this.cabeza = this.cola = null;
                
            }else {
            
                this.cabeza = this.cabeza.getProximoNodo();
                
                cabeza.setNodoAnterior(null);
            }
            
        }
         
    }
    
    public void eliminarUltimo(){
        
        if(this.cabeza != null){
          
            if(this.cabeza == this.cola) {
                
                this.cabeza = this.cola = null;
                
            }else {
                
                this.cola = this.cola.getNodoAnterior();
                
                this.cola.setProximoNodo(null);
                
            }
            
        }
        
    }
    
    public void estaVacia(){
        if(cabeza == null){
            System.out.println("La lista esta vacia");
        }
    }
    
}
}
