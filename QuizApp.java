//Quize App Mini Project

import java.util.*;

class QuizApp
{
	static int marks;
	static int count = 0; 
	static int passMarks = 0;
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
	    	javaQuiz();
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

	public static void javaQuestion()
	{
		Scanner sq = new Scanner(System.in);
		String name = "Akash";
		int answerQ1 = 1;
		int answerQ2 = 1;
		QuestionLoop:
		for(int i=1;i<=10;i++)
		{

			System.out.println("What is Your name ");
			String userAnswer =  sq.nextLine();

			if(name.equals(userAnswer)){
				
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


				break QuestionLoop;
			}
			else{
				System.out.println();
				System.out.println("Answer is Wrong");
				break QuestionLoop;
			}

		}


		System.out.println(name + " Your marks is " + (count+"/10"));


	}


}