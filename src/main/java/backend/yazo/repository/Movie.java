package backend.yazo.repository;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@Builder
public final class Movie {
    final private String name;
    final private String[] link;
    final private char meta;
}
