public class Person {
   private String name;
   
   public Person(String n) {
      this.name = n;
   }
   
   public String toString() {
      return name;
   }
}

class Student extends Person {
   private int id;
   
   public Student(String n, int id) {
      super(n);
      this.id = id;
   }
   
   public String toString() {
      return super.toString() + ", ID: "  + id;
   }
}

class Age extends Person {
   private int age;
   
   public Age (String n, int yearBorn) {
      super(n);
      this.age = 2019 - yearBorn;
   }
   
   public String toString() {
      return super.toString() + ", " + age + " years lived.";
   }  
}

class Tester {
   public static void main (String [] args) {
      
      Person p =  new Person ("Clarissa");
      
      // p.name = "Not Clarissa";    //Causes error. Variable 'name' is set to private
      
      System.out.println(p);
      
      Person s = new Student("Jose", 12345);
      System.out.println(s);
      
      Age a = new Age("Jeremy", 1997);
      System.out.println(a);
   }
}
