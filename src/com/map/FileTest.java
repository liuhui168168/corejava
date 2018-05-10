package com.map;

import com.tom.security.DesEncrypt;
import com.tom.util.Util;

public class FileTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String key = Util.readFileByLines("file/authorization.dat");
		DesEncrypt des = new DesEncrypt();
		key = des.getDesString(key);
		System.out.println(key);
	}

}
