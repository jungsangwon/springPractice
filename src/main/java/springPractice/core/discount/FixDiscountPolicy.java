package springPractice.core.discount;

import org.springframework.stereotype.Component;
import springPractice.core.member.Grade;
import springPractice.core.member.Member;

@Component
public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return discountFixAmount;
        }else{
            return 0;
        }
    }
}
