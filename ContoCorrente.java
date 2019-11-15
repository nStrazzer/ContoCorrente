import java.lang.Math;
import java.util.Scanner;
import java.lang.String;

/**
 * La classe ContoCorrente rappresenta un conto corrente
 * 
 * @author Borzone Luca
 * @author Strazzer Norman
 * @version 2.0
 */
public class ContoCorrente
{
    private static int nConto=0;
    private double saldo;
    private String pin;
    private String proprietario;
    private String id;
    
    /**
     * Costruttore degli oggetti di classe  ContoCorrente
     */
    public ContoCorrente(double saldo, String proprietario, String pin)
    {
        this.saldo = saldo;
        this.proprietario = proprietario;
        this.pin = pin;
        id = "" + nConto;
        nConto++;
    }
    
    public ContoCorrente(String proprietario, String pin)
    {
        this(0.0, proprietario, pin);
    }
    
    public ContoCorrente()
    {
        this(0.0,"","");
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
     * Aggiorna il saldo e controlla se deve aggiungere che l'input sia maggiore di 0 e se deve sottrarre controlla se i soldi sono presenti sul conto
     * 
     * @param un valore double arrotondato ai centesimi
     * @param scelta indica se aggiungere o sottrarre, se vero aggiunge sennò sottrae 
     * 
     * @return ritorna vero se l'operazione è andata  a buon fine sennò ritorna falso
     */
    public boolean setSaldo(double x, boolean choise)
    {
        
        x = Math.round(x*100)/100.00; //serve per troncare il valore al centesimo, ed evitare problemi con l'approssimazione
        
        if(choise)
        {
        
            if(x<0) return false;
        
            saldo += x;
        
        }
        else
        {
            
            if(x<0) x = -x;
            
            if(saldo >= x)
                saldo -= x;
            
            else return false;
        
        }
        
        return true;
    }
    
    /**
     * Controlla se il pin inserito è corretto
     * 
     * @param stringa di 5 caratteri
     * @return vero se uguale altrimenti falso
     */
    public boolean checkPin( String pin)
    {
        
        if(pin.length()==5)
            
            if(pin==this.pin)
               
                return true;
       
        return false;
    }
    
    /**
     * Imposta un pin verificato
     * 
     * @param stringa di 5 caratteri
     * @return vero se l'operazione è andata a buon fine, altrimente falso
     */
    public boolean setPin(String pin)
    {
        if(pin.length()!=5)
            return false;
        
        this.pin = pin;
        
        if(checkPin(pin))
            return true;
        
        return false;
    }
    
    /**
     * Restituisce l'id del conto
     * 
     * @return l'id del conto
     */
    public String getId()
    {
        return id;
    }
    
    /**
     * Imposta il proprietario e verifica se l'operazione è andata a buon fine
     * 
     * @return vero se l'operazione è andata a buon fine, altrimenti ritorna falso
     */
    public boolean setProprietario( String proprietario)
    {
        proprietario.toUpperCase();
        this.proprietario = proprietario;
        if(checkProprietario(proprietario))
            return true;
        return false;
    }
    
    /**
     * Controlla se il proprietario è quello inserito
     * 
     * @param stringa proprietario
     * 
     * @return vero se il proprietatio è quello inserito, altrimenti ritorna falso
     */
    public boolean checkProprietario( String proprietario)
    {
        proprietario.toUpperCase();
        if(this.proprietario == proprietario)
            return true;
        return false;
    }
    
    /**
     * Restituisce il proprietario
     * 
     * @return la stringa proprietario
     */
    public String getProprietario()
    {
        return proprietario;
    }
}
