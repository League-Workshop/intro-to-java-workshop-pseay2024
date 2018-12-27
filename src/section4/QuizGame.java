package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		int total = 0;
		// 2.  Ask the user a question 
		TriviaQuestion[] tq = new TriviaQuestion[5];
		tq[0] = new TriviaQuestion();
		tq[1] = new TriviaQuestion();
		tq[2] = new TriviaQuestion();
		tq[3] = new TriviaQuestion();
		tq[4] = new TriviaQuestion();
		tq[0].quizQuestion = "What is celebrated on February 2 and is also a film?";
		tq[0].quizAnswer = "Groundhog Day";
		tq[1].quizQuestion = "What is the official national anthem of the United States of America?";
		tq[1].quizAnswer = "Star Spangled Banner";
		tq[2].quizQuestion = "Which weather phenomenon translates to boy in spanish?";
		tq[2].quizAnswer = "Nino";
		tq[3].quizQuestion = "What is the largest freshwater lake in the world?";
		tq[3].quizAnswer = "Lake Superior";
		tq[4].quizQuestion = "Where could you find the sea of tranquility?";
		tq[4].quizAnswer = "The Moon";
		// 3.  Use an if statement to check if their answer is correct
		int i = 1;
		for (TriviaQuestion t : tq)
		{
			String Answer = JOptionPane.showInputDialog(null, t.quizQuestion + " (" + (4 + i) + " point(s))");
			if (Answer.equalsIgnoreCase(t.quizAnswer))
			{
				score += 4 + i;
			}
			total += 4 + i;
			i++;
		}
		// 4.  if the user's answer is correct
		// -- add one to their score 
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		// 6.  After all the questions have been asked, print the user's score 
		JOptionPane.showMessageDialog(null, "Your score is: " + score + "/" + total);
	}
}
