package br.com.dbserver.selenium_jupiter.tools;

import java.util.Random;

public class CustomerFake {

	private String email;
	private String name;
	private String lastName;
	private String password;

	private int dayBirthday;
	private int monthBirthday;
	private int yearBirthday;

	private String company;
	private String street;
	private String state;	
	private String city;
	private String postalCode;
	private String mobile;
	private String aliasAddress;
	private String country;
	
	private final String NUMBERS = "1234567890";
	private final String ALPHABET= "abcdefghijklmnopqrstuvxzyw123456789";
	
	private Random random;

	public CustomerFake() {
		super();
		this.random = new Random();
		generateName();
		generateLastName();
		generateEmail();
		generatePassword();
		generateCompany();
		generateDateBirth();
		generateStreet();
		generateCity();
		generateState();
		generatePostalCode();
		generateCountry();
		generateMobile();
	}	

	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	public int getDayBirthday() {
		return dayBirthday;
	}
	public  int getMonthBirthday() {
		return monthBirthday;
	}
	public  int getYearBirthday() {
		return yearBirthday;
	}	
	public String getCompany() {
		return company;
	}
	public String getStreet() {
		return street;
	}
	public String getCity() {
		return city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public String getMobile() {
		return mobile;
	}
	public String getAliasAddress() {
		return aliasAddress;
	}

	public void generateName() {		
		Random random = new Random();
		String names[] = {"Avícola",      
						  "Agrícola",      
						  "Alce",          
						  "Amado",         
						  "Amável",        
						  "Amazonas",      
						  "América",       
						  "Amin",          
						  "Manso",         
						  "Morrendo",      
						  "Asteróide",     
						  "Bandeirante",   
						  "Barrigudinha",  
						  "Bispo",         
						  "Céu",           
						  "Chevrolet",     
						  "Dezêncio",      
						  "Dolores",       
						  "Esparadrapo"};		
		
		this.name =  names[random.nextInt(names.length-1)];
	}

	public void generateLastName() {		
		Random random = new Random();
		String lastNames[] = {"Beterraba",
							  "Fonseca",
							  "Barbuda",
							  "Amoroso",
							  "Pinto",
							  "Pimpão",
							  "Santana",
							  "Amado",
							  "Sossegado",
							  "Dores",
							  "Silverio",
							  "Paulistano",
							  "Seleida",
							  "Paris",
							  "Poente",
							  "Ford",
							  "Feverêncio",
							  "Barriga",
							  "Clemente"};	
		
		this.lastName = lastNames[random.nextInt(lastNames.length-1)];
	}

	public void generateEmail() {		
		Random random = new Random();
		String providers[] = {"@gmail.com",
							 "@hotmail.com",
							 "@outlook.com", 
							 "@icloud.com",
							 "@yahoo.com",  
							 "@mail.com"};		
		this.email = name.substring(0).toLowerCase() + "."+
					 lastName.substring(0).toLowerCase() + 
					 providers[random.nextInt(providers.length-1)];
	}

	public void generatePassword() {	
		StringBuilder builder = new StringBuilder();	
		for(int i = 0; i < 10; i++ ) {
			builder.append(ALPHABET.charAt(random.nextInt(ALPHABET.length()-1)));			
		}		
		this.password = builder.toString();
	}

	public void generateCompany() {
		String companyies[] = {"Blug",
							   "M Republic Relations S.A",
							   "OMG Consulting",
							   "Reputation",
							   "Add Solutions",
							   "Zest Turismo & Eventos", 
							   "Company Turismo", 
							   "Encontre sua Viagem",
							   "MalaPronta",
							   "TOB Tour"};
		
		this.company = companyies[random.nextInt(companyies.length-1)];
	}

	public void generateCity() {
		String cities[] = {"New York City ",
				"Los Angeles ",
				"Chicago ", 
				"Houston ", 
				"Phoenix ", 
				"Philadelphia ", 
				"San Antonio ", 
				"San Diego ", 
				"Dallas ", 
		"San Jose "};
		this.city = cities[random.nextInt(cities.length-1)];
	}

	public void generateStreet() {
		String streets[] = {"Sixth ",
				"Oak ",
				"Seventh ", 
				"Pine ", 
				"Maple ", 
				"Cedar ", 
				"Eighth ", 
				"Elm ", 
				"View ",
				"Washington ", 
				"Ninth ",
		"Lake "};
		this.street = streets[random.nextInt(streets.length-1)] + (random.nextInt(500)+100); 
	}

	public void generateState() {
		String states[] = {"Alabama", 
				"Alaska", 
				"California",
				"Colorado", 
				"Delaware",
				"Georgia", 
				"Maine", 
				"Montana", 
				"New Mexico", 
		"Tennessee"};
		this.state = states[random.nextInt(states.length-1)];
	}


	public String getState() {
		return state;
	}

	public void generateMobile() {

		this.mobile = "("+ NUMBERS.charAt(random.nextInt(NUMBERS.length()-1)) 
		+  NUMBERS.charAt(random.nextInt(NUMBERS.length()-1)) +") 9";	

		for (int i = 0; i < 9; i++) {
			this.mobile = this.mobile + NUMBERS.charAt(random.nextInt(NUMBERS.length()-1)) ;			
		}	
	}

	public void generateDateBirth() {
		String[] birthday = RandomDate.nextDate();
		this.yearBirthday  = Integer.parseInt(birthday[0]);
		this.monthBirthday = Integer.parseInt(birthday[1]);
		this.dayBirthday   = Integer.parseInt(birthday[2]);
	}

	public void generatePostalCode() {			
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < 5; i++) {
			stringBuilder.append(NUMBERS.charAt(random.nextInt(NUMBERS.length()-1)));
		}
		this.postalCode = stringBuilder.toString();
	}

	
	private void generateCountry() {
		String countries[] = {"United States", "United States"};
		this.country = countries[random.nextInt(countries.length-1)];
		
	}

	public String getCountry() {
		return country;
	}






}
