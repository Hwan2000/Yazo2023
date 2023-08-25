package backend.yazo.service;

import backend.yazo.repository.Movie;
import backend.yazo.repository.MovieRepository;
import backend.yazo.repository.Photo;
import backend.yazo.repository.PhotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class PhotoMovieService {
    private final PhotoRepository photoRepository;
    private final MovieRepository movieRepository;
    private static final HashMap<Character, String> metaDataMap = new HashMap<Character, String>() {{
        put('P', "https://i.postimg.cc");
        put('V', "https://player.vimeo.com/video");
        put('I',"https://i.ibb.co");
    }};

    public String[] getPhoto(int num) {
        if (num > 29 || num < 0) {
            return null;
        } else {
            Photo photo = photoRepository.getPhoto(num);
            char meta = photo.getMeta();
            String[] link = photo.getLink();

            if(link.length==0){return null;}

            String metaValue = metaDataMap.get(meta);

            String[] result = new String[link.length];

            for (int i = 0; i < link.length; i++) {
                result[i] = metaValue + link[i];
            }

            return result;
        }
    }

    public String[] getMovie(int num) {
        if (num > 29 || num < 0) {
            return null;
        } else {
            Movie movie = movieRepository.getMovie(num);
            char meta = movie.getMeta();
            String[] link = movie.getLink();

            if(link.length==0){return null;}

            String metaValue = metaDataMap.get(meta);

            String[] result = new String[link.length];

            for (int i = 0; i < link.length; i++) {
                result[i] = metaValue + link[i];
            }

            return result;
        }
    }
}
