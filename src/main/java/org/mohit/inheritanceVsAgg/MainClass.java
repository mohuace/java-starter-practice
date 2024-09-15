package org.mohit.inheritanceVsAgg;

public class MainClass {
    public static void main(String[] args) {
        //Here we created the employee
        //Problem with this approach is with Roles, it might seem that IS-A relationship
        //is the right choice, but it is not.
        //This is because Roles keep changing. Now, we have assigned emp1 to be a Cashier
        //what if he is promoted to a manager?
        //Will have to do something like emp1 = new InhManager(1);
        //This can cause issues like data loss, confusion, not knowing the history of employee, etc and its not a good
        //design choice. All the properties that might be set for the employee will be lost and have to be
        //set again because essentially you are creating a new object.
        // Inheritance is good when Child class is ALWAYS a subtype of the parent
        //class and their relationship is fixed. For eg: Vehicle and Car, Vehicle and Bike
        //We know Car will always be a Car and not become a Bike anytime in the object
        //lifetime.
        InhEmployee emp1 = new InhCashier(1);


        //In aggregation,
        //here advantage is that employee is decoupled with role.
        //meaning when the role changes, we just change the role object
        //which is an attribute inside the employee. The employee object
        //stays intact and the id, name is not changed. Its the same object,
        //just the role attribute is getting changed.
        //This is a more flexible approach as it allows for dynamic roles without
        //worrying about data loss.
        Role cashier = new AggCashier();
        Role manager = new AggManager();

        AggEmployee emp2 = new AggEmployee(1, "mohit", cashier);
        emp2.getRole();

        emp2.setRole(manager);
        emp2.getRole();

    }
}
