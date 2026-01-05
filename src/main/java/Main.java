import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // TODO: Uncomment the code below to pass the first stage
        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.print("$ ");
            String input = scanner.next();

//            String[] parts = input.split(" ",2);
//            String command = parts[0];
//            String arguments = parts.length > 1 ? parts[1] :"";

            switch (input){
                case "exit" -> System.exit(0);
                case "echo" -> System.out.println(input = scanner.nextLine().trim());
                default -> System.err.printf("%s: command not found",input);
            }

        }
    }
}
