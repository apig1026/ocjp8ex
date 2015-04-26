package com.ajoshow.ocjp8ex.topic4;

import static org.junit.Assert.assertEquals;

import java.util.EnumSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.ajoshow.ocjp8ex.model.Person;
import com.ajoshow.ocjp8ex.model.Player;
import com.ajoshow.ocjp8ex.test.BaseTest;

public class CollectorEx extends BaseTest{

	@Override
	public Object withJava() {
		int total = 0;
		for(Player p : players){
			total += p.getAge();
		}
		return total;
	}

	@Override
	public void withJava8(Object expectedResult) {
		Integer total = players.stream().collect(new MyCollector());
		Integer total1 = players.stream().collect(new MyCollector2());
		Integer total2 = players.stream()
								.reduce(0, 
										(i, p) -> i += p.getAge(), 
										(left, right) -> left + right
										);
		Integer total3 = players.stream()
								.collect(Collectors.reducing(
										0,
										(p) -> p.getAge(),
										(left, right) -> left + right
										));
		assertEquals(expectedResult, total);
		assertEquals(expectedResult, total1);
		assertEquals(expectedResult, total2);
		assertEquals(expectedResult, total3);
	}
	

}

class MyCollector implements Collector<Person, Container, Integer>{

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		return EnumSet.of(Characteristics.UNORDERED);
	}

	@Override
	public Supplier<Container> supplier() {
		return () -> new Container();
	}

	@Override
	public BiConsumer<Container, Person> accumulator() {
		return (c, p) -> c.add(p.getAge());
	}

	@Override
	public BinaryOperator<Container> combiner() {
		return (left, right) -> left.merge(right);
	}

	@Override
	public Function<Container, Integer> finisher() {
		return (c) -> c.get();
	}
}

class MyCollector2 implements Collector<Person, Container, Integer>{

	@Override
	public Set<java.util.stream.Collector.Characteristics> characteristics() {
		return EnumSet.of(Characteristics.UNORDERED);
	}

	@Override
	public Supplier<Container> supplier() {
		return () -> new Container();
	}

	@Override
	public BiConsumer<Container, Person> accumulator() {
		return Container::add;
	}

	@Override
	public BinaryOperator<Container> combiner() {
		return Container::merge;
	}

	@Override
	public Function<Container, Integer> finisher() {
		return Container::get;
	}
	
}

class Container{
	private Integer n = 0;
	public void add(Integer n){
		this.n += n;
	}
	
	public void add(Person p){
		this.n += p.getAge();
	}
	
	public Integer get(){
		return n;
	}
	
	public Container merge(Container c){
		n += c.get();
		return this;
	}
}
