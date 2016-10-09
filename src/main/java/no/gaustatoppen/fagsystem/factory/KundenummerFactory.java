package no.gaustatoppen.fagsystem.factory;

public class KundenummerFactory {

    private static KundenummerFactory kundenummerFactory = new KundenummerFactory();

    private Integer forrigeKundenummer = new Integer(1000);

    private KundenummerFactory(){}

    public static KundenummerFactory getInstance(){
        return kundenummerFactory;
    }

    public Integer nyttKundenr(){
        return ++forrigeKundenummer;
    }
}
