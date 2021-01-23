class Interruptions{
    public static void main(String[] a){
        System.out.println("Test Interruptions");
    }
}


// This case contains the test of "break" and "continue"
class Test{

    int foo;

    // Test "break"
    int Break(){
        int aux01 ;
        while(true){
			break;
		}
        return 0 ;
    }

	// Test "continue"
	int Continue(){
        int aux01 ;
        while(true){
			continue;
		}
        return 0 ;
    }
	
}
