//Java Program to demonstrate the working of a banking-system  
class Account
{
 int acc_no;
 String name;
 float amount;

void insert (int a,String n, float amt)
{
 acc_no=a;
 name=n;
 amount=amt;
}
void deposit(float amt)
{
 amount=amount+amt;
 System.out.println(amt+ "is deposited");

}

void withdraw(float amt)
{
 if(amount<amt){
 System.out.println("You don't have sufficient balence");
}else
amount=amount-amt;
System.out.println(amt+ "withdrawn");
}

void checkbalence(){System.out.println("balence is" +amount);}
void display(){System.out.println(acc_no+ " "+name+" "+amount);}

}

class TestAccount
{
 public static void main(String []args)
{
 
Account a1=new Account();
a1.insert(121,"Gouri",90000);
a1.display();
a1.checkbalence();
a1.deposit(10000);
a1.checkbalence();
a1.withdraw(30000);
a1.checkbalence();

}
}
