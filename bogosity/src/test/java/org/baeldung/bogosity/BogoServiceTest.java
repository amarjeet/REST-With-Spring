package org.baeldung.bogosity;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.baeldung.bogosity.impl.BogoServiceImpl;
import org.junit.Before;
import org.junit.Test;

/**
 * @author amarjeet <amarjeet.singh@aurea.com>
 */
public class BogoServiceTest {

    private BogoService bogoService;
    private Calendar calendar;

    @Before
    public void setup() {
        bogoService = new BogoServiceImpl();
        calendar = GregorianCalendar.getInstance();
    }

    @Test
    public void testGetToday() {
        final Date today = bogoService.getToday();
        assertNotNull(today);
    }

    @Test
    public void testGetUUID() {
        final String uuid = bogoService.getUUID();
        assertNotNull(uuid);
    }

    @Test
    public void dateFromString() throws ParseException {
        final Date date = bogoService.dateFromString("03/01/2017", "MM/dd/yyyy");
        assertNotNull(date);
    }
}
