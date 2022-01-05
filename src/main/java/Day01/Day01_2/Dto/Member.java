package Day01.Day01_2.Dto;

import lombok.*;

@Setter//현재 필드에 set메소드 제공
@Getter // 현재 필드에 get메소드 제공
@NoArgsConstructor//빈생성자 제공
@AllArgsConstructor//풀생성자 제공
//@RequiredArgsConstructor//생성자 사용시 null값을 부여해준다
@ToString//객체 정보 메소드 제공
public class Member {
    //필드
    private String id;
    private String password;
    //생성자[룸북 사용하면 빈생성자 풀생성자 제공]

    //메소드[룸북을 사용허면  getset 메소드 자동생성]


}
