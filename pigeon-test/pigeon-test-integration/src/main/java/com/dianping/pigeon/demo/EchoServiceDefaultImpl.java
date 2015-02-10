/**
 * Dianping.com Inc.
 * Copyright (c) 2003-2013 All Rights Reserved.
 */
package com.dianping.pigeon.demo;

import java.util.ArrayList;
import java.util.List;

public class EchoServiceDefaultImpl implements EchoService {

	List<User> users = new ArrayList<User>();

	public EchoServiceDefaultImpl() {
		for (int i = 1; i <= 10000; i++) {
			String n = "a" + i;
			User u = new User(i, n, n + "@dianping.com", n + "@hongkou district, shanghai", 20);
			users.add(u);
		}
	}

	@Override
	public String echo(String input) {
		return "echo:" + input;
	}

	@Override
	public long now() {
		return System.currentTimeMillis();
	}

	@Override
	public List<User> findUsers(int count) {
		// return Lists.newArrayList(users.subList(0, count));
		return users.subList(0, count);
	}

}