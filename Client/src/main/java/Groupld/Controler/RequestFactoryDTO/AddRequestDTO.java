package Groupld.Controler.RequestFactoryDTO;
import Groupld.Controler.CollectionObjects.Person;

public class AddRequestDTO implements RequestDTO {
    private Person person;
    public AddRequestDTO(Person person){
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

}
