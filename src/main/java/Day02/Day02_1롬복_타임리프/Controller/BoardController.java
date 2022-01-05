package Day02.Day02_1롬복_타임리프.Controller;

import Day02.Day02_1롬복_타임리프.Dto.BoardDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

@Controller //MVC중 현대 클래스를 컨트롤러로 지정해준다
public class BoardController {
    ArrayList<BoardDto>boardDtos= new ArrayList<>();

    @GetMapping("/") // "/" 최상경로
    public String boardlist(Model model){ //Model : UI 통신 인터페이스
        /////////////////////////////예제1 dto 보내기
        BoardDto boardDto = new BoardDto("안녕하세요","타임리프로 데이터보내기",new Date());
        model.addAttribute("boardDto",boardDto);
        //model.addAttribute("모델명","모델값");
        /////////////////////////////예제2 리스트 보내기
        model.addAttribute("boardDtos",boardDtos);
        return "Day02/boardlist"; //타임리프 설치했을경우 hrml 반환
    }

    //@PostMapping 도 가능
    @GetMapping("/boardwrite")
    public String boardwrite(BoardDto boardDto){    //form내 name과dto내 필드명이 동일할경우 dto 자동 저장
        boardDto.setB_date(new Date());
        boardDtos.add(boardDto);
       // return "Day02/boardlist";  //타임리프를이용한  html이동
        return "redirect:/";         // redirect : 경로 경로이동
    }
/////////////////////////////////예제3////////////////////////////////////
    @GetMapping("/boardwrite2")
   public String boardwrite2(BoardDto boardDto){
       boardDto.setB_date(new Date());
        boardDtos.add(boardDto);
        return "redirect:/";
    }
    @PostMapping("/boardwrite3")
        public String boardwrite3(@RequestBody BoardDto boardDto){//ajax와 통신시 @RequestBody
        boardDto.setB_date(new Date());
        boardDtos.add(boardDto);
        return "redirect:/";
    }

//    @PostMapping("/boardwrite3")
//    public String boardwrite3(@RequestParam Map<String,String> json){
//                                //ajax와 통신시 @RequestBody
//       BoardDto boardDto = new BoardDto(json.get("b_title"),json.get("b_contents"),new Date());
//        boardDtos.add(boardDto);
//        return "redirect:/";
//    }

}
