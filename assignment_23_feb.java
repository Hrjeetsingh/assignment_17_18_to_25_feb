//create class Animal with various variables and methods in it to demonstrate
//- create multiples objects like dog, cat, cow, elephant etc and demonstrate various approaches to assign values to variables
//- auto generate getters and setters
//- demonstrate constructor chaining and create objects by passing no values, lesser value and more values
//-create static variable age and create a static method inside class named incrementAge() 
//and inside increment the age whenever this method called (please keep break pointer and 
//check what happens and value inside this method when you call from different objects



class Animal {
    int eye;
    int legs;
    String name;
    String voice;
    String weight;

    static int age;

    public Animal() {
    }

    public int getEye() {
        return eye;
    }

    public void setEye(int eye) {
        this.eye = eye;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
    public String getWeight(){
        return weight;
    }
    public void setWeight(String weight){
        this.weight=weight;
    }

    //  -create static variable age and create a static method inside class named incrementAge() 
    //  and inside increment the age whenever this method called (please keep break pointer and 
    //  check what happens and value inside this method when you call from different objects

    static int incrementAge(){
        age++;
    }

    public static void main(String[] args) {

        Animal cow=new Animal();
        cow.setEye(2);
        cow.setLegs(4);
        cow.setName("cow");
        cow.setVoice("bow.. bow..");
        System.out.println(cow);
        Animal dog=new Animal();
        dog.setEye(2);
        dog.setLegs(4);
        dog.setVoice("bark");
        dog.setWeight("low");
        System.out.println(dog);
        Animal elephant=new Animal();
        elephant.setEye(2);
        elephant.setLegs(4);
        elephant.setWeight("high");
        System.out.println(elephant);

        //Animal ages=new Animal();
        //int ageincre=ages.incrementAge();
        //System.out.println(ageincre);
        Animal.incrementAge();

    }
}
