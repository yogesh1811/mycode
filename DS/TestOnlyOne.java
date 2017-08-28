package DS;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestOnlyOne {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		OnlyOne a = OnlyOne.getInstance();
		
		Class<OnlyOne> clazz = (Class<OnlyOne>) Class.forName("DS.OnlyOne");
		Constructor[] contr = clazz.getConstructors();
		
		contr[0].setAccessible(true);
		
		OnlyOne b = (OnlyOne) contr[0].newInstance();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());

	}

}
