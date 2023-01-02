package springPractice.core.order;

import springPractice.core.member.Grade;
import springPractice.core.member.Member;
import springPractice.core.member.MemberService;
import springPractice.core.member.MemberServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = "+order);
    }
}
