
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length == 1) {
			if(ValidatorIpv4.isIPv4(args[0])) {
				System.out.println(args[0] + " este IPv4.");
			}
			else if(ValidatorIpv6.isIpv6(args[0])) {
				System.out.println(args[0] + " este IPv6.");
			} else {
				System.out.println("Adresa invalida!");
			}
		} else {
			System.out.println("Nu ati introdus adresa IP! Closing..");
		}
		

	}

}
