package kr.or.ddit.controller;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.or.ddit.vo.MemberVO;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Controller
@RequestMapping("/module")
public class ChatController {
	
	
	
	@RequestMapping(value = "/chat.do", method = RequestMethod.GET)
	public String chatting(HttpServletRequest req, MemberVO memberVO, Model model) throws Exception{
		
		model.addAttribute("member",memberVO);
		return "module/chat";
		
	}
}
