package Client.RequestFactory;

import Client.RequestFactoryDTO.ClearRequestDTO;
import Client.RequestFactoryDTO.RequestDTO;
import Controler.Exceptions.NotCorrectException;

public class ClearRequest implements Request {
    @Override
    public RequestDTO reque(String args) throws NotCorrectException {
        if (args==null){
            return new ClearRequestDTO();
        }else{
            throw new NotCorrectException();
        }
    }
}