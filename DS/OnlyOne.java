package DS;

public class OnlyOne {

	private static OnlyOne INSTANCE = null;

	public static OnlyOne getInstance() {
		if (INSTANCE == null) {
			synchronized (OnlyOne.class) {
				if (INSTANCE == null) {
					INSTANCE = new OnlyOne();
				}
			}
		}
		return INSTANCE;
	}

	private OnlyOne() {
	}

}
