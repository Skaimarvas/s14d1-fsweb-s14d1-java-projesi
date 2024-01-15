import com.cylinder.inheritance.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("***********Circle**************");
        Circle circle1  = new Circle(3.75);
        System.out.println("Circle Radius: " + circle1.getRadius());
        System.out.println("Circle Area: " + circle1.getArea());
        System.out.println("***************Cylinder*****************");
        Cylinder cylinder1 = new Cylinder(5.55,7.25);
        System.out.println("Cylinder  Radius: " + cylinder1.getRadius());
        System.out.println("Cylinder  Height: " + cylinder1.getHeight());
        System.out.println("Cylinder  Area: " + cylinder1.getArea());
        System.out.println("Cylinder  Volume: " + cylinder1.getVolume());

        System.out.println("********Rectangle*******************");
        Rectangle rectangle1 = new Rectangle(5,10);
        System.out.println("Rectangle Area: " + rectangle1.getWidth());
        System.out.println("Rectangle Area: " + rectangle1.getLength());
        System.out.println("Rectangle Area: " + rectangle1.getArea());

        System.out.println("********Cuboid*******************");
        Cuboid cuboid1 = new Cuboid(5,10,5);
        System.out.println("Cuboid Width: " + cuboid1.getWidth());
        System.out.println("Cuboid Length: " + cuboid1.getLength());
        System.out.println("Cuboid Area: " + cuboid1.getArea());
        System.out.println("Cuboid Height: " + cuboid1.getHeight());
        System.out.println("Cuboid Volume: " + cuboid1.getVolume());


        System.out.println("*************Employeeee*******************");
        HRManager hrManager = new HRManager(1,"Karen", 30000);

        JuniorDeveloper junior = new JuniorDeveloper(565,"Rıfkı Çoban", 17000);
        SeniorDeveloper senior = new SeniorDeveloper(3,"Kamil Koç", 25000);
        MidDeveloper mid = new MidDeveloper(63, "Oblomov", 40000);

        hrManager.work();
        junior.work();
        senior.work();
        mid.work();

        hrManager.addEmployee(junior);
        hrManager.addEmployee(junior);
        hrManager.addEmployee(mid);
        hrManager.addEmployee(senior);

        //updatedSalary


        System.out.println("Salary is updated for: " + junior.getName() + "'s new salary is " + junior.getSalary());
        System.out.println("Salary is updated for: " + senior.getName() + "'s new salary is " + senior.getSalary());
        System.out.println("Salary is updated for: " + mid.getName() + "'s new salary is " + mid.getSalary());

    }
}