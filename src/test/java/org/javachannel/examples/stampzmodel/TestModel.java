package org.javachannel.examples.stampzmodel;

import org.hibernate.Session;
import org.javachannel.examples.hibernate.util.SessionUtil;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Joseph on 8/27/2014.
 */
public class TestModel {
    @BeforeMethod
    public void cleanAll() {
        Session session= SessionUtil.openSession();
        session.close();
    }

    @Test
    public void testModel() {

    }
}
