package in.co.codeplanet.dao;

import java.sql.CallableStatement;
import java.sql.Connection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DaoImpl implements Dao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public void getUserDetails(String name, String username)
	{
		
            final String procedureCall = "{call Proc_Chirag(?,?,?)}";
			Connection connection = null;
			try {	
			connection = jdbcTemplate.getDataSource().getConnection();
			CallableStatement callableSt = connection.prepareCall(procedureCall);
			callableSt.setString(1, "signup");
			callableSt.setString(2, name);
			callableSt.setString(3, username);
			
			callableSt.execute();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}
