import java.util.*;
import java.lang.NumberFormatException;

public class ValidatorIpv4 {
	
	public static boolean isIPv4(String inputString) {
		String[] tempString = inputString.split(".");
		if (tempString.length == 4) {
			for(int i = 0; i < tempString.length; i++) {
				try {
					if (Integer.parseInt(tempString[i]) <= 255 && Integer.parseInt(tempString[i]) >= 0) {
						continue;
					} else {
						return false;
					}
				} catch (NumberFormatException e) {
					return false;
				}
			}
			return true;
		}
		
		return false;
	}

}
