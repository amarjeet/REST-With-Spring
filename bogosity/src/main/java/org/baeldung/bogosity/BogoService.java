package org.baeldung.bogosity;

import java.text.ParseException;
import java.util.Date;

/**
 * @author amarjeet <amarjeet.singh@aurea.com>
 */
public interface BogoService {

    Date getToday();

    String getUUID();

    Date dateFromString(String dateString) throws ParseException;
}
