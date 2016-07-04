package org.zerock.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

import javax.inject.Inject;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by JeongHeon on 2016. 7. 4..
 */

//Repository는 DAO를 스프링에 인식시키기 위해서 주로 사용
@Repository
public class MemberDAOImpl implements MemberDAO {
    @Inject
    private SqlSession sqlSession;
    private static final String namespace = "org.zerock.mapper.MemberMapper";

    @Override
    public String getTime() {
        return sqlSession.selectOne(namespace + ".getTime");
    }

    @Override
    public void insertMember(MemberVO vo) {
        //sqlSession.insert(namespace + ".insertMember", vo);
        sqlSession.insert(namespace + ".insertMember", vo);
    }

    @Override
    public MemberVO readMember(String userid) throws Exception {
        return (MemberVO) sqlSession.selectOne(namespace + ".selectMember", userid);
    }

    @Override
    public MemberVO readWithPW(String userid, String userpw) throws Exception {
        Map<String, Object> paramMap = new HashMap<String, Object>();

        paramMap.put("userid", userid);
        paramMap.put("userpw", userpw);

        return sqlSession.selectOne(namespace + ".readWithPW", paramMap);
    }
}
