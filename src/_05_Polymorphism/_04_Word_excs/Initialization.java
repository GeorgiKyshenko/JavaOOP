package _05_Polymorphism._04_Word_excs;

public class Initialization {

    public static CommandInterface buildCommandInterface(StringBuilder text) {
         CommandInterface command = new AdvancedCommandInterface(text);
         command.init();

         return command;
    }
}
