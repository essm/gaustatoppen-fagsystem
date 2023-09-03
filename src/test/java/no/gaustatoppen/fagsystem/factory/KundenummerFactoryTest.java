package no.gaustatoppen.fagsystem.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KundenummerFactoryTest {

    private final KundenummerFactory factory = KundenummerFactory.getInstance();

    @Test
    public void verifyKundenummerFactory() {
        Assertions.assertEquals(1001, factory.nyttKundenr().intValue());
        Assertions.assertEquals(1002, factory.nyttKundenr().intValue());
        Assertions.assertEquals(1003, factory.nyttKundenr().intValue());
    }
}
