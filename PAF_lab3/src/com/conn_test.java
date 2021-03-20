package com;

public class conn_test {

	public static void main(String[] args) {
		if(request.getParameter("itemCode") != null) {
			Item itemObj = new Item();
			itemObj.connect(); //for testing the connect method
		}

	}

}
