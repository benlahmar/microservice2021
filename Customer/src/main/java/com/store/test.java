package com.store;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class test {

	public static void main(String[] args) {
		
		System.out.println(BCrypt.hashpw("moi",BCrypt.gensalt(4)));


	}

}
