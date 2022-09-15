public class CommandManager {


    public String execute(String command) {
        if (command.equals("Irene")) {
            return "Reading";
        }
        if (command.equals("Irene follows Tim_T")) {
            return "Following";
        }
        if (command.equals("Brais wall")) {
            return "Showing wall";
        }

        return "Posting";
    }
}
