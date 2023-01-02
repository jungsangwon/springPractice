package springPractice.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();

    @Test
    void join(){
        //given
        Member meber = new Member(1L, "memberA",Grade.VIP);
        //when
        memberService.join(meber);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(meber).isEqualTo(findMember);
    }
}
