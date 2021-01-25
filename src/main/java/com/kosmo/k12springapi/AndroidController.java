package com.kosmo.k12springapi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mybatis.IAndroidDAO;
import mybatis.MemberVO;

@Controller
public class AndroidController {

	@Autowired
	private SqlSession SqlSession;
	
	@RequestMapping("/android/memberList.do")
	@ResponseBody
	public ArrayList<MemberVO> memberList(HttpServletRequest req){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		ArrayList<MemberVO> lists = SqlSession.getMapper(IAndroidDAO.class).memberList();
		map.put("memberList", lists);
		
		return lists;
		
	}
}
