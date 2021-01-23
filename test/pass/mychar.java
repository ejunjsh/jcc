class MyChar{
    public static void main(String[] a){
        {
            System.out.println(new CharEditor().whichIsSmaller('a', 'c'));
            System.out.println(new CharEditor().whichIsSmaller('a', 'A'));
            System.out.println(new CharEditor().whichIsSmaller('1', 'd'));
            System.out.println(new CharEditor().whichIsSmaller('-', '+'));
            // System.out.println("There are total " + new MyChar().countFromCharToChar('a', 'z', true) + " characters in between a and z");
            System.out.println(new CharEditor().countChars("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", 'c'));
        }
    }
}

class CharEditor {

    char whichIsSmaller(char firstChar, char secondChar){
        char returnChar;

        if(secondChar < firstChar) //the comparison is based on the character's ASCII code
        returnChar = firstChar;
        else
        returnChar = secondChar;
        return returnChar;
    }

    int countChars(String str, char c){
        int n;
        int sz;
        char c1;
        int counter;

        counter = 0;

        sz = str.length();
        n = 0;
        while ( n < sz ) {
            c1 = str.charAt(n);
            if ( c1 == c) {
                counter = counter + 1;
            }
            n = n + 1;
        }
        return counter;
    }
}
