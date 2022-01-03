import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String varName, dataType;

        if (args == null || args.length == 0) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.println("-----You can pass command line args in the order VARIABLE_NAME DATA_TYPE to make things quick!------");
            System.out.println("---------------------Try multiple variables at once by passing them alternately---------------------");
            System.out.println("--------------------------For eg: java Main String name String value int i--------------------------");
            System.out.println("----------------------------------------------------------------------------------------------------");

            System.out.print("Enter data type: ");
            dataType = scanner.next().trim();

            System.out.print("Enter variable name: ");
            varName = scanner.next().trim();

            System.out.println(generateGetterAndSetter(varName, dataType));

        } else {

            for (int i = 0; i < args.length; i++) {

                try {

                    System.out.println(generateGetterAndSetter(args[i], args[++i]));

                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("An element missing! Skipping the last variable");
                    break;
                }

            }
        }
    }

    private static String generateGetterAndSetter(String dataType, String varName) {
        String getter =
                "\tpublic " + dataType + " get" + Character.toUpperCase(varName.charAt(0)) + varName.substring(1) +
                        "() {\n\t\treturn " + varName + ";\n\t}";
        String setter = "\tpublic void set" + Character.toUpperCase(varName.charAt(0)) + varName.substring(1) +
                "() {\n\t\tthis." + varName + " = " + varName + ";\n\t}";

        return getter + "\n\n" + setter;
    }
}