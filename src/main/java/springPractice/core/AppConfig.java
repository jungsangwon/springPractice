package springPractice.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springPractice.core.discount.DiscountPolicy;
import springPractice.core.discount.FixDiscountPolicy;
import springPractice.core.discount.RateDiscountPolicy;
import springPractice.core.member.MemberRepository;
import springPractice.core.member.MemberService;
import springPractice.core.member.MemberServiceImpl;
import springPractice.core.member.MemoryMemberRepository;
import springPractice.core.order.OrderService;
import springPractice.core.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService(){
        System.out.println("call AppConfig.memberService");
        return new MemberServiceImpl(MemberRepository());
    }

    @Bean
    public MemberRepository MemberRepository() {

        System.out.println("call AppConfig.MemberRepository");
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService(){
        System.out.println("call AppConfig.orderService");
        return new OrderServiceImpl(MemberRepository(), DiscountPolicy());
    }

    @Bean
    public DiscountPolicy DiscountPolicy() {
        return new RateDiscountPolicy();
    }
}
