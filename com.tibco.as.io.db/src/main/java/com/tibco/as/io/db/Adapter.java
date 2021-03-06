package com.tibco.as.io.db;

import com.tibco.as.space.Member.DistributionRole;

public class Adapter {

	public static <T extends Enum<?>> String print(T value) {
		return value == null ? null : value.name().toLowerCase();
	}

	public static String parse(String name) {
		return name.toUpperCase();
	}

	public static String printDistributionRole(DistributionRole type) {
		return print(type);
	}

	public static DistributionRole parseDistributionRole(String name) {
		return DistributionRole.valueOf(parse(name));
	}

	public static String printDataType(JDBCType type) {
		return print(type);
	}

	public static JDBCType parseDataType(String name) {
		return JDBCType.valueOf(parse(name));
	}

}
