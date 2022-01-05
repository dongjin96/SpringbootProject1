package Day02._2_mysql_JPA.Domain;

import javax.persistence.*;

@Entity// 연결된 DB에 테이블과 매핑
@Table(name="member") //매핑할 테이블명
public class MemberEntity {
    @Id//기본키 설정 => pk
    @GeneratedValue(strategy= GenerationType.IDENTITY)// 오토키-> auto key
    private Long m_num;//회원번호
    @Column(length=200,nullable=false)//필드 속성
    private String m_id; //회원아이디
    @Column(length=200,nullable=false)//필드속성
    private  String m_password;//회원비밀번호
}
