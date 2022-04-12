package com.potmoon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.potmoon.dao.AdminDao;
import com.potmoon.domain.BoardVO;

@Service
public class AdminServiceImpl implements AdminService{
	@Autowired
	private AdminDao adminDao;
	
//	public AdminDao getAdminDao() {
//		return adminDao;
//	}
//	
//	public void setAdminDao(AdminDao adminDao) {
//		this.adminDao = adminDao;
//	}
	
	@Override
	public List<BoardVO> getClothList() {
		return adminDao.getClothList();
	}
	
	@Override
	public BoardVO getClothDetail(int clothNum) {
		return adminDao.getClothDetail(clothNum);
	}
	
	@Override
	public void delete(Long clothNum) {
	adminDao.delete(clothNum);
	}
	

	
}
