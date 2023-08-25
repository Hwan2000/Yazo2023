package backend.yazo.repository;

import org.springframework.stereotype.Repository;

@Repository
public final class MovieRepository {
    private static final Movie[] MovieArray = {
            new Movie("고예진", new String[] {}, 'V')
            ,new Movie("김나영", new String[] {}, 'V')
            ,new Movie("김빈", new String[] {}, 'V')
            ,new Movie("김세하", new String[] {}, 'V')
            ,new Movie("김은서", new String[] {}, 'V')
            //5
            ,new Movie("김응준", new String[] {"/857043907?badge=0&amp;autopause=0&amp;player_id=0&amp;app_id=58479"}, 'V')
            ,new Movie("김준우", new String[] {}, 'V')
            ,new Movie("김준형", new String[] {}, 'V')
            ,new Movie("김채연", new String[] {}, 'V')
            ,new Movie("남가현", new String[] {}, 'V')
            //10
            ,new Movie("류재헌", new String[] {}, 'V')
            ,new Movie("백자연", new String[] {"/857726185?badge=0&amp;autopause=0&amp;player_id=0&amp;app_id=58479"}, 'V')
            ,new Movie("서성우", new String[] {}, 'V')
            ,new Movie("서지수", new String[] {}, 'V')
            ,new Movie("오유진", new String[] {}, 'V')
            //15
            ,new Movie("이시환", new String[] {}, 'V')
            ,new Movie("이정주", new String[] {}, 'V')
            ,new Movie("임소윤", new String[] {}, 'V')
            ,new Movie("임지민", new String[] {}, 'V')
            ,new Movie("장도휘", new String[] {}, 'V')
            //20
            ,new Movie("전호정", new String[] {}, 'V')
            ,new Movie("정서연", new String[] {}, 'V')
            ,new Movie("조윤정", new String[] {}, 'V')
            ,new Movie("조은채", new String[] {}, 'V')
            ,new Movie("조재형", new String[] {}, 'V')
            //25
            ,new Movie("최은지", new String[] {}, 'V')
            ,new Movie("한지원", new String[] {}, 'V')
            ,new Movie("한지윤", new String[] {}, 'V')
            ,new Movie("황서현", new String[] {}, 'V')
            ,new Movie("DI JINGXIAN", new String[] {}, 'V')
            //30

    };

    public Movie getMovie(int num){
        return MovieArray[num];
    }
}
