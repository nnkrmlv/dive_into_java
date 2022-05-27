
// Если на вход пришло "Инна", то вывести "Hello Inna!"
// Если на вход пришло "Саша", то вывести "Hi Sasha!"
// Если на вход пришло не Инна и не Саша, вывести "I don't know you."

class Greater {
    public static String hello(String name) {
        return "Hello" + " " + name + "!";
    }

    public static String nameCheck(String name) {
        if (name.equals("Inna")) {
            return "Hello" + " " + name + "!";
        } else if (name.equals("Sasha")) {
            return "Hi" + " " + name + "!";
        } else {
            return "I don't know you.";
        }
    }
}
