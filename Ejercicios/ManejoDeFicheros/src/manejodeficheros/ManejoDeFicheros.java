package manejodeficheros;

import java.util.*;

public class ManejoDeFicheros {
   
    public static void main(String[] args) {
        Persona p = new Persona();
        Stack<Persona> pila = iniciarPila();
        Queue <Persona> cola = iniciarCola();
        addElementoPila(pila, p = new Persona("Juan", 25));
        addElementoCola(cola, p = new Persona("Carlos", 45));
        mostrarPila(pila);
        mostrarCola(cola);
        System.out.println(buscarNombrePila(pila, "Juan"));
        System.out.println(buscarNombreCola(cola, "Juan"));
        System.out.println(esVacia(pila));
        System.out.println(esVacia(cola));
        vaciarCola(cola);
        vaciarPila(pila);
        mostrarPila(pila);
        mostrarCola(cola);
        System.out.println(esVacia(pila));
        System.out.println(esVacia(cola));
        
    }
    public static void mostrarPila(Stack<Persona> pila){
        for(Persona p : pila){
            if(pila.isEmpty()){
                System.out.println("La pila esta vacia");
            }else{
                System.out.println(p.toString());
            }
        }
    }
    public static void mostrarCola(Queue<Persona> cola){
        for(Persona p : cola){
            if(!cola.isEmpty()){
                System.out.println(p.toString());
            }else{
                System.out.println("La cola esta vacia");
            }
        }
    }
    
    public static Stack <Persona> iniciarPila(){
        Stack <Persona> pila = new Stack<Persona>();
        return pila;
    }
    public static Queue <Persona> iniciarCola(){
        Queue <Persona> cola = new LinkedList <Persona>();
        return cola;
    }
    public static void vaciarPila(Stack <Persona> pila){
        pila.clear();
    }
    public static void vaciarCola(Queue <Persona> cola){
        cola.clear();
    }
    public static boolean esVacia(Stack <Persona> pila){
        if(pila.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static boolean esVacia(Queue <Persona> cola){
        if(cola.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    public static void addElementoPila(Stack<Persona> pila, Persona p){
        pila.push(p);
    }
    public static void addElementoCola(Queue<Persona> cola, Persona p){
        cola.add(p);
    }
    public static void quitarElementoPila(Stack<Persona> pila){
        pila.pop();
    }
    public static void quitarElementoCola(Queue<Persona> cola){
        cola.poll();
    }
    public static String buscarNombrePila(Stack<Persona> pila, String nombre){
      for(Persona p : pila){
          if(nombre.equalsIgnoreCase(p.getNombre())){
              return "Existe persona con ese nombre";
          }
      }
       return "No coincide el nombre";
    }
    public static String buscarNombreCola(Queue<Persona> cola, String nombre){
      for(Persona p : cola){
          if(nombre.equalsIgnoreCase(p.getNombre())){
              return "Existe persona con ese nombre";
          }
      }
       return "No coincide el nombre";
    }
    
}
