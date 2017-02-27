package org.baeldung.common.client;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author amarjeet <amarjeet.singh@aurea.com>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
    CommonPaths.class
})
@ActiveProfiles(value = {
    "default",
    "client"
})
public class CommonPathsTest {

    private CommonPaths commonPaths;

    @Autowired
    public CommonPathsTest setCommonPaths(CommonPaths commonPaths) {
        this.commonPaths = commonPaths;
        return this;
    }

    @Test(expected = NullPointerException.class)
    @Ignore
    public void testSpringConfiguration() {
        assertNull(this.commonPaths);
    }
}
