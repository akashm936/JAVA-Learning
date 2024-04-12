//Quize App Mini Project

import java.util.*;

class QuizApp
{
	static int marks;
	static int count = 0; 
	static int passMarks = 0;
	static String name = "Akash";
	// static String userAnswer ;
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);		

		    System.out.println("This is Quiz App For test You knowledge ");

        System.out.println();
        System.out.println("*********************************************************************");
	    	System.out.println();
		    System.out.println("Which Subject Quiz you Want to Give ?");
		    System.out.println("1. Java \n2. SQL \n3.I am Not Prepare(Exit)");
		    int BatchName = sc.nextInt();
		

		switch(BatchName)
		{
		case 1:
		{
			System.out.println("***************  Welcome Java Quiz *****************");
			System.out.println();
			javaQuiz();
			break;
			//java batch
		} 
	    case 2:{
	    	System.out.println("****************  Welcome SQL Quiz ********************");
	    	System.out.println();
	    	sqlQuestion();
	    	break;
	    	//sql batch
	    } 
	    case 3:{
	    	System.out.println("please be Prepare for MCQ Mock");
	        System.exit(0);
	    }
	    default:{
	    	System.out.println("You Enter Invalid Batch code");
	    	break;
	    }

		}
	}

	public static void javaQuiz()
	{
		System.out.println();
		System.out.println("**************   Rules Of Quiz    *****************");
		System.out.println("1. There is 10 Question. \n2. Every Question have 1 Mark. \n3. Every Question have 4 Option. \n All Question Are Mandatory");
	    System.out.println();
	    javaQuestion();
	}
// ***************************  this method for sql Quiz Question
	public static void sqlQuestion()
	{
	  	
	  	Scanner sql = new Scanner(System.in);
      // String name = "Akash";
      int sqlAnswer1 = 1;
      int sqlAnswer2 = 1;
      int sqlAnswer3 = 2;
      int sqlAnswer4 = 3;
      int sqlAnswer5 = 4;
      int sqlAnswer6 = 3;
      int sqlAnswer7 = 2;
      int sqlAnswer8 = 4;
      int sqlAnswer9 = 2;
      int sqlAnswer10 = 1;

	  	System.out.println("Enter Your Name : ");
	  	String username = sql.nextLine();

	  	if(name.equals(username))
	  	{
	  	  System.out.println(name + " All the Best For Test ");
                  
                  System.out.println("************************************************************");
                  System.out.println();
                  System.out.println("Q1. What is Full Form of SQL ");
                  System.out.println();
                  System.out.println("1. Stracture Query language \n2. Stracture Quality language \n3. Storage Query language \n4. I Don't Know");
                  
                  int userAnswersql1 = sql.nextInt();

                  if (sqlAnswer1==userAnswersql1) {
                  	
                  	System.out.println();
                  	System.out.println("Q1 Answer is Submited in sql");


  //******************************************************************************
          // SQL Question 2
                  	System.out.println("Q2. What is Data ?");
                  	System.out.println();
                  	System.out.println("1. Data is a Rawfact \n2. Data is a Information. \n3. Data is Mobile Data \n4. I Don't know");

                    int userAnswersql2 =sql.nextInt();

                  	if (sqlAnswer2==userAnswersql2) {

                  		System.out.println();
                  		System.out.println("Q2 Answer is Submited in sql");
                  

   //******************************************************************************
          // SQL Question 3
                  	System.out.println("Q3. What is Full Form of RDMS?");
                  	System.out.println();
                  	System.out.println("1. Relation Destroyed Management System \n2. Relational Database Management System \n3. Readable Data Management System \n4. I Don't know");

                    int userAnswersql3 =sql.nextInt();

                  	if (sqlAnswer3==userAnswersql3) {

                  		System.out.println();
                  		System.out.println("Q3 Answer is Submited in sql");
                  		
                  		
                //******************************************************************************
                    // SQL Question 4
                  	System.out.println("Q4. What is MetaData?");
                  	System.out.println();
                  	System.out.println("1. Management of Data \n2. Modification of Data \n3. Data About Data \n4. I Don't know");

                    int userAnswersql4 =sql.nextInt();

                  	if (sqlAnswer4==userAnswersql4) {

                  		System.out.println();
                  		System.out.println("Q4 Answer is Submited in sql");
                  		

                //******************************************************************************
                    // SQL Question 5
                  	System.out.println("Q5. In which year E F Codd rule Developed? ");
                  	System.out.println();
                  	System.out.println("1. 1995 \n2. 1991 \n3. 1956 \n4. 1970");

                    int userAnswersql5 =sql.nextInt();

                  	if (sqlAnswer5==userAnswersql5) {

                  		System.out.println();
                  		System.out.println("Q5 Answer is Submited in sql");
                  		
                  		
                //******************************************************************************
                    // SQL Question 6
                  	System.out.println("Q6. What is Length of Varchar2 in SQL? ");
                  	System.out.println();
                  	System.out.println("1. 1000 \n2. 2000 \n3. 4000 \n4. 1500");

                    int userAnswersql6 =sql.nextInt();

                  	if (sqlAnswer6==userAnswersql6) {

                  		System.out.println();
                  		System.out.println("Q6 Answer is Submited in sql");
                  		

              //******************************************************************************
                    // SQL Question 7
                  	System.out.println("Q7. What is Value of Null ");
                  	System.out.println();
                  	System.out.println("1. 1 bit \n2. Empty \n3. 1 Byte \n4. 0 ");

                    int userAnswersql7 =sql.nextInt();

                  	if (sqlAnswer7==userAnswersql7) {

                  		System.out.println();
                  		System.out.println("Q7 Answer is Submited in sql");
                  		
                  		
          //******************************************************************************
                    // SQL Question 8
                  	System.out.println("Q8. What is Full Form of DCL command in sql ");
                  	System.out.println();
                  	System.out.println("1. Database Control language \n2. Database creation language \n3. 1 Data creation language  \n4. Data Control Language ");

                    int userAnswersql8 =sql.nextInt();

                  	if (sqlAnswer8==userAnswersql8) {

                  		System.out.println();
                  		System.out.println("Q8 Answer is Submited in sql");
                  		
                  		
            //******************************************************************************
                    // SQL Question 9
                  	System.out.println("Q9. Commit, RollBack and SavePoint are Command of ");
                  	System.out.println();
                  	System.out.println("1. DDL \n2. DCL \n3. 1 TCL  \n4. DQL ");

                    int userAnswersql9 =sql.nextInt();

                  	if (sqlAnswer9==userAnswersql9) {

                  		System.out.println();
                  		System.out.println("Q9 Answer is Submited in sql");
                  		
              
              //******************************************************************************
                    // SQL Question 10
                  	System.out.println("Q10. folling are DCL Command ");
                  	System.out.println();
                  	System.out.println("1. Grant,Revoke \n2. Create,Update \n3. Insert,Truncate   \n4. Select,Join ");

                    int userAnswersql10 =sql.nextInt();

                  	if (sqlAnswer10==userAnswersql10) {

                  		System.out.println();
                  		System.out.println("Q10 Answer is Submited in sql");
                  		count++;
                  		
                  		
                  	}
                  }
                  else{
                  	System.out.println();
                  	System.out.println("Wrong Answer in sql");
                  
                  }

	  	}
	  	else{
	  		System.out.println("Wrong User Name Please Enter Correct User Name");
	  	}

	}

	// ******************************* this method is for getting user name 
	// public static void userName()
	//this method for java Quiz Question

public static void javaQuestion()
	{
		Scanner sq = new Scanner(System.in);
		// String name = "Akash";
		int answerQ1 = 1;
		int answerQ2 = 1;
		int answerQ3 = 1;
		int answerQ4 = 4;
		int answerQ5 = 1;
    int answerQ6 = 2;
    int answerQ7 = 1;
    int answerQ8 = 2;
    int answerQ9 = 3;
    int answerQ10 = 4;

		QuestionLoop:
		for(int i=1;i<=10;i++)
		{

			System.out.println("What is Your name ");
		  String username =  sq.nextLine();

			if(name.equals(username)){
				
				System.out.println();
				System.out.println( name + " All The Best For Test  ");
  //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                       //question 1

                System.out.println();
				        System.out.println("Q1.  What is Java?");
		            System.out.println("1. Java is Programming language \n2. Java is a Coffee \n3. Java is Bike \n4 I Don't Know");
                int q1 = sq.nextInt();

                if(q1==answerQ1)
                {
                System.out.println();
        	      System.out.println("  Q1 Answer Submited ");
        	      count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }
          // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                  // Question 2
                
                System.out.println();
                System.out.println("Q2.  What is Veriable ?");
		        System.out.println("1. Veriable is Container \n2. Veriable is DataType \n3. Veriable is Loop \n4 I Don't Know");
                int q2 = sq.nextInt();

                if(q2==answerQ2)
                {
                	System.out.println();
        	    System.out.println("Q2 Answer Submited ");
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }

    // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Question 3
                
                System.out.println();
                System.out.println("Q2.  What is Identifier ?");
		        System.out.println("1. Name Given by Programmer \n2. Name Given By Developer \n3. Pre-defined Name \n4 I Don't Know");
                int q3 = sq.nextInt();

                if(q3==answerQ3)
                {
                	System.out.println();
        	    System.out.println("Q3 Answer Submited ");
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }

   // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Question 4
                
                System.out.println();
                System.out.println("Q4.  What is Full Form of jdk ?");
		        System.out.println("1. I Don't Know \n2. Java Defination kit \n3. Java Developer kit \n4 Java Development Kit ");
                int q4 = sq.nextInt();

                if(q4==answerQ4)
                {
                	System.out.println();
        	    System.out.println("Q4 Answer Submited ");
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }

   // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Question 5
                
                System.out.println();
                System.out.println("Q5.  What is continue ?");
		        System.out.println("1. Branching Statement \n2. Looping Statement \n3. Conditional Statement \n4 I Don't Know ");
                int q5 = sq.nextInt();

                if(q5==answerQ5)
                {
                	System.out.println();
        	    System.out.println("Q5 Answer Submited ");
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }

 // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Question 6
                
                System.out.println();
                System.out.println("Q6.  What is Full Form of JRE ?");
		            System.out.println("1. I Don't Know \n2. Java RunTime Envirment \n3. Java RunTime Encription \n4 Java RunTime Envierment veriable ");
                int q6 = sq.nextInt();

                if(q6==answerQ6)
                {
                	System.out.println();
        	    System.out.println("Q6 Answer Submited ");
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }

  // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Question 7
                
                System.out.println();
                System.out.println("Q7.  What is Full Form JVM ?");
		            System.out.println("1. Java Virtual Machine  \n2. Java Virtual Motor \n3. Java Veriable Mode  \n4 Java Vending Machine ");
                int q7 = sq.nextInt();

                if(q7==answerQ7)
                {
                	System.out.println();
        	    System.out.println("Q7 Answer Submited ");
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }

  // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Question 8
                
                System.out.println();
                System.out.println("Q8.  Which is Deprecated Key Word in Java ?");
		            System.out.println("1. Break  \n2. Goto \n3. Abstract  \n4 I Don't Know ");
                int q8 = sq.nextInt();

                if(q8==answerQ8)
                {
                	System.out.println();
        	    System.out.println("Q8 Answer Submited ");
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }

   // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Question 9
                
                System.out.println();
                System.out.println("Q9.  What is Size of Long in byte?");
		            System.out.println("1. 4 byte  \n2. 3 Byte \n3. 8 Byte  \n4 1 Byte ");
                int q9 = sq.nextInt();

                if(q9==answerQ9)
                {
                	System.out.println();
        	    System.out.println("Q9 Answer Submited ");
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }


   // ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        // Question 10
                
                System.out.println();
                System.out.println("Q10.  What is Size of Boolean?");
		            System.out.println("1. 1 Bit  \n2. 3 Byte \n3. Undefined  \n4 Both 1 & 3 ");
                int q10 = sq.nextInt();

                if(q10==answerQ10)
                {
                	System.out.println();
        	    System.out.println("Q10 Answer Submited ");
        	    System.out.println();
        	    count++;
                }
                else{
        	    System.out.println("Sorry! Wrong Answer");
                }


				break QuestionLoop;
			}
			else{
				System.out.println();
				System.out.println("Answer is Wrong");
				break QuestionLoop;
			}

		}

    System.out.println(" ***********  Thank You " + name + "For Given Test ************ ");
    System.out.println();
		System.out.println(name + " Your marks is " + (count+"/10"));


	}


}