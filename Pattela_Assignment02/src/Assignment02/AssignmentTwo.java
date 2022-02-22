package Assignment02;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;


public class AssignmentTwo {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

		
		
		//Problem 01
		
		System.out.print("Please enter no of elements for array: ");
		  int size = scan.nextInt();
		  String[] array1 = new String[size]; 
		  for (int i = 0; i < array1.length; i++) {
				
				System.out.print("Enter the value at index "+ i +" is: ");
				array1[i] = scan.next();
				
			}
		  
		 problem01(array1);

		System.out.println("problem02");
		System.out.print("please enter no of elements for array: ");
		int size2 = scan.nextInt(); 
		
		String[] a = new String[size2];
		for (int i = 0; i < a.length; i++) {
			
			System.out.print("Enter the value at index "+ i +" is: ");
			a[i] = scan.next();

		}
		System.out.println(problem02(a).toString());
	
		
		//Problem 03
		System.out.println("problem03");
		System.out.println("Enter the length of array");
		int size3 = scan.nextInt();
		int[] arr = new int[size3];
		System.out.println("Enter elements");
		for (int i = 0; i < size3; i++) {
			arr[i] = scan.nextInt();
		}

		System.out.println(problem03(arr));
		
		
		//Problem 04
		System.out.println("problem04");
		ArrayList<String> arr1 = new ArrayList<String>();
		
		System.out.println("Enter no of strings");
		int size4 = scan.nextInt();
		System.out.println("Enter strings");
		for (int i = 0; i < size4; i++) {
			arr1.add(scan.next());
			
		}
		
		System.out.println(problem04(arr1));

		
		//Problem 05
		System.out.println("problem05");
		System.out.println("Enter the no of strings");
		int size5 = scan.nextInt();
		
        ArrayList<String>list = new ArrayList<String>();
		
		System.out.println("Please enter strings");
		for (int i = 0; i < size5; i++) {
			list.add(scan.next());
			
		}
		System.out.println(problem05(list));
		
		//Problem 06
		System.out.println("problem06");
		System.out.println("Please number of strings");
		int size6 = scan.nextInt();
		ArrayList<String> arr3 = new ArrayList<String>();
		

		
		System.out.println("Enter each strings");
		for (int i = 0; i < size6; i++) {
			arr3.add(scan.next());
			
		}
		
		System.out.println(problem06(arr3));

		
	
	}
	
	
	
	//Problem 01
		private static void problem01(String[] a) {

				Map<String, Integer> frequencyMap = new LinkedHashMap<String,Integer>();
					 
			    for(String val: a) {
			       Integer i = frequencyMap.get(val);
			       if (i ==  null) {
			           i = 0;
			       }
			       frequencyMap.put(val, ++i);
			    } 
					
				System.out.println(frequencyMap.keySet().stream().map(k-> k+ "-" + frequencyMap.get(k)).collect(Collectors.joining(", ")));
			
			
		}

	
	//Problem 02
	private static Map<String,String> problem02(String[] p) {
		
		Map<String, String> map = new LinkedHashMap<String,String>();
		
		String a="";
		
		for(String val: p) {
			String charVal =val.charAt(0)+"";
			a=map.get(charVal)==null?val:map.get(charVal);
			if(map.containsKey(charVal)) {
				a+=val;
			}
			
			map.put(charVal, a);
		} 
		
		
		return map;
		
	}
	
	// Problem 03
	public static Set<Integer> problem03(int arr [])
	{
		

		Set<Integer> output= new LinkedHashSet<Integer>();
		
		int k =0;
		for(int i=0;i<arr.length;i++)
		{
			k++;
			int l =-1;
			for(int j=0;j<k;j++)
			{
				
				if(arr[j]==arr[i])
					l++;
				
			}
			
			output.add(arr[i]+l);			
		}
		return output;
		
}

	//Problem 04
	public static ArrayList<String> problem04(ArrayList<String> arr1)
	{
		
             ArrayList<String> Arr2 = new ArrayList<String>();
             
             for (int i=0;i<arr1.size();i++)
            	 
             {
            	 String text = "";
            	 
            	 for(char ch: arr1.get(i).toCharArray())
            	 {
            		 if(text.contains(ch+"")==false)
            			 text=text+ch+"";
            	 }
            	 Arr2.add(text.toString());
             }

		
		return Arr2;
		
		
	}

	
	
	//Problem 05
	public static Map<String,String> problem05 ( ArrayList<String> list)
	{
		Map<String,String> M2 = new LinkedHashMap<String,String>();
		
		for (String str : list) {
			
			M2.put(str.charAt(0)+"", str.charAt(str.length()-1)+"");
			
		}
		
		return M2;
	}
	
	//Problem 06
	public static Map <String,Boolean> problem06(ArrayList<String> arr3)
	{
		Map<String,Boolean> outputMap = new LinkedHashMap<String,Boolean>();
		
		
		for (int i=0;i<arr3.size();i++) {
			if(outputMap.containsKey(arr3.get(i)))
				outputMap.put(arr3.get(i), true);
			else
				outputMap.put(arr3.get(i), false);
				
		}
		
		return outputMap;
	}

	
}


