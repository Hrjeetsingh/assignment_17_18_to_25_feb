

//Overriding
//1. Override the taste method from the Candy class in the Chocolate class to return 
//  “tastes chocolately”. It should print “tastes sweet!” and then “tastes chocolately”.
 class Candy
    {
        public String taste()
        {
            return "tastes sweet!";
        }
    
        public static void main(String[] args)
        {
            Candy c1 = new Candy();
            System.out.println(c1.taste());
            Candy c2 = new Chocolate();
            System.out.println(c2.taste());
        }
    }
    
    class Chocolate extends Candy
    {
        // ADD CODE HERE
    @Override
    public String taste()
        {
            return "tastes chocolately ";
        }
    }
    
//2. When a subclass inherits from a superclass, it also inherits its methods; however, it can also override the superclass methods (as well as declare and implement new ones). Consider the following Sports class:
    class Sports{
        String getName(){
            return "Generic Sports";
        }
        void getNumberOfTeamMembers(){
            System.out.println( "Each team has n players in " + getName() );
        }
    }
    class Soccer extends Sports{
        @Override
        String getName(){
            return "Soccer Class";
        }
        @Override
        void getNumberOfTeamMembers(){

            System.out.println( "Each team has 11 players in " + getName() );
        }
        public static void main(String[] args) {
            //getName();
            //getNumberOfTeamMembers();
        }
    }
    
    
//Overloading:
//  3  Write a method that overloads the talk method by taking in a name and printing “Hello” with that name.
    
 class Test1
    {
        public static void talk()
        {
              System.out.println("hello there!");
        }
        public static void talk(String name){
            System.out.println("Hello "+name);
        }
    
        public static void main(String[] args)
        {
            talk("Matthew");
              
        }
    }
    