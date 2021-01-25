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
	
	/*1. 매개변수 필요 없이 JSONObject로 반환*/
	@RequestMapping("/android/memberObject.do")
	@ResponseBody
	public Map<String, Object> memberList(HttpServletRequest req){
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		ArrayList<MemberVO> lists = SqlSession.getMapper(IAndroidDAO.class).memberList();
		map.put("memberList", lists);
		
		return map;
	}
	
	/*JSONArray로 데이터 반환*/
	@RequestMapping("/android/memberList.do")
	@ResponseBody
	public ArrayList<MemberVO> memberObject(HttpServletRequest req){
		
		ArrayList<MemberVO> lists = SqlSession.getMapper(IAndroidDAO.class).memberList();
		
		return lists;
	}
}
