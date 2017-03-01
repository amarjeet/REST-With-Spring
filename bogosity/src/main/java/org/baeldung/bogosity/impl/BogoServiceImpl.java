package org.baeldung.bogosity.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.baeldung.bogosity.BogoService;

/**
 * @author amarjeet <amarjeet.singh@aurea.com>
 */
public class BogoServiceImpl implements BogoService {

    @Override
    public Date getToday() {
        return new Date();
    }

    @Override
    public String getUUID() {
        return java.util.UUID.randomUUID().toString();
    }

    @Override
    public Date dateFromString(String dateString, String format) throws ParseException {
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.parse(dateString);
    }
}
