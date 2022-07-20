package parameterizedconstructor;

public class main {
	String languages;

	  // constructor accepting single value
	  main(String lang) {
	    languages = lang;
	    System.out.println(languages);
	  }

	  public static void main(String[] args) {

	    main obj1 = new main("Tamil");
	    main obj2 = new main("Telugu");
	    main obj3 = new main("English");
	  }
	}

