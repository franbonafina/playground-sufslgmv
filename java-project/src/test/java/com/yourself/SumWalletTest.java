package com.yourself;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class SumWalletTest {

	@Test
	public void test() throws FileNotFoundException {
		try {
			Assert.assertEquals("Ejecutando la suma del dinero...", 6, SumWallet.sum(5,1));
			success(true);

		} catch (AssertionError ae) {
			success(false);
			msg("Oops! 🐞", ae.getMessage());
			msg("Hint 💡", "A o B representan cualquier número, escribiste el simbolo de suma "+"? 🤔");
		}
	}

	private static void msg(String channel, String msg) {
		System.out.println(String.format("TECHIO> message --channel \"%s\" \"%s\"", channel, msg));
	}

	private static void success(boolean success) {
		System.out.println(String.format("TECHIO> success %s", success));
	}
}
