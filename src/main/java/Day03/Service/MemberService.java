package Day03.Service;

import Day03.Domain.Dto.MemberDto;
import Day03.Domain.Entity.Member.MemberEntity;
import Day03.Domain.Entity.Member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {
    @Autowired
    MemberRepository memberRepository;
    //회원 등록 메소드
    public boolean signup(MemberDto memberDto){
        memberRepository.save(memberDto.toentity()); //Entity를 db에 저장
        return true;
    }
    //회원 출력 메소드
    public boolean getmember(){

        List<MemberEntity> memberEntityList =memberRepository.findAll();//모든엔티티 조회[p.81]
        for(MemberEntity memberEntity :memberEntityList){
        }
        return true;
    }
    //회원검사메소드
    public MemberDto login(MemberDto memberDto){
        List<MemberEntity> memberEntityList = memberRepository.findAll();
        for(MemberEntity memberEntity : memberEntityList){
            if(memberEntity.getM_id().equals(memberDto.getM_id())&&
                memberEntity.getM_password().equals(memberDto.getM_password())){
                return  MemberDto.builder()
                        .m_id(memberEntity.getM_id())
                        .m_num(memberEntity.getM_num()).build();
            }
        }
        return null;
    }
}