package Client.RequestFactory;

import Client.Client;
import Controler.RequestFactoryDTO.RequestDTO;
import Controler.RequestFactoryDTO.UpdateRequestDTO;
import Controler.CollectionObjects.Person;
import Controler.Exceptions.NotCorrectException;

public class UpdateRequest implements Request {
    private Person person;
    private Integer id;
    @Override
    public RequestDTO reque(String args) throws NotCorrectException {
        if (args!=null){
            try{
                id = Integer.parseInt(args);
            }catch (Exception e){
                throw new NotCorrectException();
            }
            this.person = Client.terminalManager.MakeMePerson();
            return new UpdateRequestDTO(person,id);
        }else{
            throw new NotCorrectException();
        }
    }
    public Person getPerson() {
        return person;
    }
    public Integer getId() {
        return id;
    }

}
