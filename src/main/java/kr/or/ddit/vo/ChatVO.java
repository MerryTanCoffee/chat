package kr.or.ddit.vo;

import java.util.Date;

public class ChatVO {

	private String chatNum;
	private String memId;
	private String memName;
	private String SenderId;
	private String chatCon;
	private Date chatDate;
	
	public String getChatNum() {
		return chatNum;
	}
	public void setChatNum(String chatNum) {
		this.chatNum = chatNum;
	}
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public String getSenderId() {
		return SenderId;
	}
	public void setSenderId(String senderId) {
		SenderId = senderId;
	}
	public String getChatCon() {
		return chatCon;
	}
	public void setChatCon(String chatCon) {
		this.chatCon = chatCon;
	}
	public Date getChatDate() {
		return chatDate;
	}
	public void setChatDate(Date chatDate) {
		this.chatDate = chatDate;
	}
	
	
	
}
