package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberSaveControllerV3 implements ControllerV3 {

    private MemberRepository memberRepository = MemberRepository.getInstance();
    @Override
    public ModelView process(Map<String, String> paraMap) {
        String username = paraMap.get("username");
        int age = Integer.parseInt(paraMap.get("age"));
        Member member = new Member(username,age);
        memberRepository.save(member);

        // 모델뷰 선언 및 초기화
        ModelView mv = new ModelView("save-result");
        mv.getModel().put("member",member); // 속성 중 모델에 회원 정보 객체 저장
        return mv; // 모델뷰 반환
    }
}
