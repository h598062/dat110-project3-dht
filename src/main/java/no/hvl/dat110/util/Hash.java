package no.hvl.dat110.util;

/**
 * exercise/demo purpose in dat110
 *
 * @author tdoy
 */

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Hash {


	public static BigInteger hashOf(String entity) {

		BigInteger hashint = null;

		// Task: Hash a given string using MD5 and return the result as a BigInteger.

		// we use MD5 with 128 bits digest

		// compute the hash of the input 'entity'

		// convert the hash into hex format

		// convert the hex into BigInteger

		// return the BigInteger

		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] bytes = md.digest(entity.getBytes());
			hashint = new BigInteger(1, bytes);
		} catch (NoSuchAlgorithmException e) {
			throw new RuntimeException(e);
		}
		return hashint;
	}

	public static BigInteger addressSize() {

		// Task: compute the address size of MD5

		// compute the number of bits = bitSize()

		// compute the address size = 2 ^ number of bits

		// return the address size

		return new BigInteger("340282366920938463463374607431768211456");
	}

	public static int bitSize() {
		return 128;
	}

	public static String toHex(byte[] digest) {
		StringBuilder strbuilder = new StringBuilder();
		for (byte b : digest) {
			strbuilder.append(String.format("%02x", b & 0xff));
		}
		return strbuilder.toString();
	}

}
