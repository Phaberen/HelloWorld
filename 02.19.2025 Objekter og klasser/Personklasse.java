public class Personklasse {

        String firstName;
        String lastName;
        String middleName;
        int age;

        public Personklasse(String firstName, String lastName, String middleName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.middleName = middleName;
            this.age = age;
    }

    public String fullNameandAge (){
            return "Personens fulde navn er: " + firstName + " " + middleName + " " + lastName + " " + "\n" + "Personens alder er: "+ age;
    }
    public String toString(){
            return fullNameandAge();
    }
}
