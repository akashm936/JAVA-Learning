// /// Switch Statement 
//************************ Program 1 *************************
// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		int a = 2;
// 		switch(a)
// 		{
// 		case 1 : 
// 		{
// 			System.out.println("Hi From case 1 "); 
// 			break;
// 		} 
// 		case 2 :
// 			{
// 			System.out.println("Hi from case 2 ");
// 			break;
// 			}
// 		case 3 : 
// 			{
// 			System.out.println("Hi from case 3 ");
// 			break;
// 			}
// 		case 4 :
// 		{
// 			System.out.println("Hi from case 4 ");
// 			break;
// 		} 		
// 	    default : 
// 	    	System.out.println("Hi from the defult block ");
// 	    }		
// 	}
// }
//********************** Switch Statement *********************************
//                             Program 2
// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		int a = 3;
// 		switch(a)
// 		{
// 		case 1 : System.out.println("Hi form the case 1"); break;
// 		case 2 : System.out.println("Hi form the case 2"); break;
// 		case 3 : System.out.println("Hi form the case 3"); break;
// 		case 4 : System.out.println("Hi form the case 4"); break;
// 		default : System.out.println("Hi form the default"); 
// 		}
// 	}
// }

//********************** Program 3 *********************************

// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		int b = 2;
// 		switch(b)
// 		{
// 		case 1 : System.out.println("Hi form the case 1");
// 		case 2 : System.out.println("Hi form the case 2");
// 		case 3 : System.out.println("Hi form the case 3");
// 		case 4 : System.out.println("Hi form the case 4");
// 		default : System.out.println("Hi form default case ");
// 		}
// 	}
// }

//********************** Program 4 *********************************

// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		int c = 3;

// 		switch(b)
// 		{
// 		case 1 : System.out.println("Hi form the case 1");
// 		case 2 : System.out.println("Hi form the case 2");
// 		case 3 : System.out.println("Hi form the case 3");
// 		case 4 : System.out.println("Hi form the case 4");
//    //                   default statement case is the optional case this statement is not mentenory
// 		}
// 	}
// }

// ********************** Program 5 *********************************

// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		int c = 3;

// 		switch(c)
// 		{
// 		case 1 : System.out.println("Hi form the case 1");
// 		case 2 : System.out.println("Hi form the case 2");
// 		case 3 : System.out.println("Hi form the case 3");
// 		case 4 : System.out.println("Hi form the case 4");
//         default : System.out.println(" Default Block");
// 		}
// 	}
// }

// ********************** Program 6 *********************************

// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		byte c = 3;

// 		switch(c)
// 		{
// 		case 1 : System.out.println("Hi form the case 1");
// 		case 2 : System.out.println("Hi form the case 2");
// 		case 3 : System.out.println("Hi form the case 3");
// 		case 128 : System.out.println("Hi form the case 4");
//         default : System.out.println(" Default Block");
// 		}
// 	}
// } 

// this program show the error the possible lossy conversion in to byte 
//  becouse the byte cant not store the  128 bit number is store only 127 number

// ********************** Program 7 *********************************

// convert the ASCII value in Switch
// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		byte c = 3;

// 		switch(c)
// 		{
// 		case 1 : System.out.println("Hi form the case 1");
// 		case 2 : System.out.println("Hi form the case 2");
// 		case 'A' : System.out.println("Hi form the case 3"); // the ASCII value convert it into the integer value  'A' is 65
// 		case 4 : System.out.println("Hi form the case 4");
//         default : System.out.println(" Default Block");
// 		}
// 	}
// }

//************************* Program 8 ************************************

// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		byte c = 3;

// 		switch(c+0)  // +0 is convert byte to integer.
// 		{
// 		case 1 : System.out.println("Hi form the case 1");
// 		case 2 : System.out.println("Hi form the case 2");
// 		case 3 : System.out.println("Hi form the case 2");
// 		case 'A' : System.out.println("Hi form the case 3"); // the ASCII value convert it into the integer value  'A' is 65
// 		case 128 : System.out.println("Hi form the case 4"); // integer can accept the 128 bit value; 
//         default : System.out.println(" Default Block");
// 		}
// 	}
// }

//************************  Program 9 **************************************

// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		byte c = 3;

// 		switch(c+1)  // +0 is convert byte to integer.
// 		{
// 		case 1 : System.out.println("Hi form the case 1");
// 		case 2 : System.out.println("Hi form the case 2");
// 		case 65 : System.out.println("Hi form the case 2");
// 		case 'A' : System.out.println("Hi form the case 3"); // Dublicat value 65 and 'A' is Same 
// 		case 128 : System.out.println("Hi form the case 4"); // integer can accept the 128 bit value; 
        
// 		}
// 	}
// }

//************************* Program 10 ****************************************

// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		int c = 3;

// 		switch(c)  // +0 is convert byte to integer.
// 		{
// 		case 1 : System.out.println("Hi form the case 1");
// 		case 2 : System.out.println("Hi form the case 2");
// 		case 4 : System.out.println("Hi form the case 2");
// 		case 'A' : System.out.println("Hi form the case 3"); // Dublicat value 65 and 'A' is Same 
// 		case 128 : System.out.println("Hi form the case 4"); // integer can accept the 128 bit value; 
// 		}
// 	}
// }

//****************************  Program 11 *****************************************


// class SwitchExample
// {
// 	public static void main(String[] args) {
		
// 		int c = 3;

// 		switch(c) //in switch we can write  (var/literal/expression)
// 		{
// 	     // case cases are also optional
// 		}
// 		//blocks is mentenary in the switch Cases
// 	}
// }






