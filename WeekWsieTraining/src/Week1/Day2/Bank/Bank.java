package Week1.Day2.Bank;// package Bank;

class Account{
  public String name;
  protected String email;
  private String password;

//   Getters & setters -- to access private
        public String getPassword(){
            return this.password;
        }

        public void setPassword(String pwd){
            this.password = pwd;
        }

}

public class Bank {
	public static void main(String[] args) {
        Account account1 = new Account();
        account1.name ="Customer 1";
        account1.email = "customer@gmail.com";
        // account1.password = "kfjejie";
        account1.setPassword("Abc@123");
        System.out.println(account1.getPassword());
    }
}
