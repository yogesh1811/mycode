package DS.String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringGameV {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		    int t = input.nextInt();
		    for(int p=0;p<t;p++)
		    {
		        String str = input.next();
		        int k = input.nextInt();
		        //char[] arr = toCharArray(str);
		        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		        for(int i=0;i<str.length();i++)
		        {
		            if(!hm.containsKey(str.charAt(i)))
		                hm.put(str.charAt(i),1);
		            else
		            {
		                int count = hm.get(str.charAt(i));
		                hm.put(str.charAt(i),count+1);
		            }
		        }
		        while(k!=0)
		        {
		            char ch = maxnum(hm);
		            int count = hm.get(ch);
		            hm.put(ch,count-1);
		            k--;
		        }
		        int sum = 0;
		        for(Map.Entry<Character,Integer> map : hm.entrySet())
		        {
		            sum = sum + map.getValue()*map.getValue();
		        }
		        System.out.println(sum);
		    }
		}
		public static Character maxnum(HashMap<Character,Integer> hm)
		{
		    int max = Integer.MIN_VALUE;
		    char ch = 'a';
		    for(Map.Entry<Character,Integer> map : hm.entrySet())
		    {
		        if(map.getValue()>max)
		        {
		            max=map.getValue();
		            ch = map.getKey();
		        }
		    }
		    return ch;
		}

}
