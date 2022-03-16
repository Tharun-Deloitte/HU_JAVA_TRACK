public class Main {
    public static void main(String[] args)
    {
        Area ar=new Area();
        ar.circle(5);
        ar.rectangle(2,3);
        ar.square(5);
        ar.triangle(5,3);


        Animal dog = new Animal();
        dog.setweight(25.4);
        dog.setheight(100);
        dog.setage(4);
        System.out.println(dog.getweight());
        System.out.println(dog.getheight());
        System.out.println(dog.getage());
    }
}
