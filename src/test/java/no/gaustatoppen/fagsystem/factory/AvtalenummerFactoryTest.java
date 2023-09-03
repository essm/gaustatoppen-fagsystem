package no.gaustatoppen.fagsystem.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AvtalenummerFactoryTest {

    private final AvtalenummerFactory factory = AvtalenummerFactory.getInstance();

    @Test
    public void verifyAvtalenummerFactory() {
        Assertions.assertEquals(1000001, factory.nyttAvtalenr().intValue());
        Assertions.assertEquals(1000002, factory.nyttAvtalenr().intValue());
        Assertions.assertEquals(1000003, factory.nyttAvtalenr().intValue());
    }
}
