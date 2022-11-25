package excepcionesPropias;
/**
 *
 * @author Equipo B
 */
public class Max3RetirosException extends Exception{
    
    public Max3RetirosException(){
        super("No puedes retirar más de 3 veces :(");
    }
    
}
