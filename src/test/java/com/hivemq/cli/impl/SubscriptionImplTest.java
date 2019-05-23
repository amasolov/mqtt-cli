package com.hivemq.cli.impl;

import com.hivemq.cli.commands.Subscribe;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubscriptionImplTest {

    private Subscribe param;

    @Before
    public void setUp() throws Exception {
        param = new Subscribe();
        param.setHost("localhost");
        param.setPort(1883);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void runSuccess() {
        param.setTopics(new String[]{"/"});
        SubscriptionImpl.get((Subscribe) param).run();
    }
}