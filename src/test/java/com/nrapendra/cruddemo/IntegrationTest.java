package com.nrapendra.cruddemo;

import com.nrapendra.cruddemo.config.AsyncSyncConfiguration;
import com.nrapendra.cruddemo.config.EmbeddedSQL;
import com.nrapendra.cruddemo.config.JacksonConfiguration;
import com.nrapendra.cruddemo.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(
    classes = { DemoProjectApp.class, JacksonConfiguration.class, AsyncSyncConfiguration.class, TestSecurityConfiguration.class }
)
@EmbeddedSQL
public @interface IntegrationTest {
}
