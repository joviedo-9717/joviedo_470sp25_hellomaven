package edu.uscb.csci470sp25;

import org.apache.commons.lang3.StringUtils;

public class HelloMaven {
	public static void main(String[] args) {
		String message = "    Hello, Maven!    ";
		System.out.println(" Original: "+ message);
		System.out.println(" Trimmed: " + StringUtils.trim(message));
	}
}
