package member;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@Builder
public class MemberVO {
    private String name;
    private String email;
    private String password;
    private String reg_date;
}
