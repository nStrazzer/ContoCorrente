
import java.lang.Math;
import java.util.Scanner;

/**
 * Aggiungi qui una descrizione della classe Wallet
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Wallet
{
    private double saldo;
    private String proprietario;
    private String pin;

    /**
     * Costruttore degli oggetti di classe  Wallet
     */
    public Wallet(double saldo, String proprietario, String pin)
    {
        this.saldo = saldo;
        this.proprietario = proprietario;
        this.pin = pin;
    }
    
    public Wallet(String proprietario, String pin)
    {
        saldo = 0;
        this.proprietario = proprietario;
        this.pin = pin;
    }

    /**
     * Aggiorna il saldo in negativo
     * 
     * @param  x   quantità di soldi da prelevare
     * 
     */
    public void prelevare(double x)
    {
        
        x = Math.round(x*100)/100.00;
        
        if( !(x > saldo) ){
            saldo -= x;
        }
    }
    
    /**
     * Aggiorna il saldo in positivo
     * 
     * @param  x   quantità di soldi da depositare
     */
    public void depositare(double x)
    {
        
        x = Math.round(x*100)/100.00;
        
        if(x > 0){
            saldo += x;
        }
    }
    
    /**
     * Restituisce il saldo attuale
     * 
     * @return     il saldo attuale
     */
    public double getSaldo()
    {
        return saldo;
    }
    
    /**
     * Controlla se il Pin inserito è corretto
     * 
     * @return      vero se sono uguali e falso se non lo sono
     */
    public boolean checkPin(String pin)
    {
        
        if(this.pin == pin)
            return true;
        
        return false;
        
    }
    
    /**
     * 
     */
    public void setNome(String nome)
    {
        
        proprietario = nome;
        
    }
    
    public String getNome()
    {
        return proprietario;
    }
    
    public void setPin(String pin)
    {
        this.pin = pin;
    }
   
}
