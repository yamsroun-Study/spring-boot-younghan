package memory;

import lombok.*;

@AllArgsConstructor
@Getter
@ToString
public class Memory {

    private long used;
    private long max;
}