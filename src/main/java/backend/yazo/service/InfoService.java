package backend.yazo.service;

import backend.yazo.repository.Info;
import backend.yazo.repository.InfoRepository;
import backend.yazo.repository.PhotoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InfoService {

    private final InfoRepository infoRepository;

    public Info getInfo(int num){
        if(num > 29 || num < 0){
            return Info.builder().name(null).ing(null).title(null).text(null).size(null).build();
        } else {
            return infoRepository.getInfoByNum(num);
        }
    }
}
