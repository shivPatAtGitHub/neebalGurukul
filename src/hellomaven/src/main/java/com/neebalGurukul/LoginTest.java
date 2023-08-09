package com.neebalGurukul;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.neebalGurukul.dao.LoginDao;
import com.neebalGurukul.dao.UserAlreadyExistsException;
import com.neebalGurukul.dao.UserNotFoundException;
import com.neebalGurukul.model.Login;

public class LoginTest {
//
//	public static void main(String[] args) {
//
//		LoginDao dao = new LoginDao();
//		System.out.println("LoginTest");
//		List<Login> userList = new ArrayList<>();
//
//		try {
//			userList = dao.getLoginDetails();
//
//			for (Login obj : userList) {
//				System.out.println(obj.getuName() + ", " + obj.getPswd());
//			}
//
//			System.out.println("Password for Username = Shrikant is " + dao.getLoginPassword("Shrikant").getPswd());
//			System.out.println("Password for Username = Chetan is " + dao.getLoginPassword("Chetan").getPswd());
//
//			String passExists = dao.getLoginPassword("obj.getuName()").getPswd();
//			System.out.println("Password for username is " + passExists);
//
//			boolean recordUser = dao.insertUser("Shiv", "Shiv@123", true);
//
//			if (!passExists.isEmpty()) {
//				System.out.println("Inserting");
//				System.out.println("Record Inserted: " + recordUser);
//			}
//
//			if (recordUser)
//				System.out.println("User Inserted");
//			else
//				System.out.println("User Not Inserted");
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//

    public static void main(String[] args) throws Exception {
	// TODO Auto-generated method stub

	Date currentDate = new Date(System.currentTimeMillis());

	LoginDao dao = new LoginDao();
	List<Login> userList = new ArrayList<Login>();
	try {
	    userList = dao.getLoginDetails();
	    for (Login obj : userList) {
		System.out.println(obj.getuName() + " , " + obj.getPswd());
	    }
	    Login obj2 = dao.getLoginPassword("Shiv");
	    System.out.println(obj2.getuName() + ", " + obj2.getPswd());

	    boolean recordUser = dao.insertUser("Shiv", "Shiv@123", true);
	    if (recordUser)
		System.out.println("User Inserted");
	    else
		System.out.println("User Not Inserted");

	    System.out.println(dao.deleteRecordHard("Shiv"));
	}

	catch (UserAlreadyExistsException e) {
	    System.out.println(e);
	}

	catch (UserNotFoundException e) {
	    System.out.println(e);
	}

	catch (SQLException e) {
	    System.out.println(e.getMessage());
	    e.printStackTrace();
	}

    }

}
