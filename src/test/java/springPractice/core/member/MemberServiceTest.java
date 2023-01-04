package springPractice.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springPractice.core.AppConfig;

public class MemberServiceTest {
    MemberService memberService;

    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }

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
