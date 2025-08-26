package hello.hello_spring.controller;

import hello.hello_spring.domain.Member;
import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    
    // 의존 주입 방식 
    // 1. 필드 주입
    // @Autowired private MemberService memberService;
    // 2. 생성자 주입 -> 생성자 주입 방식을 권장
    // 3. setter 주입
}
