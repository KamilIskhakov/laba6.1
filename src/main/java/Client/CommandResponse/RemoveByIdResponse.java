package Client.CommandResponse;

import Client.Client;
import Controler.RequestToServer.ServerResponse;

public class RemoveByIdResponse implements Response{
    @Override
    public void open(ServerResponse serverResponse) {
        Client.terminalOutput.printlnWellDoneCommandMessage();
    }
}
