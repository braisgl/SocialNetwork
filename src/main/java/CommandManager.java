public class CommandManager {


    public Command getCommand(String command) {
        if (command.equals("Irene")) {
            return new Reading();
        }
        if (command.equals("Irene follows Tim_T")) {
            return new Following();
//            return "Following";
        }
        if (command.equals("Brais wall")) {
            return new Showing();
//            return "Showing wall";
        }
        return new Posting();
//        return "Posting";

    }
}
