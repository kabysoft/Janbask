package Encapsulation;

public class AccesEncapsulation {
    public static void main(String[] args) {

        Encapsulation encap = new Encapsulation();
        encap.setName("Salah");
        encap.setAge(42);
        encap.setGender('m');
encap.getName();
encap.getAge();
encap.getGender();
        System.out.println(encap.getName());
        System.out.println(encap.getAge());
        System.out.println(encap.getGender());
    }
}
