package hello.core.order;

import hello.core.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
<<<<<<< HEAD
    MemberService memberService = new MemberServiceImpl(memberRepository);
=======
    MemberService memberService = new MemberServiceImpl();
>>>>>>> 9622a20e94c04855d4687fffcbcd8ad5478992b9
    OrderService orderService = new OrderServiceImpl();

    @Test
    void 주문테스트(){
        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 1000);

        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
        Assertions.assertThat(order.calculatePrice()).isEqualTo(0);

    }
}
