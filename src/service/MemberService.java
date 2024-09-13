package service;

import model.Member;

public interface MemberService {
	Member Login(String username,String password);//登入
	boolean findByUsername(String username);
	void addMember(Member m);

}
