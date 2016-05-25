package com.bicjo.pi;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bicjo.pi.core.config.CoreConfiguration;
import com.bicjo.pi.core.config.IntegrationConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { CoreConfiguration.class, IntegrationConfiguration.class })
public abstract class BaseTest {

	protected final Logger LOG = Logger.getLogger(getClass());

}
