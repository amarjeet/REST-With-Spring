package org.baeldung.bogosity;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author amarjeet <amarjeet.singh@aurea.com>
 */
public class AnotherBogoServiceTest {

    private AnotherBogoService service;

    @Before
    public void setup() {
        service = new AnotherBogoService();
    }

    @Test
    public void repeatedString() {
        final String a = service.repeatedString("A", 5);
        assertEquals("AAAAA", a);
    }
}
