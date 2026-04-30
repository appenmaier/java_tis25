package model;

/**
 * Immutable data record representing a person.
 *
 * @param name    the full name of the person
 * @param age     the age of the person in years
 * @param gender  the gender of the person ({@code 'm'}, {@code 'w'}, or {@code 'd'})
 * @param isHappy whether the person is currently happy
 * @author Daniel Appenmaier
 * @version 1.0
 */
public record Person(String name, int age, char gender, boolean isHappy) {

}
