package cn.syy.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;


/**
 * ���Ӻ͹ر����ݿ�
 * @author ʩ��Ե
 *
 */
public class JDBCUtil {
	
	/**
	 * �������ݿ�
	 * ʹ��C3P0
	 */
	public static Connection getConnection(){
		Connection conn=null;
		DataSource dataSource = new ComboPooledDataSource("syydata");
		try {
			conn=dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
		
	}
	
	/**
	 * �ر����ݿ�ķ���
	 * 
	 */
	public static void closeConnection(ResultSet rs,PreparedStatement ps,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(ps!=null){
			try {
				ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}


}
