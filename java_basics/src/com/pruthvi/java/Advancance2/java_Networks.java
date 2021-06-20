package com.pruthvi.java.Advancance2;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class java_Networks {

	// Inet4Address is used for IPV4 addresses
	// Inet6Address is used for IPV6 addresses
	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		String url = "www.youtube.com";
		InetAddress inetAddress = Inet4Address.getByName(url);
		// above stat returns inetaddress obj if url is correct

		System.out.println("Networking Supports provided by java");
		System.out.println("Lets have info about the URL");
		// returns the address in array format
		System.out.println("1 Address :" + Arrays.toString(inetAddress.getAddress()));
		System.out.println();
		// getHostAddress() -->returns the host address
		System.out.println("2 Host Address :" + inetAddress.getHostAddress());
		System.out.println("above both results same but different format");
		System.out.println();

		// check id inetAddress is wildcard address (boolean)
		System.out.println("3 Is Any Local Address :" + inetAddress.isAnyLocalAddress());
		System.out.println();
		// isLinkLocalAddress()-> utility routine to check if the inetaddress is an link
		// local address
		System.out.println("4 Check if address is an link local address :" + inetAddress.isLinkLocalAddress());

		System.out.println();
		// isLoopbackAddress() --> check if the address is a loopback address
		System.out.println("5 Is loop back Address :" + inetAddress.isLoopbackAddress());

		// hashcode() --> hashcode of inetaddress
		System.out.println();
		System.out.println("6 Hash code of InetAddress :" + inetAddress.hashCode());

		System.out.println("there many functions on which you can perform lot operations (offical documentaion)");

	}

}
