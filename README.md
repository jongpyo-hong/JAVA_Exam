# JAVA_Exam

## 2023/06/01 강의

### Log

- 연관관계 매핑
  - ManyToOne, OneToMany, OneToOne -> restController.JPAExam2Controller 경로에 예제 추가
  - ManyToMany -> restController.JPAExam3Controller 경로에 예제 추가

- 공통 속성화
  -> restController.JPAExam4Controller 경로에 예제 추가
  
  - 조회수 관련 엔티티
    -> entitis.BoardsView, BoardsViewsId 엔티티 클래스 추가

## 2023/06/02 강의

### Log

- 1교시

- 영속성 전이
  - JPAExam5Controller 예제추가

- 새로운 project(board) 생성

  - 의존성 (spring initializr)
    - spring Devtools
    - lombok
    - spring web
    - thymeleaf
    - h2 database (scope=test)
    - validation
    - spring data jpa
  
  - 의존성 (maven repository)
    - ojdbc8
    - timeleaf layout
    - querydsl jpa
    - querydsl apt
      - plugin
    - Model Mapper


- 2교시

- 연관관계 매핑

- 3교시

- Spring Security

  - configs -> SecurityConfig클래스 추가
    - login은 지원, join X

  - thymeleaf 기본 설정 추가

  - 정적자원 (css, js, messages) 추가
    - messages -> MvcConfig에서 MessageSource 빈 추가
      - commons, errors, validations 메세지 정리

- 4교시

- join 기능 구현


## 2023/06/05

### Log

- 회원가입 html 구현
- 로그인 html 구현
- 시큐리티 내 로그인 검증 구현


- login.html (아이디 저장 쿠키 구현)


## 2023/06/07

### Log

- 타임리프 내 Authorize (관리자, 유저) 로그인 방식 구현

- 통합구현 테스트 내용 프로젝트 추가 (board2)

  - 인터페이스 명세서 (엑셀파일)

  - 통합 테스트 구현 
    - MockMvc : 스프링에서 제공되는 테스트 툴

    - MockMvcRequestBuilders : 요청 관련 테스트 기능들
    
    - MockMvcResultMatchers : 요청후 검증에 관한 기능들
            - andExpect(...)

    - MockMvcResultHandlers  : 
            - andDo(...) - print() : 요청과 응답에 대한 자세한 정보


- 프로젝트
  - commons
    - rest - JSONResult.java
    - CommonException.java

  - restcontrollers
    - BoardApiController.java
    - CommonRestController.java

- 통합 테스트
  - tests
    - BoardApiSaveTest