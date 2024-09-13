package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.DbConnection;
import dao.MemberDao;
import model.Member;

public class MemberDaoImpl	implements MemberDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public void add(Member m) {
		Connection conn=DbConnection.getDB();
		String SQL="insert into member(name,username,password,address,phone) "
				+ "values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			//ps.setString(1, m.getMemberno());
			ps.setString(1, m.getName());
			ps.setString(2, m.getUsername());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getAddress());
			ps.setString(5, m.getPhone());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Member> selectAll() {
		Connection conn=DbConnection.getDB();
		String SQL="select * from member";
		List<Member> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Member m=new Member();
				//m.setId(rs.getInt("id"));
				m.setMemberno(rs.getInt("memberno"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				
				l.add(m);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return l;
	}

	@Override
	public List<Member> selectById(int memberno) {
		Connection conn=DbConnection.getDB();
		String SQL="select * from member where memberno=?";
		List<Member> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, memberno);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Member m=new Member();
				//m.setId(rs.getInt("id"));
				m.setMemberno(rs.getInt("memberno"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				
				l.add(m);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return l;
	}

	@Override
	public List<Member> selectMember(String username, String password) {
		Connection conn=DbConnection.getDB();
		String SQL="select * from member where username=? and password=?";
		List<Member> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			ps.setString(2,password);
			
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Member m=new Member();
				//m.setId(rs.getInt("id"));
				m.setMemberno(rs.getInt("memberno"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				
				l.add(m);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return l;
	}

	@Override
	public List<Member> selectByUsername(String username) {
		Connection conn=DbConnection.getDB();
		String SQL="select * from member where username=?";
		List<Member> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1, username);
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				Member m=new Member();
				//m.setId(rs.getInt("memberno"));
				m.setMemberno(rs.getInt("memberno"));
				m.setName(rs.getString("name"));
				m.setUsername(rs.getString("username"));
				m.setPassword(rs.getString("password"));
				m.setAddress(rs.getString("address"));
				m.setPhone(rs.getString("phone"));
				
				l.add(m);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return l;
	}

	@Override
	public void update(Member m) {
		Connection conn=DbConnection.getDB();
		String sQL="update member set name=?,address=? where memberno                    =?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(sQL);
			ps.setString(1, m.getName());
			ps.setString(2, m.getAddress());
			ps.setInt(3,m.getMemberno());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int memberno) {
		Connection conn=DbConnection.getDB();
		String SQL="delete from member where id=?";
		
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, memberno);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
