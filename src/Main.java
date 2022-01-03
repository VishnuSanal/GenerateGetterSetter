import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String varName, dataType;

        if (args == null || args.length == 0) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("PS: Pass command line args in the order VARIABLE_NAME DATA_TYPE to make things quick!");

            System.out.print("Enter variable name: ");
            varName = scanner.next().trim();

            System.out.print("Enter data type: ");
            dataType = scanner.next().trim();

        } else {

            varName = args[0].trim();
            dataType = args[1].trim();

        }

        String getter =
                "\tpublic " + dataType + " get" + Character.toUpperCase(varName.charAt(0)) + varName.substring(1) +
                        "() {\n\t\treturn " + varName + ";\n\t}";
        String setter = "\tpublic void set" + Character.toUpperCase(varName.charAt(0)) + varName.substring(1) +
                "() {\n\t\tthis." + varName + " = " + varName + ";\n\t}";

        System.out.println(getter);
        System.out.println();
        System.out.println(setter);

    }
}