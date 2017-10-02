import java.util.*;
public class Assignment_2 {
     public static void main(String args[]){
    	 ArrayList<String> list1=new ArrayList<String>();
    	 list1.add("Ramos");
    	 list1.add("Modric");
    	 list1.add("Marcello");
    	 ArrayList<String> list2=new ArrayList<String>();
    	 list1.add("Ronaldo");
    	 list1.add("Bale");
    	 list1.add("Bengima");
    	 list1.addAll(list2);
    	 for(String name:list1){
    		 System.out.println(name);
    	 }
     }
}
