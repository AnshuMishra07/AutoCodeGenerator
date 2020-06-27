package com.auto.code.generator.specification;

import java.util.HashMap;

/**
 * @author Anshu Mishra
 *
 */
public class JavaType {
	private static HashMap<String, String> map = new HashMap<String, String>();
	static {
		map.put("String", "java.lang.String");
		map.put("string", "java.lang.String");
		map.put("Integer", "java.lang.Integer");
		map.put("integer", "java.lang.Integer");
		map.put("Double", "java.lang.Double");
		map.put("double", "java.lang.Double");
		map.put("Float", "java.lang.Float");
		map.put("float", "java.lang.Float");
		map.put("Long", "java.lang.Long");
		map.put("long", "java.lang.Long");
		map.put("Number", "java.lang.Integer");
		map.put("number", "java.lang.Integer");
		map.put("Alphanumeric", "java.lang.String");
		map.put("alphanumeric", "java.lang.String");
		map.put("Decimal", "java.math.BigDecimal");
		map.put("decimal", "java.math.BigDecimal");
		map.put("Money", "java.math.BigDecimal");
		map.put("money", "java.math.BigDecimal");
		map.put("Boolean", "java.lang.Boolean");
		map.put("boolean", "java.lang.Boolean");
		map.put("Array", "java.util.List");
		map.put("array", "java.util.List");
		map.put("List", "java.util.List");
		map.put("list", "java.util.List");
		map.put("Map", "java.util.Map");
		map.put("map", "java.util.Map");
		map.put("Object", "java.lang.Object");
		map.put("object", "java.lang.Object");
		map.put("YYYY-MM-DD", "java.time.LocalDate");
		map.put("yyyy-mm-dd", "java.time.LocalDate");
		map.put("date", "java.time.LocalDate");
		map.put("Date", "java.time.LocalDate");
		map.put("HH:MM:SS", "java.time.LocalDateTime");
		map.put("hh:mm:ss", "java.time.LocalDateTime");
		map.put("currency", "java.math.BigDecimal");
		map.put("Currency", "java.math.BigDecimal");
		map.put("0.00", "java.math.BigDecimal");

	}

	public static HashMap<String, String> getJavaType() {
		return map;

	}

}
