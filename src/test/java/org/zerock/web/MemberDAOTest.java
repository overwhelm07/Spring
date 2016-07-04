package org.zerock.web;

/**
 * Created by JeongHeon on 2016. 7. 4..
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.MemberVO;
import org.zerock.persistence.MemberDAO;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class MemberDAOTest {
    @Inject
    private MemberDAO dao;

    @Test
    public void testTime() throws Exception{
        System.out.println(dao.getTime());
    }

    @Test
    public void testInsertMember() throws Exception{
        MemberVO vo = new MemberVO();
        vo.setUserid("user111");
        vo.setUserpw("1234");
        vo.setUsername("USER00");
        vo.setEmail("user00@gmail.com");

        dao.insertMember(vo);
    }
    @Test
    public void testReadMember() throws Exception{
        MemberVO vo = dao.readMember("user00");
        System.out.println(vo.toString());
    }
    @Test
    public void testReadWithPw() throws Exception{
        MemberVO vo = dao.readWithPW("user01", "1234");
        System.out.println(vo.toString());
    }
}
