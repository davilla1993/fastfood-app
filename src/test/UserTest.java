/*package test;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.fastfood.dao.UserDao;
import com.fastfood.entities.Users;
import com.fastfood.security.HashGenerationException;
import com.fastfood.security.HashGeneratorUtils;


public class UserTest {
	
	private static UserDao userDao;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		userDao = new UserDao();
	}
	
	@Test
	public void testCreateUsers() throws HashGenerationException{
		Users user1 = new Users();
		
		 user1.setEmail("admin@gmail.com");
		 user1.setFullname("admin");		
		String password = HashGeneratorUtils.generateSHA256("admin");
		
		user1.setPassword(password);
		
		user1 = userDao.create(user1);
		
		assertTrue(user1.getIduser() > 0);
		
	}
	
	@Test
	public void testCheckLoginSuccess() throws HashGenerationException{
		String email = "admin@gmail.com";
		String password = HashGeneratorUtils.generateSHA256("admin");
		
		boolean loginResult = userDao.checkLogin(email, password);
		
		assertTrue(loginResult);
	}
	
	@AfterClass
	public static void tearDownBeforeClass(){
		userDao.close();
	}

}
*/