package hello.config;

import memory.*;
import org.springframework.context.annotation.*;

@Configuration
@Conditional(MemoryCondition.class)
public class MemoryConfig {

    @Bean
    public MemoryController memoryController() {
        return new MemoryController(memoryFinder());
    }

    @Bean
    public MemoryFinder memoryFinder() {
        return new MemoryFinder();
    }
}
