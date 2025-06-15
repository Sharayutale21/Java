public class strings {
	//public static void basics(){
	//	String str = "Hello World";
	//	System.out.println(str);
	//	System.out.println(str.length());
	//	System.out.println(str.charAt(0));
	//	System.out.println(str.indexOf('o'));
	//	System.out.println(str.substring(0, 5));
	//	System.out.println(str.toLowerCase());
	//	System.out.println(str.toUpperCase());
	//	System.out.println(str.trim()); // removes leading and trailing spaces
	//	System.out.println(str.replace('o', 'a'));
	//	System.out.println(str.contains("World"));
	//	System.out.println(str.startsWith("Hello"));
	//	System.out.println(str.endsWith("World"));
	//}

	//public static void printLetters(String str){
	//	for(int i=0 ; i<str.length();i++){
	//		System.out.print(str.charAt(i) + " ");
	//	}
	//}

	//public static void isPallindrome(String str){
	//	int n = str.length();

	//	for(int i=0 ; i<str.length()/2; i++){
	//		if(str.charAt(i) != str.charAt(n-1-i)){
	//			System.out.println("Not a pallindrome");
	//			return;
	//		}
			
	//	}
	//	System.out.println("Pallindrome");
	//}

	//public static int shortestPath(String str){
	//	int x=0 , y=0;
		

	//	for(int i=0 ; i<str.length() ; i++){
	//		char ch = str.charAt(i);
	//		if(ch == 'N'){
	//			y++;
	//		} else if(ch == 'S'){
	//			y--;
	//		} else if(ch == 'E'){
	//			x++;
	//		} else if(ch == 'W'){
	//			x--;
	//		}

			
	//	}
	//	int X2 = x * x;
	//	int Y2 = y * y;
	//	int distance = (int) Math.sqrt(X2 + Y2);
	//	return distance;
	//}

	//public static void isEqual(){
	//	String str1 = "Hello";
	//	String str2 = "Hello";
	//	String str3 = new String("Hello");

	//	System.out.println(str1 == str2); // true, because both refer to the same string literal
	//	System.out.println(str1 == str3); // false, because str3 is a new object in memory
	//	System.out.println(str1.equals(str2)); // true, compares content
	//	System.out.println(str1.equals(str3)); // true, compares content
	//}

	public static void subStr(String str , int start , int end){
		String sub ="";
		for(int i=start ; i<end ; i++){
			sub += str.charAt(i);
		}
		System.out.println(sub);
	
	}

	public static void largest(String str[]){ //time complexity o(nxm) where n is the number of strings and m is the average length of the strings that compareTo function takes
		// This function finds the lexicographically largest string in an array of strings
		String largest = str[0];
		for(int i =1 ; i<str.length ; i++ ){
			if(largest.compareTo(str[i])< 0 ){ // compareTo returns a negative value if the first string is lexicographically less than the second
				// or if the first string is smaller than the second string
				largest = str[i];
			}
		}
		System.out.println("Largest string is: " + largest);
	}

	public static void main(String[] args){
		//basics();

		//String str1 = "Harry";
		//String str2 = "Potter";
		//String Str = str1 + str2;
		//System.out.println(Str);


		//String str = "Hello World";
		//printLetters(str);


		//pallindrome
		//String str = "madam";
		//isPallindrome(str);

		//shortest distance
		//String str = "NNEE";
		//int distance = shortestPath(str);
		//System.out.println("Shortest distance: " + distance);


		//is equal
		//isEqual();

		//substring 
		//String str = "Hello World";
		//int start = 0;
		//int end = 4;
		//String substring = str.substring(0,3);
		//System.out.println(substring);
		//subStr(str, start, end);


		//largest
		String str[] = {"apple" , "banana", "cherry", "date"}; //date is alphabetically largest
		largest(str);
	}
}
