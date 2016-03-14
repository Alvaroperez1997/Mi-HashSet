import java.util.ArrayList;
import java.util.Random;
/**
 * Write a description of class MHashSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MiHashSet
{
    // instance variables - replace the example below with your own
    private int[] arrayHashSet;

    /**
     * Constructor for objects of class MHashSet
     */
    public MiHashSet()
    {
        arrayHashSet = new int[0];
    }

    /**
     * Añade un elemento al HashSet
     */
    public boolean add(int valor)
    {
        boolean elemento = true;
        for(int i= 0; i<arrayHashSet.length; i++){
            if (arrayHashSet[i] == valor) {
                elemento = false;
            }
        }
        if(elemento) {
            int[] array2 = arrayHashSet;
            arrayHashSet = new int[array2.length + 1];
            for (int count = 0; count < array2.length; count++)
            {
                arrayHashSet[count] = array2[count];
            }
            arrayHashSet[array2.length] = valor;
        }
        return elemento;
    }
    
    /**
     * Limpia el conjunto
     */
    public void clear(){
        arrayHashSet = new int[0];
    }
    
    /**
     * devuelve verdadero si el conjunto contiene el elemento, 
     * falso en caso contrario
     */
    public boolean contains(int elemento){
        boolean encontrado = false;
        for (int count = 0; count < arrayHashSet.length && !encontrado; count++){
            if (elemento == arrayHashSet[count]){
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    /**
     * Devuelve true si el conunto esta vacio
     * sino devuelve false
     */
    public boolean isEmpty()
    {
        return(arrayHashSet.length == 0);
    }
    
    /**
     * devuelve el número de elementos del conjunto.
     */
    public int size(){
        return arrayHashSet.length;
    }
    
    /**
     * elimina del conjunto el elemento dado. Si no existiera devuelve falso; 
     * si existía en el conjunto devuelve verdadero
     */
    public boolean remove(int elemento)
    {
        int eliminado = -1;
        boolean encontrado = false;
        if (elemento < arrayHashSet.length && elemento >= 0){
            int[] array2 = arrayHashSet;
            arrayHashSet = new int[arrayHashSet.length -1];
            for (int i = 0; i < elemento; i++) {
                arrayHashSet[i] = array2[i];
            }
            for (int i = elemento; i < arrayHashSet.length; i++) {
                arrayHashSet[i] = array2[i + 1];
            }
            eliminado = array2[elemento];
            encontrado = true;
        }
        return encontrado;
    }
}
