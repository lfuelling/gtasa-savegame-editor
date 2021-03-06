package nl.paulinternet.gtasaveedit.cli.module;

public class ModuleExit implements Module {
    public String getName() {
        return "exit";
    }

    public String getDescription() {
        return "Exits the application";
    }

    public void execute(String[] args) throws Exception {
        System.exit(0);
    }
}