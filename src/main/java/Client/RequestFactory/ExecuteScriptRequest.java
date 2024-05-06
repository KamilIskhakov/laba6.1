package Client.RequestFactory;

import Controler.RequestFactoryDTO.ExecuteScriptRequestDTO;
import Controler.RequestFactoryDTO.RequestDTO;
import Controler.Exceptions.NotCorrectException;

public class ExecuteScriptRequest implements Request {
    private String filepath;
    @Override
    public RequestDTO reque(String args) throws NotCorrectException {
        if (args!=null){
            filepath = args;
            return new ExecuteScriptRequestDTO(filepath);
        }else{
            throw new NotCorrectException();
        }
    }

    public String getFilepath() {
        return filepath;
    }

}
