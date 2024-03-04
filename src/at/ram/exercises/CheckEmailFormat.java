package at.ram.exercises;

public class CheckEmailFormat {
    public static void main(String[] args) {

        String email = "dragan.nikolic@htldornbirn.at";

        if (email.matches(".*@.*\\w*.[a-zA-z]{2}")){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
