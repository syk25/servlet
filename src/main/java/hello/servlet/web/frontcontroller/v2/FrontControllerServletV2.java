package hello.servlet.web.frontcontroller.v2;


import hello.servlet.web.frontcontroller.MyView;
import hello.servlet.web.frontcontroller.v2.controller.MemberFormControllerV2;
import hello.servlet.web.frontcontroller.v2.controller.MemberListControllerV2;
import hello.servlet.web.frontcontroller.v2.controller.MemberSaveControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerV2", urlPatterns = "/front-controller/v2/*")
public class FrontControllerServletV2 extends HttpServlet {
    private Map<String, ControllerV2> controllerMap = new HashMap<>();

    // 객체를 생성함과 동시에 설정을 미리 구축
    public FrontControllerServletV2() { // 빌드 전에 미리 주소값을 서블릿에 저장. 호출시 꺼내서 사용
        controllerMap.put(("/front-controller/v2/members/new-form"), new MemberFormControllerV2());
        controllerMap.put(("/front-controller/v2/members/save"), new MemberSaveControllerV2());
        controllerMap.put(("/front-controller/v2/members"), new MemberListControllerV2());
    }

    // 여기 밑 부터는 동작 설명
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("FrontControllerServletV2.service");
        String requestURI = request.getRequestURI(); // 요청이 들어올 때 정보 저장
        ControllerV2 controller = controllerMap.get(requestURI); // 요청정보에 따라 컨트롤러 특정 및 저장
        if (controller == null) { // 컨트롤러가 없는 경우 예외 처리
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        MyView view = controller.process(request,response); // 특정한 컨트롤러의 동작을 수행해서 저장
        view.render(request,response);
    }
}
