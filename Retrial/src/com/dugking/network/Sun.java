package com.dugking.network;


public class Sun {
	private Sun() {
	}

	private static Sun instance = new Sun();

	public static Sun getInstance() {
		return instance;
	}
}
