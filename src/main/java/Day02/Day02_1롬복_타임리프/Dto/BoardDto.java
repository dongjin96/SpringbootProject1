package Day02.Day02_1롬복_타임리프.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
@Setter//get setter 사용
@Getter
@AllArgsConstructor // 풀생성자
@NoArgsConstructor  // 생성자 생성 대체
public class BoardDto {


    //필드
    private String b_title;
    private String b_contents;
    private Date b_date;
    //생성자

    //메소드
}
