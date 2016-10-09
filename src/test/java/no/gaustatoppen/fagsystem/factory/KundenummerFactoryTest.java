package no.gaustatoppen.fagsystem.factory;

import org.junit.Assert;
import org.junit.Test;

public class KundenummerFactoryTest {

    private final KundenummerFactory factory = KundenummerFactory.getInstance();

    @Test
    public void verifyKundenummerFactory() {
        Assert.assertEquals(1001, factory.nyttKundenr().intValue());
        Assert.assertEquals(1002, factory.nyttKundenr().intValue());
        Assert.assertEquals(1003, factory.nyttKundenr().intValue());
    }
}
