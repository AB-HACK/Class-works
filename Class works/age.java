final class agedetector {
    public static void main(String[] args){
        scanner scanner = new scanner (System.ln);
        System.out.println ("Enter your age");

        int age = scanner.nextint();

        if (age < 18){
            System.out.println("use is a child");
        } else if (age < 65) {
            System.out.println("user is an adult");
        } else {
            System.out.println("you are a senior citizen");
        }
    }
}
