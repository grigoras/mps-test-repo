import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatorIpv6 {
	public static boolean isIpv6(String address)
	{
		Pattern p = Pattern.compile("([0-9A-F]{4}:){7}[0-9A-F]{4}");
//		Pattern p = Pattern.compile("([0-9A-F]{4}:){11}");
		Matcher m = p.matcher(address);
		
		return m.matches();
	}
}
