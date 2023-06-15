package com.shopNest.customer;

import com.shopNest.dbHandler.DataFetcher;

public class Validator {

	public static boolean isValid(String uname, String pass) {
			String dbPass=DataFetcher.fetchPassword(uname);
			if(pass.equals(dbPass)) {
				return true;
			}
			else {
				return false;
			}
	}
}
