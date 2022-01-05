package Day01.Day01_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@SpringBootApplication
public class Day01_3thymeleaf {
    public static void main(String[] args) {
        SpringApplication.run(Day01_3thymeleaf.class,args);
    }
    //타임리프[thyeleaf]를 이용한 html 에 접근
    //thymeleaf:
        //java폴더에 백엔드
        //resources폴더에 프론트엔드 [html,css,js등등]
    @GetMapping("/")
    public String mainpage(){
        return "Day01/mainpage";
    }
}
