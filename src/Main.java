public class Main {
    public static void main(String[] args) {
        University university1 = new University();
        university1.setName("KNU");
        university1.setAdres("Jibek-Jolu");
        university1.setNumber(120);

        University university2 = new University();
        university2.setName("OSHMU");
        university2.setAdres("Kurmanjan-Datka");
        university2.setNumber(250);

        University university3 = new University();
        university3.setName("Fintex");
        university3.setAdres("Chuy");
        university3.setNumber(330);
        University[] universities = {university1, university2, university3};
        for (University university : universities) {
            System.out.println();
            System.out.println(university.getName());
            System.out.println(university.getAdres());
            System.out.println(university.getNumber());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        School school1 = new School();
        school1.setName("Peaksoft");
        school1.setAdres("Grajdanskay");
        school1.setNumber(119);

        School school2 = new School();
        school2.setName("Agaxan");
        school2.setAdres("Kurmanjan-Datka");
        school2.setNumber(180);

        School school3 = new School();
        school3.setName("OXFORD");
        school3.setAdres("Kievskay");
        school3.setNumber(220);
        School[] schools = {school1, school2, school3};
        for (School school : schools) {
            System.out.println();
            System.out.println(school.getName());
            System.out.println(school.getAdres());
            System.out.println(school.getNumber());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        Car car1 = new Car();
        car1.setName("Honda Fit");
        car1.setColor("Red");
        car1.setPrice(5000);

        Car car2 = new Car();
        car2.setName("Toyota Camry");
        car2.setColor("Wiht");
        car2.setPrice(8000);

        Car car3 = new Car();
        car3.setName("BMW");
        car3.setColor("Black");
        car3.setPrice(7000);
        Car [] cars = {car1,car2,car3};
        for (Car carr : cars) {
            System.out.println();
            System.out.println(carr.getName());
            System.out.println(carr.getColor());
            System.out.println(carr.getPrice());
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        Person person1 = new Person();
        person1.setFullname("Ilim Shabdanov");
        person1.setScool("Peaksoft");
        person1.setGroup("Java-8");

        Person person2 = new Person();
        person2.setFullname("Jenishbek Asangaziev");
        person2.setScool("Peaksoft");
        person2.setGroup("Java-8");

        Person person3 = new Person();
        person3.setFullname("Ishak Abduhamitov");
        person3.setScool("Peaksoft");
        person3.setGroup("Java-8");
        Person [] persons ={person1,person2,person3};
        for (Person person : persons) {
            System.out.println();
            System.out.println(person.getFullname());
            System.out.println(person.getScool());
            System.out.println(person.getGroup());
        }
    }
}