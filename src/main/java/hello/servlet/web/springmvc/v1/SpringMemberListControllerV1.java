package hello.servlet.web.springmvc.v1;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class SpringMemberListControllerV1 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @RequestMapping("/springmvc/v1/members") // 매핑을 해야만 url이 들어올 때 기능을 수행하고 반환할 수 있음
    public ModelAndView process(){
        List<Member> members = memberRepository.findAll(); // 저장소로부터 회원목록 가져와서 리스트 객체에 담기
        ModelAndView mv = new ModelAndView("members"); // 렌더링할 뷰의 논리 이름 담기
        mv.addObject("members", members);// 뷰가 쓸 모델과 그 이름을 담기
        return mv; // 모델엔뷰를 리졸버에게 전달
    }
}
