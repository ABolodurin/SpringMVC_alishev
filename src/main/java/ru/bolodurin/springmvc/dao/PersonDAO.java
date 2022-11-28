package ru.bolodurin.springmvc.dao;

import org.springframework.stereotype.Component;
import ru.bolodurin.springmvc.models.Person;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private final List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Andrew",25, "Andrew@gmail.com" ));
        people.add(new Person(++PEOPLE_COUNT, "Jane", 18, "Jane@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Court", 55, "Court@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "John", 20, "John@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Anthony", 30, "Anthony@gmail.com"));
        people.add(new Person(++PEOPLE_COUNT, "Carl", 28, "Carl@gmail.com"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(new Person(0, "Person not found",0,"null"));
    }

    public void save(Person person) {
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }

    public void update(int id, Person updatedPerson) {
        Person personToBeUpdated = show(id);

        personToBeUpdated.setName(updatedPerson.getName());
        personToBeUpdated.setAge(updatedPerson.getAge());
        personToBeUpdated.setEmail(updatedPerson.getEmail());
    }

    public void delete(int id) {
        people.removeIf(person -> person.getId() == id);
    }
}
