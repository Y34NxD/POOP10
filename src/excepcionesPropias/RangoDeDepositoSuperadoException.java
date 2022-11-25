package excepcionesPropias;
/**
 *
 * @author Equipo B
 */
public class RangoDeDepositoSuperadoException extends Exception{
    
    public RangoDeDepositoSuperadoException() {
        super("No puedes depositar más de $20 000 :(");
    }
}
