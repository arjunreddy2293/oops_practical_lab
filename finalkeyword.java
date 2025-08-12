package practical;

public class finalkeyword {
	
	    final int VALUE = 100; // final variable

	    final void show() { 
	        System.out.println("Final variable VALUE = " + VALUE);
	    }

	    public static void main(String[] args) {
	       finalkeyword obj = new finalkeyword();
	        obj.show();
	        // obj.VALUE = 200; // ❌ Cannot change final variable
	    }
	}







