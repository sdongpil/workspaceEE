package com.itwill.hellomart.address;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;

public class AddressDao {
	private DataSource dataSource;
	
	public AddressDao() throws Exception {
		Properties properties = new Properties();
		properties.load(getClass().getResourceAsStream("/jdbc.properties"));
		
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(properties.getProperty("driverClass"));
		basicDataSource.setUrl(properties.getProperty("url"));
		basicDataSource.setUsername(properties.getProperty("username"));
		basicDataSource.setPassword(properties.getProperty("password"));
		dataSource = basicDataSource;
	}
	public int addressInsert(Address address) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_INSERT);
		pstmt.setString(1, address.getUserid());
		pstmt.setString(2, address.getLoc());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	
	
	public int addressUpdate(Address address) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_UPDATE);
		pstmt.setString(1, address.getLoc());
		pstmt.setString(2, address.getUserid());
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	public int addressDelete(String userid)throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_DELETE);
		pstmt.setString(1, userid);
		int rowCount = pstmt.executeUpdate();
		pstmt.close();
		con.close();
		return rowCount;
	}
	public List<Address> addressfindAll() throws Exception{
		List<Address> addressList= new ArrayList<Address>();
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(AddressSQL.ADDRESS_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Address address = new Address(
				rs.getString("userid"),
				rs.getString("loc"));
			addressList.add(address);
		}
		rs.close();
		pstmt.close();
		con.close();
		return addressList;
		
	}
	
}
