package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();

        //setting value of the variables
        obj.setName("RRR");
        obj.setAge(19);
        obj.setRollNo(89);

        //displaying values of the variables
        System.out.println("Prime's name: " + obj.getName());
        System.out.println("Prime's age: " + obj.getAge());
        System.out.println("Prime's rollNo: " + obj.getRollNo());

        //direct access of rollno is not possible due to encapsulation

    }
}
