package com.potmoon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.potmoon.domain.BoardVO;
import com.potmoon.service.AdminService;

@Controller
public class HomeController {
	@Autowired
	private AdminService adminService;
	
//	public void setAdminService(AdminService adminService) {
//		this.adminService = adminService;
//		
//	}
	
	//상품 목록
	@RequestMapping(value="/board/list", method=RequestMethod.GET)
	public String getClothList(Model model) {
		List<BoardVO> list = adminService.getClothList();
		model.addAttribute("boardList", list);
		return "board/list";
	}
	
	//상품 조회
	@RequestMapping(value="/board/view/{clothNum}", method=RequestMethod.GET)
	public String getClothdetail(Model model,@PathVariable int clothNum) {
		model.addAttribute("boardVO" , adminService.getClothDetail(clothNum));
		return "board/view";
	}
	
	//상품 삭제
	@RequestMapping(value="/board/delete", method=RequestMethod.POST)
	public String Clothdelete(Long clothNum) {
		adminService.delete(clothNum);
		return "redirect:/board/list";
	}
	
//	@GetMapping("delete")
//	public String delete(@RequestParam("clothNum")Long clothNum) {
//		adminService.delete(clothNum);
//		return "redirect:/board/list";
//	}
	
	
	//관리자 메인페이지
	@RequestMapping(value="/board/index", method = RequestMethod.GET)
	public String getIndex() {
		return "board/index";
	}
	
	
}
