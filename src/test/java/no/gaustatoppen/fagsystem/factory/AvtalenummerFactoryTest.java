package no.gaustatoppen.fagsystem.factory;

import org.junit.Assert;
import org.junit.Test;

public class AvtalenummerFactoryTest {

    private final AvtalenummerFactory factory = AvtalenummerFactory.getInstance();

    @Test
    public void verifyAvtalenummerFactory() {
        Assert.assertEquals(1000001, factory.nyttAvtalenr().intValue());
        Assert.assertEquals(1000002, factory.nyttAvtalenr().intValue());
        Assert.assertEquals(1000003, factory.nyttAvtalenr().intValue());
    }
}
