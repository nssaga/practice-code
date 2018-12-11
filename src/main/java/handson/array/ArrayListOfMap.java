/*------------------------------------------------------------------------------------------------------
 Author                         : nawal.sah
 File Name                      : ArrayListTest.java
 Date (DD/MM/YYYY)              : Jul 20, 2017
 Description                    : 
 ------------------------------------------------------------------------------------------------------*/

package handson.array;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayListOfMap {
	public static void main(String[] args) {

		ArrayList<HashMap<String, String>> arrayList = new ArrayList<HashMap<String, String>>();

		HashMap<String, String> h = new HashMap<String, String>();
		h.put("ID", "1");
		h.put("AdminUserName", "AdminUserName");
		h.put("AdminEmailId", "AdminEmailId");
		h.put("MailServerURL", "MailServerURL");

		HashMap<String, String> h2 = new HashMap<String, String>();
		h2.put("ID", "2");
		h2.put("AdminUserName", "AdminUserName2");
		h2.put("AdminEmailId", "AdminEmailId2");
		h2.put("MailServerURL", "MailServerURL2");

		arrayList.add(h);
		arrayList.add(h2);

		System.out.println("Array Size : " + arrayList.size());

		for (HashMap<String, String> map : arrayList) {
			System.out.println("ID: " + map.get("ID"));
			System.out.println("AdminUserName: " + map.get("AdminUserName"));
			System.out.println("AdminEmailId: " + map.get("AdminEmailId"));
			System.out.println("MailServerURL: " + map.get("MailServerURL"));

			System.out.println("----------");
		}

	}
}
