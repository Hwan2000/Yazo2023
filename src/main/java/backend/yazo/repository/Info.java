package backend.yazo.repository;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public final class Info {
    private final String name;
    private final String title;
    private final String ing;
    private final String size;
    private final String text;
}
