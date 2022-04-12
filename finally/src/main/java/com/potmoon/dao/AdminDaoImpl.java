package com.potmoon.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.potmoon.domain.BoardVO;
@Repository
public class AdminDaoImpl implements AdminDao{
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
//	public AdminDaoImpl(SqlSessionTemplate sqlSessionTemplate) {
//		this.sqlSessionTemplate = sqlSessionTemplate;
//	}
	
	
	@Override
	public List<BoardVO> getClothList() {
		return sqlSessionTemplate.selectList("list");
	}
	
	@Override
	public BoardVO getClothDetail(int clothNum) {
		BoardVO vo = (BoardVO) sqlSessionTemplate.selectOne("getClothDetail", clothNum);
		return vo;
		
	}
	
	@Override
	public void delete(Long clothNum) {
		sqlSessionTemplate.delete("delete", clothNum);
	}

}
