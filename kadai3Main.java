package kadai3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class kadai3Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Map<Integer,String> sampleMap = new HashMap<>();
		
		sampleMap.put(1, "リンゴ");
		sampleMap.put(2, "バナナ");
		sampleMap.put(3, "オレンジ");
		
		System.out.println("(1) map");
		
		 for (Iterator<Integer> itr = sampleMap.keySet().iterator(); itr.hasNext();) {
	           Integer key = itr.next();
	           System.out.println("key: " + key + " value: " + sampleMap.get(key));
		 }
		 
		 
		 List<String> sampleList = new ArrayList<String>();
		 
		 sampleList.add("リンゴ");
		 sampleList.add("バナナ");
		 sampleList.add("オレンジ");
		
		 System.out.println("(2) list");
		 
		 for(int i = 0; i <= sampleList.size(); i++)
		 {
			 System.out.println("key: " +i + " value: " + sampleList.get(i));
		     
		 }
 	}
}
