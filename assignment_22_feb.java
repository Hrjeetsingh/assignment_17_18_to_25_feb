//  1. Edit this code so the class Beagle is a subclass of the Dog class. When you run the code 
//  it should print “woof!” and then “arf arf”

class Dog
{
    public void speak()
    {
        System.out.println("woof!");
    }
    class Beagle
    {
        public void speak()
        {
            System.out.println("arf arf");
        }
    }

    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.speak();
        Dog b = new Beagle();
        b.speak();
    }
}
*/
//Add an equals method to this class that returns true if the current Dog and passed Dog have the same name. The code should print false twice then true twice.


class Dog
{
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public boolean equals(Object other)
    {
        
    }

    public static void main(String[] args)
    {
        Dog d1 = new Dog("Rufus");
        Dog d2 = new Dog("Sally");
        Dog d3 = new Dog("Rufus");
        Dog d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));
    }
}



abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
    class myclass extends Book{
        String mybook;
        abstract void names(String s);

        String getname(){
            return mybook;
        }
    }
    public static void main(String[] args) {
        Book new_novel=new Book(); 
        myclass mybooks=new myclass();

    }
}
