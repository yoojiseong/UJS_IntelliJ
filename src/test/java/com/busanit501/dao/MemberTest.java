package com.busanit501.dao;

import member.MemberDAO;
import member.MemberVO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class MemberTest {

    private MemberDAO memberDAO;

    @BeforeEach
    public void setup(){
        memberDAO = new MemberDAO();
    }

    //전체 조회
    @Test
    public void testselect() throws Exception{
        List<MemberVO> list = memberDAO.selectAll();
        list.forEach(vo-> System.out.println(vo));
    }
}
