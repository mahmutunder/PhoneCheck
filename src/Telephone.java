public class Telephone {

	public static final int FORMATED_PHONE = 13;
	public static final int UNFORMATED_PHONE = 10;

	public boolean isFormated(String str) {

		boolean result;
		if (str.length() == FORMATED_PHONE && str.charAt(0) == '(' && str.charAt(4) == ')' && str.charAt(8) == '-') {
			result = true;
		} else {
			result = false;
		}
		return result;
	}

	public String unFormat(String str) {
		StringBuilder strb = new StringBuilder(str);

		if (isFormated(str)) {
			strb.deleteCharAt(0);
			strb.deleteCharAt(3);
			strb.deleteCharAt(6);
		}

		return strb.toString();

	}

	public String formated(String str) {

		StringBuilder strb = new StringBuilder(str);

		if (str.length() == UNFORMATED_PHONE) {
			strb.insert(0, "(");
			strb.insert(4, ")");
			strb.insert(8, "-");
		}

		return strb.toString();
	}
}
