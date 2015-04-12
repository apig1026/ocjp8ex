package com.ajoshow.ocjp8ex.topic6;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileImproveEx {

	public static void main(String... args) throws IOException {

		Path start = new File(".").toPath();
		BiPredicate<Path, BasicFileAttributes> topicDirectoriesMatcher = (path,
				basicFileAttributes) -> basicFileAttributes.isDirectory()
				&& path.toString().contains("topic6");

		System.out.println("Found directories:");
		Stream<Path> pathStream = Files.find(start, Integer.MAX_VALUE,
				topicDirectoriesMatcher);
		pathStream.forEach(System.out::println);

		List<Path> paths = Files.walk(start)
				.filter(p -> p.toString().contains("FileImproveEx.java"))
				.collect(Collectors.toList());
		System.out.println("\nFile path: " + paths.get(0));

		System.out.println("\nFile content: ");
		Files.lines(paths.get(0), Charset.defaultCharset()).forEach(
				System.out::println);

	}
}
