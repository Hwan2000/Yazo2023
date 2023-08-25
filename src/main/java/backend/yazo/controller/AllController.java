package backend.yazo.controller;

import backend.yazo.dto.ResponseDTO;
import backend.yazo.repository.Info;
import backend.yazo.service.InfoService;
import backend.yazo.service.PhotoMovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AllController {

    private final InfoService infoService;
    private final PhotoMovieService photoMovieService;

    @GetMapping("/getInfo/{num}")
    public ResponseEntity<ResponseDTO> getInfo(@PathVariable("num") int num){

        num -= 1;
        Info info = infoService.getInfo(num);
        String[] photoList = photoMovieService.getPhoto(num);
        String[] movieList = photoMovieService.getMovie(num);

        ResponseDTO response = new ResponseDTO();

        response.setIng(info.getIng());
        response.setName(info.getName());
        response.setText(info.getText());
        response.setSize(info.getSize());
        response.setTitle(info.getTitle());

        response.setPhotoList(photoList);
        response.setMovieList(movieList);

        return ResponseEntity.ok(response);
    }
}
