class BooleanExpressions{
    public static void main(String[] a){
        System.out.println("Test booleanExpressions");
    }
}

class Test{

    int foo;

    int test(){
        String a ;
		String b ;
        if(a == b){
			a = "alain";
		}
		if(!false){
			b = "compiler";
		}
		if(10 < 5 && 10 < 5){
			a = "nope";
		}
		if(10 < 5 || 10 < 5){
			a = "yeah";
		}
        return 0 ;
    }
	
}
