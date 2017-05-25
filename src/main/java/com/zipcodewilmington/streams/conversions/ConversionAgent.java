package com.zipcodewilmington.streams.conversions;

import com.zipcodewilmington.streams.anthropoid.Person;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author leon hunter
 * Created by leon on 5/25/17.
 * ConversionAgent is responsible for conversion between different collection types
 */
public abstract class ConversionAgent<T> {
    protected T people;

    public ConversionAgent(T val) {
        this.people = val;
    }

    abstract public List<Person> toList();

    abstract public Stream<Person> toStream();

    abstract public Person[] toArray();

    public Stream<Person> filter(Predicate<? super Person> predicate) {
        return toStream().filter(predicate);
    }

    public Stream<Person> flatMap(Function<? super Person, ? extends Stream<Person>> predicate) {
        return toStream().flatMap(predicate);
    }
}