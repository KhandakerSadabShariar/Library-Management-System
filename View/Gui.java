public class Gui extends main{
  
   Library lib = Library.getInstance();
        
        // Setting some by default information like name of library ,fine, deadline and limit of hold request
        lib.setFine(20);
        lib.setRequestExpiry(7);
        lib.setReturnDeadline(5);
        lib.setName("FAST Library");
        
        // Making connection with Database.
        Connection con = lib.makeConnection();
        
        if (con == null)    // Oops can't connnect !
        {
            System.out.println("\nError connecting to Database. Exiting.");
            return;
        }
        
        try {

        lib.populateLibrary(con);   // Populating Library with all Records
         
        boolean stop = false;
        while(!stop)
        {   
            clrscr();

            // FRONT END //
            System.out.println("--------------------------------------------------------");
            System.out.println("\tWelcome to Library Management System");
            System.out.println("--------------------------------------------------------");
            
            System.out.println("Following Functionalities are available: \n");
            System.out.println("1- Login");
            System.out.println("2- Exit");
            System.out.println("3- Admininstrative Functions"); // Administration has access only 
            
            System.out.println("-----------------------------------------\n");        
            
            int choice = 0;

            choice = takeInput(0,4);
            
            if (choice == 3)
            {                   
                System.out.println("\nEnter Password: ");
                String aPass = admin.next();
                
                if(aPass.equals("lib"))
                {
                    while (true)    // Way to Admin Portal
                    {
                        clrscr();

                        System.out.println("--------------------------------------------------------");
                        System.out.println("\tWelcome to Admin's Portal");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Following Functionalities are available: \n");

                        System.out.println("1- Add Clerk");
                        System.out.println("2- Add Librarian"); 
                        System.out.println("3- View Issued Books History");  
                        System.out.println("4- View All Books in Library"); 
                        System.out.println("5- Logout"); 

                        System.out.println("---------------------------------------------");

                        choice = takeInput(0,6);

                        if (choice == 5)
                            break;

                        if (choice == 1)
                            lib.createPerson('c');
                        else if (choice == 2)
                            lib.createPerson('l');

                        else if (choice == 3)
                            lib.viewHistory();

                        else if (choice == 4)
                            lib.viewAllBooks();
                        
                        System.out.println("\nPress any key to continue..\n");
                        admin.next();                        
                    }
                }
                else
                    System.out.println("\nSorry! Wrong Password.");
            }
 
            else if (choice == 1)
            {
                Person person = lib.login();

                if (person == null){}
                
                else if (person.getClass().getSimpleName().equals("Borrower"))
                {                    
                    while (true)    // Way to Borrower's Portal
                    {
                        clrscr();
                                        
                        System.out.println("--------------------------------------------------------");
                        System.out.println("\tWelcome to Borrower's Portal");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Following Functionalities are available: \n");
                        System.out.println("1- Search a Book");
                        System.out.println("2- Place a Book on hold");
                        System.out.println("3- Check Personal Info of Borrower");
                        System.out.println("4- Check Total Fine of Borrower"); 
                        System.out.println("5- Check Hold Requests Queue of a Book");                         
                        System.out.println("6- Logout");
                        System.out.println("--------------------------------------------------------");
                        
                        choice = takeInput(0,7);

                        if (choice == 6)
                            break;
                        
                        allFunctionalities(person,choice);
                    }
                }
                
                else if (person.getClass().getSimpleName().equals("Clerk"))
                {
                    while(true) // Way to Clerk's Portal
                    {
                        clrscr();
                                        
                        System.out.println("--------------------------------------------------------");
                        System.out.println("\tWelcome to Clerk's Portal");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Following Functionalities are available: \n");
                        System.out.println("1- Search a Book");
                        System.out.println("2- Place a Book on hold");
                        System.out.println("3- Check Personal Info of Borrower");
                        System.out.println("4- Check Total Fine of Borrower");               
                        System.out.println("5- Check Hold Requests Queue of a Book");                        
                        System.out.println("6- Check out a Book");
                        System.out.println("7- Check in a Book");                        
                        System.out.println("8- Renew a Book");
                        System.out.println("9- Add a new Borrower");
                        System.out.println("10- Update a Borrower's Info");
                        System.out.println("11- Logout");
                        System.out.println("--------------------------------------------------------");                    
                        
                        choice = takeInput(0,12);

                        if (choice == 11)
                            break;
                                            
                        allFunctionalities(person,choice);                        
                    }                    
                }
                
                else if (person.getClass().getSimpleName().equals("Librarian"))
                {
                    while(true) // Way to Librarian Portal
                    {
                        clrscr();
                                        
                        System.out.println("--------------------------------------------------------");
                        System.out.println("\tWelcome to Librarian's Portal");
                        System.out.println("--------------------------------------------------------");
                        System.out.println("Following Functionalities are available: \n");
                        System.out.println("1- Search a Book");
                        System.out.println("2- Place a Book on hold");
                        System.out.println("3- Check Personal Info of Borrower");
                        System.out.println("4- Check Total Fine of Borrower");      
                        System.out.println("5- Check Hold Requests Queue of a Book");                        
                        System.out.println("6- Check out a Book");
                        System.out.println("7- Check in a Book");                        
                        System.out.println("8- Renew a Book");
                        System.out.println("9- Add a new Borrower");
                        System.out.println("10- Update a Borrower's Info");
                        System.out.println("11- Add new Book");
                        System.out.println("12- Remove a Book");
                        System.out.println("13- Change a Book's Info");
                        System.out.println("14- Check Personal Info of Clerk");                        
                        System.out.println("15- Logout");
                        System.out.println("--------------------------------------------------------");
                        
                        choice = takeInput(0,16);

                        if (choice == 15)
                            break;
                                               
                        allFunctionalities(person,choice);                        
                    }                    
                }
                
            }

            else
                stop = true;

            System.out.println("\nPress any key to continue..\n");
            Scanner scanner = new Scanner(System.in);
            scanner.next();            
        }
        
        //Loading back all the records in database
        lib.fillItBack(con);
        }
        catch(Exception e)
        {
            System.out.println("\nExiting...\n");
        }   // System Closed!
       
    }    // Main Closed
  