package poop10;

import excepcionesPropias.Max3RetirosException;
import excepcionesPropias.RangoDeDepositoSuperadoException;
import excepcionesPropias.SaldoInsuficienteException;
/**
 *
 * @author Equipo B
 */
public class CuentaBancaria {
    private double saldo;
    private int contador;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double saldo, int contador) {
        this.saldo = saldo;
        this.contador = contador;
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException, Max3RetirosException{
        System.out.println("Retirando... $"+monto);
        if(getContador() < 3){
            if (saldo < monto)
                throw new SaldoInsuficienteException();  
            else{
                setContador(1);
                this.saldo -= monto;
            }   
        }
        else
            throw new Max3RetirosException();    
    }
    
    public void depositar(double monto) throws RangoDeDepositoSuperadoException{
        if (monto > 20_000){
            throw new RangoDeDepositoSuperadoException();
        }
        else{
            System.out.println("Depositando... $"+monto);
            this.saldo += monto;
        }
    }
    
    public double getSaldo() {
        return saldo;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador += contador;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "saldo=" + saldo +'}';
    }

}
