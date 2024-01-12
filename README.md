# 학습로그
## 학습일자
2024.01.08(월) ~ 2024.01.12(금)

## 학습요약
- MVC 프레임워크가 어떻게 발전해왔는지 학습합
  1. 자바에 HTML 태그를 넣어서 뷰 생성하고 비즈니스 로직 구현
  2. JSP를 활용하여 뷰를 생성하고 자바코드를 JSP에 넣고 내장 서버를 활용하여 서비스 구현
  3. 서블릿 도입
  4. JSP + 서블릿 + MVC 도입
- MVC 프레임워크에서 스프링 프레임워크로 전환 및 그 구조 학습
  1. 스프링 프레임워크의 동작원리 학습
  2. HandlerMapping, HandlerAdapter 기능 학습
  3. View Resolver, ModelAndView 학습
  4. @RequestMapping 학습
  5. @RequestParam, @GetMapping, @PostMapping 학습

## 학습노트
개인 [노션페이지](https://syk25.notion.site/MVC-1-86907dac7c69460795617079f3cb5609) 에 별도로 기록

## 학습기록
### 2024.01.12(금)
- refactor: @RequestParam 도입, HTTP메서드 매핑 도입
- refactor: 컨트롤러 통합
- refactor: 스프링의 핸들러매핑, 핸들러 정보 사용
- refactor: @RequestMapping 도입
- refactor: 컨트롤러 + 모델엔뷰 반환
- refactor: spring MVC 활용을 위한 HandlerMapping, Handler Adapter를 사용하는 스프링 빈 추가
- refactor: ControllerV4를 HandlerAdapter 에 추가
- refactor: HandlerAdapter, Handler 추가
- refactor: 프론트 컨트롤러가 모델을 담당
- refactor: Adapter 패턴 도입

### 2024.01.11(목)
- 프론트 컨트롤러 도입
- 뷰 추가
- 모델 추가

### 2024.01.10(수)
- 회원관리 프로그램 개발
  - 서블릿으로 구현