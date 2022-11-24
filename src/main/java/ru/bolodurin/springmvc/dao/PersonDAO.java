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
        people.add(new Person(++PEOPLE_COUNT, "Andrew"));
        people.add(new Person(++PEOPLE_COUNT, "Jane"));
        people.add(new Person(++PEOPLE_COUNT, "Court"));
        people.add(new Person(++PEOPLE_COUNT, "John"));
        people.add(new Person(++PEOPLE_COUNT, "Anthony"));
        people.add(new Person(++PEOPLE_COUNT, "Carl"));
    }

    public List<Person> index(){
        return people;
    }

    public Person show(int id){
        return people.stream()
                .filter(person -> person.getId() == id)
                .findAny()
                .orElse(new Person(0, "Person not found"));
    }

    public void save(Person person){
        person.setId(++PEOPLE_COUNT);
        people.add(person);
    }
}
