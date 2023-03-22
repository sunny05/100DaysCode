package coding.leetCode;


import java.util.HashMap;
import java.util.Map;

public class MessageDecode {
    public static String decodeMessage(String key,String msg) {
    	Map<Character,Character> map=new HashMap<>();
    	
    	char c=97;
    	for(char ch:key.toCharArray()){
    		if(ch==' ')
    			continue;
    		if(!map.containsKey(ch)) {
    			map.put(ch, c);
    			c++;
    		}
    	}
    	System.out.print(map);
    	StringBuilder sb=new StringBuilder();
    	for(char ch:msg.toCharArray()) {
    		if(ch == ' ')
    			sb.append(' ');
    		else
    			sb.append(map.get(ch));
    	}
    	System.out.println("=================");
    	//System.out.print(sb);
    	return sb.toString();
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="the quick brown fox jumps over the lazy dog";
		String msg="vkbs bs t suepuv";
		
		System.out.print(decodeMessage(key,msg));

	}

}
