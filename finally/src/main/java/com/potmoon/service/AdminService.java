package com.potmoon.service;

import java.util.List;

import com.potmoon.domain.BoardVO;

public interface AdminService {
	public List<BoardVO> getClothList();
	
	public BoardVO getClothDetail(int clothNum);
	
	public void delete(Long clothNum);

}
