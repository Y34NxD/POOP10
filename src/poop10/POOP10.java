package poop10;

import excepcionesPropias.Max3RetirosException;
import excepcionesPropias.RangoDeDepositoSuperadoException;
import excepcionesPropias.SaldoInsuficienteException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Equipo B
 */
public class POOP10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        /*
        try{
            String mensajes[] ={"Mensaje 1","Mensaje 2","Mensaje 3"};
            for (int i = 0; i <= mensajes.length; i++) {
                System.out.println(mensajes[i]);
            }    
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Apuntador fuera de los limites:)");
            e.printStackTrace();
        }
        */
        /*
        System.out.println("#####################################");
        try{
            float x = 10/2;
            System.out.println("X= "+ x);
        } catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0 :c");
            //e.printStackTrace();
        }finally{
            System.out.println("Cualquier cosa que suceda entra al finally");
        }
        */
        /*
        System.out.println("############# Catch Anidado ##################");
        try{
            float x = 10/0;
            System.out.println("X= "+ x);
        } catch(ArithmeticException e){
            System.out.println("No se puede dividir entre 0 :c");   
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Apuntador fuera de los limites:)");
        }
        */
        /*
        System.out.println("############# Propagación de escepciones ##################");
        try{
            float division = metodoDivision(4,0);
            System.out.println("División = "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepción que ocurre dentro del metodoDivision");   
        }
        */
        /*
        System.out.println("############# Excepciones marcadas ################");
        try{
            float div = metodoDivisionMarcada(3,0);
        }catch(ArithmeticException e){
            System.out.println("Excepción que ocurre dentro del método (metodoDivisionMarcada)");   
        }
        */
        
        System.out.println("############# Creación de excepciones ################");
        
            
        try {
            CuentaBancaria cuenta = new CuentaBancaria();
            cuenta.depositar(18_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.depositar(18_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(10_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
            cuenta.retirar(2_000);
            System.out.println("Saldo de cuenta: $"+cuenta.getSaldo());
        } catch (SaldoInsuficienteException ex) {
            System.out.println(ex.getMessage());
            //Logger.getLogger(POOP10.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Max3RetirosException max){
            System.out.println(max.getMessage());
        } catch (RangoDeDepositoSuperadoException depo){
            System.out.println(depo.getMessage());
        }
        
        
        // Saldo insuficiente
        // No se puede ingresar más de 20_000
        // No se puede hacer más de 3 retiros
        
    }

    /*
    private static float metodoDivision(int a, int b) {
        return a/b;
    }

    private static float metodoDivisionMarcada(int a, int b) throws ArithmeticException{
        return a/b;
    }
    */
}
