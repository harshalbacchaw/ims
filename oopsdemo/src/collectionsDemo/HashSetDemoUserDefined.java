package collectionsDemo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemoUserDefined {
	Set<Custumer> customers;
    
    public HashSetDemoUserDefined() {
        System.out.println("HashSet with Customer Object");
        customers= new HashSet<>();
    }

 

    void addCustomer()
    {
        // add new Customer Object to set
        customers.add(new Custumer(101,"Arun","Bengaluru"));
        customers.add(new Custumer(102,"Mike","Newyork"));
        customers.add(new Custumer(103,"John","Sydney"));
        customers.add(new Custumer(104,"Hari","Delhi"));
        customers.add(new Custumer(105,"Navi","Mumbai"));
    }
    
    void appendCustomer()
    {
        // add duplicate customer    
        /*
                HashSet will use the `equals()` & `hashCode()` implementations 
                of the Customer class to check for duplicates and ignore them
         */
        customers.add(new Custumer(103,"John","Sydney"));
    }
    
    void displayCustomers()
    {
        System.out.println(" ********* Customer List *****************");
        for(Custumer i:customers)
        {
            System.out.println(i.getId()+" "+i.getName()+" "+i.getCity());
        }
    }
	public static void main(String[] args) {
		HashSetDemoUserDefined custHset =new HashSetDemoUserDefined();
	       
        custHset.addCustomer();
        custHset.appendCustomer();
        custHset.displayCustomers();
	}

}
