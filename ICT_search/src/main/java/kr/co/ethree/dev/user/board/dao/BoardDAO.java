package kr.co.ethree.dev.user.board.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import kr.co.ethree.dev.common.base.BaseAbstractDAO;
import kr.co.ethree.dev.common.model.ListHelperVO;

@Repository("boardDAO")
@SuppressWarnings("rawtypes")
public class BoardDAO extends BaseAbstractDAO{
	
	public ListHelperVO getBoardDataListVO(ListHelperVO listHelperVO) throws Exception {
		return getListHelperVO("userBoardMapper.totalcount", "userBoardMapper.selectBoardList", listHelperVO);
	}
	public ListHelperVO getUserListVO(ListHelperVO listHelperVO) throws Exception {
		return getListHelperVO("userBoardMapper.usertotalcount", "userBoardMapper.selectUserList", listHelperVO);
	}
	public Map selectBoardOne(Map paramMap) throws Exception {
		return (Map) sqlSession.selectOne("userBoardMapper.selectBoardOne",paramMap);
	}
	public List selectBoardNoticeList() throws Exception {
		return (List) sqlSession.selectList("userBoardMapper.selectBoardNoticeList");
	}
	public int totalcount() throws Exception {
		return sqlSession.selectOne("userBoardMapper.totalcount");
	}
	public int layercount(Map paramMap) throws Exception {
		return sqlSession.selectOne("userBoardMapper.layercount",paramMap);
	}
	public int ordcount(Map paramMap) throws Exception {
		return sqlSession.selectOne("userBoardMapper.ordcount",paramMap);
	}
	public void insertBoard(Map paramMap) throws Exception {
		sqlSession.insert("userBoardMapper.insertBoard",paramMap);
	}
	public void updateBoard(Map paramMap) throws Exception {
		sqlSession.insert("userBoardMapper.updateBoardData",paramMap);
	}
	public void updateBoardOrd() throws Exception {
		sqlSession.update("userBoardMapper.updateBoardOrd");
	}
	public void deleteBoard(Map paramMap) throws Exception {
		sqlSession.delete("userBoardMapper.deleteBoard",paramMap);
	}
}
