package springPractice.core.order;

import springPractice.core.discount.DiscountPolicy;
import springPractice.core.discount.FixDiscountPolicy;
import springPractice.core.discount.RateDiscountPolicy;
import springPractice.core.member.Member;
import springPractice.core.member.MemberRepository;
import springPractice.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private final MemberRepository memberRepository = new MemoryMemberRepository();
//    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
