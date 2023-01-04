package springPractice.core;

import springPractice.core.discount.FixDiscountPolicy;
import springPractice.core.member.MemberService;
import springPractice.core.member.MemberServiceImpl;
import springPractice.core.member.MemoryMemberRepository;
import springPractice.core.order.OrderService;
import springPractice.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
