package in.co.codeplanet.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.co.codeplanet.dao.Dao;

@Service
public class HomeServiceImpl implements HomeService
{
   @Autowired
   Dao d;
   
	@Override
	public void getUserDetails(String name, String username) {
		// TODO Auto-generated method stub
		d.getUserDetails(name,username);
	}
	

	
}
