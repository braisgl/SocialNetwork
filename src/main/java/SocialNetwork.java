public class SocialNetwork {

    CommandManager commandManager = new CommandManager();

    public String execute(String command){
        return commandManager.execute(command);
    }
}
