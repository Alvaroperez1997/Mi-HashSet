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
     * 
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
}
