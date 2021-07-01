package phonebook;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class Index {

	public static void main(String[] args) throws IOException {
	interactionMenu();
		
		
	}
	public static void addEntry(Person person, Addresses address) {
		System.out.print("The record of " + person + " has been added successfully");
		
		
		try (PrintWriter pw = new PrintWriter(new FileWriter("file.txt", true))) {
		
		pw.println(person + ":" + address);
		
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
			
	}
    public static void searchByFirstName(String firstName) {
    	System.out.println("\nSearching: " + firstName);
    	
    	try(Scanner input = new Scanner(new File("file.txt"))) {
    		String users[];
    		
    		boolean foundPerson = false;
    		
    		while(input.hasNext()) {
    			users = input.nextLine().split(",");
    			if(users[0].equals(firstName)) {
    				
    				System.out.println("\nResults: " + firstName + users[1] + users[2] + users[3] + users[4] + users[5] + users[6] + users[7]);
    				foundPerson = true;
    			}
    					
    		} if(!foundPerson) {
    			System.out.println("\nUser " + firstName + " could not be found:");
    		}
    	} catch (IOException e) {
		 System.out.println(e.getMessage());
			e.printStackTrace();
		}
    	
    }
    	//Not finished
    public static void searchByLastName(String lastName) {
    	System.out.println("\nSearching: " + lastName);
    	
    	try(Scanner input = new Scanner(new File("file.txt"))) {
    		String users[];
    		
    		boolean foundPerson = false;
    		
    		while(input.hasNext()) {
    			users = input.nextLine().split(",:");
    			if(users[1].equals(lastName)) {
    				
    				System.out.println("\nResults: " + users[0] + lastName  + users[3] + users[4] + users[5] + users[6] + users[7]);
    				foundPerson = true;
    			}
    		} if(!foundPerson) {
    			System.out.println("\nUser " + lastName + " could not be found: ");
    			
    		}
    	} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
    	
    }
    // Not finished
    public static void searchByFullName(String fullName) {
System.out.println("\nSearching: " + fullName);
		
		try(Scanner input = new Scanner (new File("file.text"))){
			String users[];
			
			boolean foundPerson = false;
			
			while(input.hasNext()) {
				users = input.nextLine().split("");
				if(users[0].equals(fullName)) {
					System.out.println("\nResults: " + fullName + users[1]);
				foundPerson = true;
				}
			}	
		if(!foundPerson) {
			System.out.println("\nCould not find: " + fullName);
		}
			
		
	} catch(IOException e) {
			System.out.println(e.getMessage());
	}
    }
    	
    public static void deleteRecord(String name)
	throws IOException{
		System.out.println("\nThe recorded entry has been deleted: ");
	    System.out.println("\nDeleting record for: " + name);
        File file = new File("file.txt");
        File temp = new File("temp");
        PrintWriter out = new PrintWriter(new FileWriter(temp));
        Files.lines(file.toPath())
            .filter(line -> !line.contains(name))
            .forEach(out::println);
        out.flush();
        out.close();
        temp.renameTo(file);
    }
	
	public static void updateRecord(String name) {
		
		Scanner input = new Scanner(System.in);
		
		String path = System.getProperty("user.dr") + "file.txt";
		
		System.out.println("Enter new info: name(first and last), Phonenumber, Address(Street,city,state,ZIP code ");
		String text = input.nextLine();
		
		try {
			FileWriter fw = new FileWriter(path,true);
			fw.write(text);
			fw.close();
			input.close();
			
			System.out.println("\nEntry has been updated");
		}
		catch(IOException e) {
			
		}
	    }
	


	
	public static void interactionMenu() throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please make a selection: ");
		System.out.println("1: Add a new entry");
		System.out.println("2: Search an existing entry by First Name");
		System.out.println("3: Search an existing entry by Last Name");
		System.out.println("4: Search an existing entry by Full Name");
		System.out.println("5: Delete an existing record");
		System.out.println("6: Update an existing record");
		System.out.println("7: Exit");
		
        Person person = new Person();
		
		Addresses address = new Addresses();
		
//		String users= person.getFirstName() + person.getLastName() + person.getFullName() + address.getTelephoneNumber() +
//	    address.getStreetAddress() + address.getCity() + address.getState() + address.getZipCode(); 
		
		int choice = input.nextInt();
		input.nextLine();
		
		switch (choice) {
		
		case 1: 
			 System.out.println("\nWho would you like to add? (first name, last name)");
	            person.setFirstName(input.next()); person.setLastName(input.next());
				
				System.out.println("\nWhat is their address? (street address, city, state, ZIP code)");
				address.setStreetAddress(input.next()); address.setCity(input.next()); 
				address.setState(input.next()); address.setZipCode(input.next());
				
				System.out.println("\nWhat is their phone number?");
				address.setTelephoneNumber(input.nextLong());
				
				
			addEntry(person,address);
			
			break;
		case 2: 
			System.out.println("\nSearch by First Name: ");
			String firstName = input.next();
			searchByFirstName(firstName);
			break;
		case 3: 
			System.out.println("\nSearch by Last Name: ");
			String lastName = input.next();
			searchByLastName(lastName);
	        break;
		case 4: 
			System.out.println("\nSearch by Full Name ");
			String fullName= input.next();
			searchByFullName(fullName);
			break;
		case 5:
			System.out.println("\nDelete an existing record");
			String name = input.next();
			deleteRecord(name);
			break;
		case 6: 
			System.out.println("\nUpdate a record"); 
			String name2 = input.next();
			updateRecord(name2);
			break;
		default:
			System.out.println("Have a nice day! ");
			System.exit(choice);
			break;
			
			
		}
		input.close();
	}
		
	}


