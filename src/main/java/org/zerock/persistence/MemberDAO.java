package org.zerock.persistence;

import org.zerock.domain.MemberVO;

/**
 * Created by JeongHeon on 2016. 7. 4..
 */
public interface MemberDAO {
    //DB의 현재시간 체크
    public String getTime();
    //tbl_member테이블에 데이터를 추가하는 기능
    public void insertMember(MemberVO vo);
    public MemberVO readMember(String userid)throws Exception;
    public MemberVO readWithPW(String userid, String userpw) throws Exception;
}
