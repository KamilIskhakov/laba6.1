package Controler.Commands;

import Client.Main;
import CollectionObjects.Person;
import Controler.ShellPersonParametrs;
import DAO.IOManager;

public class AddCommand implements Command {
    private IOManager ioManager;
    private ShellPersonParametrs shellPersonParametrs;
    public AddCommand(IOManager ioManager, ShellPersonParametrs shellPersonParametrs){
        this.ioManager = ioManager;
        this.shellPersonParametrs = shellPersonParametrs;
    }
    @Override
    public String getDescription() {
        return "lolkekazaza";
    }

    @Override
    public String getName() {
        return "sss";
    }

    @Override
    public void execute(String argument) {
        if (Main.script){
            Person per = new Person(
                    shellPersonParametrs.askNameScript(),
                    shellPersonParametrs.askCoordinatesScript(),
                    shellPersonParametrs.askHeightScript(),
                    shellPersonParametrs.askWeightScript(),
                    shellPersonParametrs.askColorScript(),
                    shellPersonParametrs.askCountryScript(),
                    shellPersonParametrs.askLocationScript());
            per.setId(ioManager.generateId());
            ioManager.addToCollection(per);
        }
        else {
            Person per = new Person(
                    shellPersonParametrs.askNameConsole(),
                    shellPersonParametrs.askCoordinatesConsole(),
                    shellPersonParametrs.askHeightConsole(),
                    shellPersonParametrs.askWeightConsole(),
                    shellPersonParametrs.askColorConsole(),
                    shellPersonParametrs.askCountryConsole(),
                    shellPersonParametrs.askLocationConsole()
            );
            per.setId(ioManager.generateId());
            ioManager.addToCollection(per);
        }
    }
}