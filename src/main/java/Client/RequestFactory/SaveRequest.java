package Client.RequestFactory;

import Client.RequestFactoryDTO.RequestDTO;
import Client.RequestFactoryDTO.SaveRequestDTO;
import Controler.Exceptions.NotCorrectException;

public class SaveRequest implements Request {

    @Override
    public RequestDTO reque(String args) throws NotCorrectException {
        if (args==null){
            return new SaveRequestDTO();
        }else{
            throw new NotCorrectException();
        }

    }

}