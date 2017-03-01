package org.baeldung.bogosity;

/**
 * @author amarjeet <amarjeet.singh@aurea.com>
 */
public class AnotherBogoService {

    public String repeatedString(String toBeRepeated, int times) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < times; i++) {
            builder.append(toBeRepeated);
        }
        return builder.toString();
    }
}
