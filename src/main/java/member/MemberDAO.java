package member;

import com.example.hello_project._3jdbc.dao.ConnectionUtil;
import lombok.Cleanup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDAO {
    public List<MemberVO> selectAll() throws  Exception{
        String sql = "select * from member501";

        @Cleanup Connection connection = ConnectionUtil.INSTANCE.getConnection();
        @Cleanup PreparedStatement pstmt = connection.prepareStatement(sql);
        // 조회, ResultSet이 필료
        @Cleanup ResultSet rs = pstmt.executeQuery();

        List<MemberVO> list = new ArrayList<>();
        while (rs.next()) {

            MemberVO vo = MemberVO.builder()
                    .name(rs.getString("name"))
                    .email(rs.getString("email"))
                    .password(rs.getString("password"))
                    .reg_date(rs.getString("reg_date"))
                    .build();

            list.add(vo);
        }
        return list;
    }
}
