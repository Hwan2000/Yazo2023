package backend.yazo.repository;

import org.springframework.stereotype.Repository;

@Repository
public final class PhotoRepository {
    //P = https://i.postimg.cc + ~
    //I = https://i.ibb.co + ~
    private static final Photo[] PhotoArray = {
            new Photo("고예진", new String[] {"/4xPyW3fW/image.jpg","/1tQ9Ph38/1.jpg","/PxmyPcnp/2.jpg","/m2cw9t4W/3.jpg"}, 'P')
            ,new Photo("김나영", new String[] {"/7ZGXSB1d/image.jpg","/D03mYwR1/1.jpg","/Pq8XskWy/2.jpg","/X7z6Vz7z/3.png"}, 'P')
            ,new Photo("김빈", new String[] {"/gchgwtD7/image.jpg","/PJbbScVr/1.jpg","/bJpwQBnR/2.jpg","/yxq4mJ2C/3.jpg","/cL1qBGkC/4.jpg","/2S0sH9gw/5.jpg"}, 'P')
            ,new Photo("김세하", new String[] {"/4NkHdBLB/image.jpg","/7LdYRZjm/1.jpg","/T3S6dHQP/2.jpg","/mgPv5yRW/3.jpg","/Y0SnmtCB/4.jpg"}, 'P')
            ,new Photo("김은서", new String[] {"/G3Sz5wp9/image.jpg","/YS3zNTVr/1.jpg","/wTm541Pb/2.jpg"}, 'P')
            //5
            ,new Photo("김응준", new String[] {"/hjKMHT60/image.jpg","/tRfyHNtk/1.jpg","/qqfWFjyZ/2.jpg","/x8yp4Y0c/3.jpg","/GhmjCvKM/4.jpg"}, 'P')
            ,new Photo("김준우", new String[] {"/NFqfx8MQ/image.jpg","/NFqfx8MQ/image.jpg","",""}, 'P')
            ,new Photo("김준형", new String[] {"/zBMtrM0K/image.jpg","/kgfyCz5G/1.jpg","/hvWLMq2y/2.jpg","/c4W7n0g6/3.jpg","/vZHW0hvs/4.jpg","/9Q8yK9xq/5.jpg"}, 'P')
            ,new Photo("김채연", new String[] {"/VLzMNgpC/image.jpg","/BbpjDWk1/1.jpg","/RVP3ZBwk/2.jpg","/hjqv5Pqd/3.jpg"}, 'P')
            ,new Photo("남가현", new String[] {"/g2Q1dxjn/image.jpg","/fL2cn9WP/1.jpg","/cLxfHhKz/2.jpg","/4yGm04V0/3.jpg","/X77vBz89/4.jpg"}, 'P')
            //10
            ,new Photo("류재헌", new String[] {"/65dDwWR0/image.jpg","/FKPMqTcX/1.jpg","/DZHtfmBC/2.jpg","/Bvvyx2zY/3.jpg","/NF8ph0V2/4.jpg","/XYYxh4gX/5.jpg","/QCqk4y9p/6.jpg","/7LT186JP/7.jpg"}, 'P')
            ,new Photo("백자연", new String[] {"/gJ8fJmQm/image.jpg","/RVX2qPs6/1.jpg","/52rGSXMf/2.jpg","/Yqnytv0Q/3.jpg","/6QRHVz0h/4.jpg"}, 'P')
            ,new Photo("서성우", new String[] {"/85Xr7g6X/image.jpg","/Gpq4fnq3/1.jpg","/g2KyG5NQ/2.jpg"}, 'P')
            ,new Photo("서지수", new String[] {"/fDNNwzr/image.jpg","/pvn6wQb/1.jpg","/NYc5rb3/2.jpg","/S3MgkXX/3.jpg"}, 'I')
            ,new Photo("오유진", new String[] {"/PJgGrNrX/image.jpg","/6TJSxSYT/1.jpg","/Nj4gb7jR/2.jpg","/Bnq38LBb/3.jpg"}, 'P')
            //15
            ,new Photo("이시환", new String[] {"/Y9QDf8pH/image.jpg","/Hnpz0gZw/1.jpg"}, 'P')
            ,new Photo("이정주", new String[] {"/05h2K8Vm/image.jpg","/KYcZh4YX/1.jpg","/j5mKfX4K/2.jpg","/3JMYJtwF/3.jpg","/zff1PMd8/4.jpg"}, 'P')
            ,new Photo("임소윤", new String[] {"/c4VkKdCK/image.jpg","/fRVZszFJ/1.jpg","/hvNs70DF/2.jpg","/fRVZszFJ/1.jpg","/x8Vyf1tY/4.jpg"}, 'P')
            ,new Photo("임지민", new String[] {"/SK8ny752/image.jpg","/2545pjbn/1.jpg","/xdy9xshR/2.jpg","/1t7h2bHp/3.jpg","/XqBhhqXb/4.jpg"}, 'P')
            ,new Photo("장도휘", new String[] {"/ZnktJpGR/image.jpg","/WzVW98RM/1.jpg","/Qt3JsM6D/2.jpg"}, 'P')
            //20
            ,new Photo("전호정", new String[] {"/HsdW51NL/image.jpg","/HsdW51NL/image.jpg","/YqCKMrVQ/2.jpg","/1RM2CxtX/3.jpg"}, 'P')
            ,new Photo("정서연", new String[] {"/Qt8S1tcb/image.jpg","/bNk67KY1/1.jpg","/HxF2KtfS/2.jpg","/Qt8S1tcb/image.jpg","/SK2Y5pkh/4.jpg","/DyxWwzzh/5.jpg","/5yjh5p8n/6.jpg"}, 'P')
            ,new Photo("조윤정", new String[] {"/vmQSL3sf/image.jpg","/tR5dFpgS/1.jpg","/28L6r7gQ/2.jpg","/HkHVz7Pb/3.jpg","/m23rPg2k/4.jpg","/FzZ2Q8Nr/5.jpg"}, 'P')
            ,new Photo("조은채", new String[] {}, 'P')
            ,new Photo("조재형", new String[] {}, 'P')
            //25
            ,new Photo("최은지", new String[] {"/k5HY3SZp/image.jpg","/NGmJS5xd/1.jpg","/sg6w7SVg/2.jpg","/RhLTFJs9/3.jpg"}, 'P')
            ,new Photo("한지원", new String[] {}, 'P')
            ,new Photo("한지윤", new String[] {"/tQHrsBK/image.png","/c67hRJm/1.png","/DbDSxNB/2.png","/s2gK8Tx/3.png","/6XBWP94/4-min.png","/ZYTrT1s/5-min.png"}, 'I')
            ,new Photo("황서현", new String[] {"/rpmNdb9V/image.jpg","/SsMfy9yk/1.jpg","/SRDKzZd4/2.jpg","/9X8VZqVc/3.jpg"}, 'P')
            ,new Photo("DI JINGXIAN", new String[] {"/T2V04BCw/DI-JINGXIAN.jpg","/DfNCs1jQ/DI-JINGXIAN-1.jpg","/kgYF3m0Q/DI-JINGXIAN-2.jpg","/4NDs87dV/DI-JINGXIAN-3.jpg","/KvSmf34L/DI-JINGXIAN-4.jpg"}, 'P')
            //30

    };

    public Photo getPhoto(int num){
        return PhotoArray[num];
    }
}
