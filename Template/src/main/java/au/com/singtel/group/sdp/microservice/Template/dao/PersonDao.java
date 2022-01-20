package au.com.singtel.group.sdp.microservice.Template.dao;

import au.com.singtel.group.sdp.microservice.Template.model.Person;

import java.util.List;
import java.util.UUID;

public interface PersonDao {
    //mocking database
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();
}
