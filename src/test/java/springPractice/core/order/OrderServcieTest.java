package springPractice.core.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import springPractice.core.member.Grade;
import springPractice.core.member.Member;
import springPractice.core.member.MemberService;
import springPractice.core.member.MemberServiceImpl;

public class OrderServcieTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);

    }
}
