package com.worker.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.db.DBUtils;
public class WorkerDao {
	public boolean insert(Worker user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "insert into worker values(?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getID());
			ps.setString(2, user.getName());
			ps.setString(3, user.getAuthority());
			ps.setString(4, user.getIDCard());
			ps.setString(5, user.getProfession());
			ps.setString(6, user.getpNumber());
			ps.setString(7, user.getSex());
			ps.setString(8, user.getAge());
			ps.setString(9, user.getAddress());
			ps.setString(10, user.getEmail());
			
			int x  = ps.executeUpdate();
			ps.close();
			conn.close();
			if(x > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public boolean delete(String ID){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "delete from worker where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
			int x = ps.executeUpdate();
			ps.close();
			conn.close();
			if(x > 0 )
				return true;			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	
	
	public boolean update(Worker user){
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "update worker set name=?,Authority=?,IDCard=?,profession=?,pNumber=?,sex=?,age=?,address=?,email=? where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1, user.getName());
			ps.setString(2, user.getAuthority());
			ps.setString(3, user.getIDCard());
			ps.setString(4, user.getProfession());
			ps.setString(5, user.getpNumber());
			ps.setString(6, user.getSex());
			ps.setString(7, user.getAge());
			ps.setString(8, user.getAddress());
			ps.setString(9, user.getEmail());
			ps.setString(10, user.getID());
			
			int x  = ps.executeUpdate();
			ps.close();
			conn.close();
			if(x > 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public Worker queryById(String ID){
		Worker u = new Worker();
		try {
			Connection conn = DBUtils.getConnection();
			String sql = "select * from worker where ID=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ID);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				u.setID(rs.getString("ID"));
				u.setName(rs.getString("name"));
				u.setAuthority(rs.getString("Authority"));
				u.setIDCard(rs.getString("IDCard"));
				u.setProfession(rs.getString("profession"));
				u.setpNumber(rs.getString("pNumber"));
				u.setSex(rs.getString("sex"));
				u.setAge(rs.getString("age"));
				u.setAddress(rs.getString("address"));
				u.setEmail(rs.getString("email"));
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return u;
	}
	
	public ArrayList<Worker> query(Worker u){
		String ID = u.getID();
		String name = u.getName();
		String Authority = u.getAuthority();
		String IDCard = u.getIDCard();
		String profession = u.getProfession();
		String pNumber = u.getpNumber();
		String sex = u.getSex();
		String age = u.getAge();
		String address = u.getAddress();
		String email = u.getEmail();
		
		ArrayList<Worker> users = new ArrayList<Worker>();
		ArrayList<String> params = new ArrayList<String>();
		try {
			Connection conn = DBUtils.getConnection();
			StringBuffer sql =new StringBuffer("select ID,name,Authority,IDCard,profession,pNumber,sex,age,address,email from worker where 1=1");
			if(ID != null && !"".equals(ID) ){
				sql.append(" and ID=?");
				params.add(ID);
			}
			if(name != null && !"".equals(name) ){
				sql.append(" and name=?");
				params.add(name);
			}
			if(Authority != null && !"".equals(Authority) ){
				sql.append(" and Authority=?");
				params.add(Authority);
			}
			if(IDCard != null && !"".equals(IDCard) ){
				sql.append(" and IDCard=?");
				params.add(IDCard);
			}
			if(profession != null && !"".equals(profession) ){
				sql.append(" and profession=?");
				params.add(profession);
			}
			if(pNumber != null && !"".equals(pNumber) ){
				sql.append(" and pNumber=?");
				params.add(pNumber);
			}
			if(sex != null && !"".equals(sex) ){
				sql.append(" and sex=?");
				params.add(sex);
			}
			if(age != null && !"".equals(age) ){
				sql.append(" and age=?");
				params.add(age);
			}
			if(address != null && !"".equals(address) ){
				sql.append(" and address=?");
				params.add(address);
			}
			if(email != null && !"".equals(email) ){
				sql.append(" and email=?");
				params.add(email);
			}
			PreparedStatement ps = conn.prepareStatement(sql.toString());
			for(int i=0; i< params.size(); i++){
				ps.setString(i+1,params.get(i));
			}
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Worker u1 = new Worker();
				u1.setID(rs.getString("ID"));
				u1.setName(rs.getString("name"));
				u1.setAuthority(rs.getString("Authority"));
				u1.setIDCard(rs.getString("IDCard"));
				u1.setProfession(rs.getString("profession"));
				u1.setpNumber(rs.getString("pNumber"));
				u1.setSex(rs.getString("sex"));
				u1.setAge(rs.getString("age"));
				u1.setAddress(rs.getString("address"));
				u1.setEmail(rs.getString("email"));
				users.add(u1);
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	
	public ArrayList<Worker> find(){
		try {
			Connection conn = DBUtils.getConnection();
			Statement stmt = conn.createStatement();
			String sql = "select * from worker";
			ResultSet rs = stmt.executeQuery(sql);
			ArrayList<Worker> users = new ArrayList<Worker>();
			while(rs.next()){
				Worker user = new Worker();
				user.setID(rs.getString("ID"));
				user.setName(rs.getString("name"));
				user.setAuthority(rs.getString("Authority"));
				user.setIDCard(rs.getString("IDCard"));
				user.setProfession(rs.getString("profession"));
				user.setpNumber(rs.getString("pNumber"));
				user.setSex(rs.getString("sex"));
				user.setAge(rs.getString("age"));
				user.setAddress(rs.getString("address"));
				user.setEmail(rs.getString("email"));
				users.add(user);
			}
			rs.close();
			stmt.close();
			conn.close();
			return users;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
