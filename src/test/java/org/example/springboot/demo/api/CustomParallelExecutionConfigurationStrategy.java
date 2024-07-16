package org.example.springboot.demo.api;

import org.junit.platform.engine.ConfigurationParameters;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfiguration;
import org.junit.platform.engine.support.hierarchical.ParallelExecutionConfigurationStrategy;

public class CustomParallelExecutionConfigurationStrategy implements ParallelExecutionConfigurationStrategy {

    @Override
    public ParallelExecutionConfiguration createConfiguration(ConfigurationParameters configurationParameters) {
        ParallelExecutionConfiguration configuration = new ParallelExecutionConfiguration() {
            @Override
            public int getParallelism() {
                return 8;
            }

            @Override
            public int getMinimumRunnable() {
                return 8;
            }

            @Override
            public int getMaxPoolSize() {
                return 16;
            }

            @Override
            public int getCorePoolSize() {
                return 8;
            }

            @Override
            public int getKeepAliveSeconds() {
                return 30;
            }
        };
        return configuration;
    }
}
