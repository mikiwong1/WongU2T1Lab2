public class ChatBotRunner{
    public static void main(String[] args) {
        ChatBot debbie = new ChatBot("Debbie", 1);
        debbie.greeting("Miki");
        debbie.weather();

        double convert = debbie.convertFeetToMeters(5);
        System.out.println("Your converted number from feet is: " + convert + " meters");

        debbie.favoriteNumber(1);

        int numbers = debbie.addNumbers(1,2,3);
        System.out.println("The sum of your numbers is: " + numbers);

        debbie.age(15);

        int subtract = debbie.subtractNumbers(10,5);
        System.out.println("The difference of your numbers is: " + subtract);

        String goodbye = debbie.goodbye();
        System.out.println(goodbye);
    }

}
