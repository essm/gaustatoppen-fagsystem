package no.gaustatoppen.fagsystem.factory;

public class AvtalenummerFactory {

    private static AvtalenummerFactory avtalenummerFactory = new AvtalenummerFactory();

    private Integer forrigeAvtalenummer = new Integer(1000000);

    private AvtalenummerFactory(){}

    public static AvtalenummerFactory getInstance(){
        return avtalenummerFactory;
    }

    public Integer nyttAvtalenr(){
        return ++forrigeAvtalenummer;
    }
}
