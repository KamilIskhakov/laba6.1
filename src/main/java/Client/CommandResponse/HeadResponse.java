package Client.CommandResponse;

import Client.Client;
import Controler.ChannelClientServerUtil.ServerResponse;

public class HeadResponse implements Response{
    @Override
    public void open(ServerResponse serverResponse) {
        Client.terminalOutput.printlnWellDoneCommandMessage();
        Client.terminalOutput.println(serverResponse.getMessage());
    }
}
