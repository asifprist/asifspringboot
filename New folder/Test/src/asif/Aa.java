package asif;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Aa {

	public static void main(String[] args) {
		List<String> l = Arrays.asList("Python","Java","python");
		Map<String, Integer> collect = l.stream().collect(Collectors.toMap(Function.identity(), String::length));
System.out.println(collect);
	}

}
