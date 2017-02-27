package org.baeldung.um.client.marshall;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author amarjeet <amarjeet.singh@aurea.com>
 */
public class JacksonMarshallerTest {

    @Test
    public void encodeTest() {
        JacksonMarshaller marshaller = new JacksonMarshaller();
        Doobie doobie = new Doobie()
            .setAge(20)
            .setName("Xur");
        final String encoded = marshaller.encode(doobie);
        assertNotNull(encoded);
    }

    private static class Doobie {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public Doobie setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Doobie setAge(int age) {
            this.age = age;
            return this;
        }
    }
}
