package hello.servlet.web.springmvc.v1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller // 스프링 빈으로 등록
public class SpringMemberFormControllerV1 {

    @RequestMapping("/springmvc/v1/members/new-form") // 메서드 수준으로 매핑 정보 등록
    public ModelAndView process(){
        return new ModelAndView("new-form");
    }
}
