package lee_problem1;
import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4 {
			int correctans = 0;
			//generate random numbers with a SecureRandom object
			SecureRandom rand = new SecureRandom();
			Scanner resp = new Scanner(System.in);
			public static void main(String[] args) {
				CAI4 app = new CAI4();
		        app.quiz();
			}
			
			public void quiz() {
				correctans = 0;
				int k = 0;
				int j = 0;
				j = readDifficulty();
		        for(int i = 0; i < 10; i++ ) {
		        	int x = rand.nextInt(j); 
			        int y = rand.nextInt(j);
			        askquestion(x,y);
		        int userin = readResponse();
		         k = isnanswercorrect(userin, x, y);
		         if(k == 1) {
		        	 correctans++;
		         }
		        }
		        int L = 0;
		         L = displayCompletionMessage(correctans);
		        if ( L == 1) {
		        	quiz();
		        }
		        else {
		        	return;
		        }
		        
			}
			public void askquestion(int X, int Y){
				System.out.println("Solve this multiplication problem:\n");
				System.out.println("How much is " + X + " times " + Y + " equal");
			}
			public int readResponse(){
				int ans1 = resp.nextInt();
				return ans1;
			}
			public int isnanswercorrect(int userin, int x, int y) {
				int j = 0;
				int random = rand.nextInt(4);
				if(userin == x*y) {
					displayCorrectResponse(random);
					j = 1;
					return j;
				}
				else {
					displayInorrectResponse(random);
					return 0;
				}
				}
				
			public void displayCorrectResponse(int x) {
				switch (x) {
	            case 1:  System.out.println("Very Good!");;
	                     break;
	            case 2:  System.out.println("Excellent!");;
	                     break;
	            case 3:  System.out.println("Nice Work!");;
	                     break;
	            case 0:  System.out.println("Keep up the good work!");
	                     break;
				
			}
			}
			public void displayInorrectResponse(int x) {
				switch (x) {
	            case 1:  System.out.println("No. Please try again.");;
	                     break;
	            case 2:  System.out.println("Wrong. Try once more.");;
	                     break;
	            case 3:  System.out.println("Don�t give up!");
	                     break;
	            case 0:  System.out.println("No. Keep trying.");
	                     break;
			}}
			
			public int displayCompletionMessage(int correctans) {
				correctans = ((correctans * 100) / 10);
				System.out.println("Your score is "+ correctans);
				if(correctans >= 75) {
					System.out.println("Congratulations, you are ready to go to the next level!");
				}
				else {
					System.out.println("Please ask your teacher for extra help.");
				}
				System.out.println("Want to solve a new problem set? 1 for yes/ 0 for no");
				 int counter = resp.nextInt();
				 return counter;
				
		}
			public int readDifficulty() {
				System.out.println("Choose difficulty level: \n 1 \n 2 \n 3 \n 4");
				int j= 0;
				j = resp.nextInt();
				switch (j) {
	            case 1:  j = 10; 
	                     break;
	            case 2:  j = 100;
	                     break;
	            case 3:  j = 1000;
	                     break;
	            case 4:  j = 10000;
	                     break;}
	             return j;
				
				


	}

}
