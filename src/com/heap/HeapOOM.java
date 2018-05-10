package com.heap;

import java.util.ArrayList;
import java.util.List;
/**
 * VM Args: -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 * @author Administrator
 *
 */
public class HeapOOM {

	static class OOMObject{
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<OOMObject> list = new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}

}
