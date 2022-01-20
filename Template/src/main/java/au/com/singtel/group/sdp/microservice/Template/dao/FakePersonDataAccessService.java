package au.com.singtel.group.sdp.microservice.Template.dao;

import au.com.singtel.group.sdp.microservice.Template.model.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component("fakeDao")
public class FakePersonDataAccessService implements PersonDao{

   private static List<Person> DB = new ArrayList<>();

   @Override
    public int insertPerson(UUID id, Person person) {
       DB.add(new Person(id, person.getName()));
       return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return DB;
    }
}
