package backend.yazo.repository;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public final class Photo {
    final private String name;
    final private String[] link;
    final private char meta;
}
