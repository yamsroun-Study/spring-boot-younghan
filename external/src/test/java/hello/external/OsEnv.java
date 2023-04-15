package hello.external;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

@Slf4j
public class OsEnv {

    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        env.forEach((key, value) -> {
            log.info(">>> env {}={}", key, value);
        });
    }
}
