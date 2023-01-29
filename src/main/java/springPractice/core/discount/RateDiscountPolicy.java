package springPractice.core.discount;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springPractice.core.annotation.MainDiscountPolicy;
import springPractice.core.member.Grade;
import springPractice.core.member.Member;

@Component
@Primary
//@MainDiscountPolicy
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price * discountPercent / 100;
        }else {
            return 0;
        }
    }
}
