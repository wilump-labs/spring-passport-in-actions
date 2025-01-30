# Passport
Spring Security를 사용하지 않고 API Gateway를 통해 사용자 정보를 전달받아 사용자 정보 활용 또는 제어하는 예제

## Prerequisites
- API Gateway를 통해 사용자를 식별한 후 Header(`X-Passport`)에 사용자 정보를 담아 전달한다.
- 예제 상 사용자 정보는 콜론(`:`)으로 구분된 문자열이다.

## Features
- Header(`X-Passport`)에 담긴 사용자 정보를 추출하여 사용자 정보를 제공한다.
  - HandlerMethodArgumentResolver를 사용하여 커스텀 어노테이션(`@CurrentPassport`)를 사용하는 인자의 컨트롤러 메서드에 사용자 정보를 추가한다.
- 별도 AOP를 통해 Passport에 담긴 정보를 활용하여 RBAC 구현할 수 있다.
