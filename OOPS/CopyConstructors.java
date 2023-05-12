//IN JAVA ALL COPY CONSTRUCTORS ARE USER DEFINED.

 class Studentss{
    String name;
    int age;

    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Studentss(Studentss s2){                   //COPY CONSTRUCTOR.
         this.name=s2.name;                                //Student 2 ke sare information ko copy krke apne current objects ke andr dalrhahai.
        this.age=s2.age;
        }
    
        Studentss(){
            
        }

 }

public class CopyConstructors {
      public static void main(String args[]){
        Studentss s1 = new Studentss();
        s1.name="Tejendra";
        s1.age=28;

        Studentss s2 = new Studentss(s1);   //s1 ke properties ko s2 mai assign krdia
        s2.printinfo();
        
      }    
}
