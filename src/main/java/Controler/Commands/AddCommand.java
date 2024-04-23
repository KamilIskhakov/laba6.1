package Controler.Commands;

import CollectionObjects.Person;
import Controler.Command;
import Controler.RequestToServer.ExecuteCode;
import Controler.RequestToServer.ServerResponse;
import Server.Server;
import Server.ServerEntryPoint;

public class AddCommand implements Command {
    private Person person;

    public AddCommand(Person person){
        this.person = person;
    }

    @Override
    public String getDescription() {
        return getName() + "добавляет новый объект в конец коллекции";
    }

    @Override
    public String getName() {
        return "add ";
    }

    @Override
    public ServerResponse execute(){
        Server.collectionManager.addToCollection(person);
        return new ServerResponse(ExecuteCode.SUCCESS);
    }
}
