package model;

public class Nodo<T> {
    private T dato;
    private Nodo<T> siguiente;
    
    public Nodo(T dato, boolean circular){
        this.dato = dato;
        if(circular) {
            this.siguiente = this;
        } else {
            this.siguiente = null;
        }
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
