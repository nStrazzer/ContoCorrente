
import java.util.Scanner;

/**
 * Aggiungi qui una descrizione della classe Main
 * 
 * @author (il tuo nome) 
 * @version (un numero di versione o una data)
 */
public class Main
{
    public static void main(String[] args)
    {
        final boolean DEBUG= true;
        Scanner s = new Scanner(System.in);
        int scelta=0;
        double x=0;
        int prima = 0;
        String pin;
        Wallet w = new Wallet(0,"","");
        if(prima==0)
        {
            System.out.println("Inserisci il nome identificativo del Wallet");
            pin=s.nextLine();
            w.setNome(pin);
            if(w.checkPin(""))
                System.out.println("Inserisci il pin del Wallet");
            pin=s.nextLine();
            w.setPin(pin);
            prima = -1;
        }
        while(true){
            System.out.println("Azioni disponibili:");
            System.out.println("1 preleva");
            System.out.println("2 deposita");
            System.out.println("3 visualizza saldo");
            scelta=s.nextInt();
            
            switch(scelta){
                case 1:
                    System.out.println("Quanto? (x,xx)");
                    x=s.nextDouble();
                    System.out.println("Inserisci il PIN:");
                    do{
                        pin=s.nextLine();
                    }while(pin.length()<2);
                    if(DEBUG) System.out.println(pin);
                    if(w.checkPin(pin))
                    {
                        w.prelevare(x);
                    }
                    else System.out.println("Errore");
                    break;
                case 2:
                    System.out.println("Quanto? (x,xx)");
                    x=s.nextDouble();
                    System.out.println("Inserisci il PIN:");
                    do{
                        pin=s.nextLine();
                    }while(pin.length()<2);
                    if(DEBUG) System.out.println(pin);
                    if(w.checkPin(pin))
                    {
                        w.depositare(x);
                    }
                    else System.out.println("Errore");
                    break;
                case 3:
                    System.out.println("Inserisci il PIN:");
                    do{
                        pin=s.nextLine();
                    }while(pin.length()<2);
                    if(DEBUG) System.out.println(pin);
                    if(w.checkPin(pin))
                    {
                        System.out.println("Saldo: " + w.getSaldo());
                    }
                    else System.out.println("Errore");
                    break;
                default:
                    System.out.println("Errore");
            }
            if(scelta==0) break;
        }
        
        System.out.println("Fine");
    }
}
