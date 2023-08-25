package backend.yazo.dto;

import backend.yazo.repository.Info;
import backend.yazo.repository.InfoRepository;
import lombok.*;

@Getter
@Setter
public class ResponseDTO {
    private String name;
    private String title;
    private String ing;
    private String size;
    private String text;
    private String[] photoList;
    private String[] movieList;
}
