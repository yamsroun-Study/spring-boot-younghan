package hello.selector;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.*;

import static org.assertj.core.api.Assertions.assertThat;

class ImportSelectorTest {

    @Test
    void staticConfig() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(StaticConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }

    @Test
    void selectorConfig() {
        AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(SelectorConfig.class);
        HelloBean bean = appContext.getBean(HelloBean.class);
        assertThat(bean).isNotNull();
    }

    @Configuration
    @Import(HelloConfig.class)
    static class StaticConfig {
    }

    @Configuration
    @Import(HelloImportSelector.class)
    static class SelectorConfig {
    }

}
