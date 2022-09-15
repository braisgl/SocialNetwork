public class SocialNetwork {

    CommandManager commandManager = new CommandManager();

    public String execute(String command){

        Command commands = commandManager.getCommand(command);
        return commands.execute();
    }
}
