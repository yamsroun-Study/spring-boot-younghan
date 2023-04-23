package hello.datasource;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.hibernate.validator.constraints.time.DurationMax;
import org.hibernate.validator.constraints.time.DurationMin;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.validation.annotation.Validated;

import java.time.Duration;
import java.util.List;

@Getter
@ConfigurationProperties("my.datasource")
@RequiredArgsConstructor
@Validated
public final class MyDataSourcePropertiesV3 {

    @NotEmpty
    private final String url;

    @NotEmpty
    private final String username;

    @NotEmpty
    private final String password;

    private final Etc etc;


    @Getter
    public static final class Etc {

        @Min(1)
        @Max(999)
        private final int maxConnection;

        @DurationMin(seconds = 1)
        @DurationMax(seconds = 60)
        private final Duration timeout;

        private final List<String> options;

        public Etc(
            int maxConnection,
            Duration timeout,
            @DefaultValue("DEFAULT") List<String> options
        ) {
            this.maxConnection = maxConnection;
            this.timeout = timeout;
            this.options = options;
        }
    }
}
