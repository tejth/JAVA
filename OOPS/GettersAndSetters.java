//TO ACESS PRIVATE MEMBERS.

class Account{
    private String password;


    public String getPassword(){
        return this.password;
    }
    public void setPassword(String pass){
        this.password=pass;
    }
}
public class GettersAndSetters {
     public static void main(String args[]){
        Account obj = new Account();
        obj.setPassword("abcd");
        System.out.println(obj.getPassword());
     }
}
