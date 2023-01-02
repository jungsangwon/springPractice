package springPractice.core.discount;

import springPractice.core.member.Member;

public interface DiscountPolicy {

    /**
     * return 할인 정책
     * */
    int discount(Member member, int price);
}
