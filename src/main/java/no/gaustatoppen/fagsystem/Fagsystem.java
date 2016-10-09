package no.gaustatoppen.fagsystem;

import no.gaustatoppen.fagsystem.factory.AvtalenummerFactory;
import no.gaustatoppen.fagsystem.factory.KundenummerFactory;
import no.gaustatoppen.fagsystem.status.AvtaleStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class Fagsystem {

    private final Logger logger = LoggerFactory.getLogger(Fagsystem.class);

    private final AvtalenummerFactory avtalenummerFactory = AvtalenummerFactory.getInstance();
    private final KundenummerFactory kundenummerFactory = KundenummerFactory.getInstance();

    @WebMethod
    public String opprettKunde(String navn, String adresse) {
        String kundeNummer = String.valueOf(kundenummerFactory.nyttKundenr());
        logger.info("Oppretter kunde for " + navn + ", " + adresse + " --- tildeles kundenummer " + kundeNummer);
        return kundeNummer;
    }

    @WebMethod
    public String opprettAvtale(String kundeNummer, String avtaleType) {
        String avtaleNummer = String.valueOf(avtalenummerFactory.nyttAvtalenr());
        logger.info("Oppretter " + avtaleType + "-avtale for kundenr " + kundeNummer + ", --- tildeles avtalenummer " + avtaleNummer);
        return avtaleNummer;
    }

    @WebMethod
    public String oppdaterAvtaleStatus(String avtaleNummer, AvtaleStatus avtaleStatus) {
        logger.info("Oppdaterer status for avtale " + avtaleNummer + " til '" + avtaleStatus.name() + "'");
        return avtaleStatus.name();
    }

    public static void main(String[] argv) {
        Object implementor = new Fagsystem();
        String address = "http://localhost:9000/Fagsystem";
        Endpoint.publish(address, implementor);
    }
}
