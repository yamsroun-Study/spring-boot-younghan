package hello.info;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MyInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> info = Map.of(
            "company", "yamsroun",
            "name", "jjlim");
        builder.withDetail("custom-info", info);
    }
}
