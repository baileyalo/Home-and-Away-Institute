package hai.customgui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import utech.hai.classes.Question;
import utech.hai.classes.Student;
import utech.hai.classes.TestAnswer;
import utech.hai.database.dbTestAnswer;
import utech.hai.loggedIn.CurrentUser;

public class TestResult extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	
	
	public TestResult(List<Question> questions,String courseCode,String courseName, int testId) {
		
		Student student = CurrentUser.loggedInStudent;
		List<TestAnswer> choices = dbTestAnswer.getStudentTestAnswers(student.getIdNumber(), courseCode);
		
		float score = 0;
		int correct = 0;
		
		String answer1 = questions.get(0).getAnswer();
		String answer2 = questions.get(1).getAnswer();
		String answer3 = questions.get(2).getAnswer();
		String answer4 = questions.get(3).getAnswer();
		String answer5 = questions.get(4).getAnswer();
		String answer6 = questions.get(5).getAnswer();
		String answer7 = questions.get(6).getAnswer();
		String answer8 = questions.get(7).getAnswer();
		String answer9 = questions.get(8).getAnswer();
		String answer10 = questions.get(9).getAnswer();
		
		String choice1 = choices.get(0).getChoice();
		String choice2 = choices.get(1).getChoice();
		String choice3 = choices.get(2).getChoice();
		String choice4 = choices.get(3).getChoice();
		String choice5 = choices.get(4).getChoice();
		String choice6 = choices.get(5).getChoice();
		String choice7 = choices.get(6).getChoice();
		String choice8 = choices.get(7).getChoice();
		String choice9 = choices.get(8).getChoice();
		String choice10 = choices.get(9).getChoice();
		
		String status1 = "Incorrect";
		String status2 = "Incorrect";
		String status3 = "Incorrect";
		String status4 = "Incorrect";
		String status5 = "Incorrect";
		String status6 = "Incorrect";
		String status7 = "Incorrect";
		String status8 = "Incorrect";
		String status9 = "Incorrect";
		String status10 = "Incorrect";
		
		if(choice1.equalsIgnoreCase(answer1))
		{
			status1 = "Correct";
			correct+=1;
		}
		if(choice2.equalsIgnoreCase(answer2))
		{
			status2 = "Correct";
			correct+=1;
		}
		if(choice3.equalsIgnoreCase(answer3)){
			status3 = "Correct";
			correct+=1;
		}
		if(choice4.equalsIgnoreCase(answer4)){
			status4 = "Correct";
			correct+=1;
		}
		if(choice5.equalsIgnoreCase(answer5)){
			status5 = "Correct";
			correct+=1;
		}
		if(choice6.equalsIgnoreCase(answer6)){
			status6 = "Correct";
			correct+=1;
		}
		if(choice7.equalsIgnoreCase(answer7)){
			status7 = "Correct";
			correct+=1;
		}
		if(choice8.equalsIgnoreCase(answer8)){
			status8 = "Correct";
			correct+=1;
		}
		if(choice9.equalsIgnoreCase(answer9)){
			status9 = "Correct";
			correct+=1;
		}
		if(choice10.equalsIgnoreCase(answer10)){
			status10 = "Correct";
			correct+=1;
		}
		
		score = correct*10;
		String remark = "Failed";
		if(score>50)
			remark = "Pass";
		String resultScore = score+"%";
				
		String fullname = student.getFirstName()+" "+student.getLastName();
		String idNumber = String.valueOf(student.getIdNumber());
		String courseNameAndCode = courseName+" | "+courseCode;
		SimpleDateFormat dt1 = new SimpleDateFormat("MMMM dd, yyyy");
		Date date = new Date();
		String testDate = dt1.format(date);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 588);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTestResult = new JLabel("Test Result");
		lblTestResult.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblTestResult.setBounds(155, 11, 164, 26);
		contentPane.add(lblTestResult);
		
		JLabel lblTestResultProgramme = new JLabel("Programme:");
		lblTestResultProgramme.setBounds(23, 48, 89, 14);
		contentPane.add(lblTestResultProgramme);
		
		JLabel lblTestProgramName = new JLabel(student.getProgrammeCode());
		lblTestProgramName.setBounds(105, 48, 122, 14);
		contentPane.add(lblTestProgramName);
		
		JLabel lblTestResultCourse = new JLabel("Course:");
		lblTestResultCourse.setBounds(23, 73, 74, 14);
		contentPane.add(lblTestResultCourse);
		
		JLabel lblTestResultDate = new JLabel("Date:");
		lblTestResultDate.setBounds(23, 98, 46, 14);
		contentPane.add(lblTestResultDate);
		
		JLabel lblTestStudentName = new JLabel("Student Name:");
		lblTestStudentName.setBounds(23, 123, 122, 19);
		contentPane.add(lblTestStudentName);
		
		JLabel lblStudentId = new JLabel("Student ID:");
		lblStudentId.setBounds(23, 142, 74, 14);
		contentPane.add(lblStudentId);
		
		JLabel lblNewLabel_1 = new JLabel("Choice");
		lblNewLabel_1.setBounds(23, 194, 62, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(175, 194, 46, 14);
		contentPane.add(lblAnswer);
		
		JLabel lblTestStatus = new JLabel("Status");
		lblTestStatus.setBounds(333, 194, 46, 14);
		contentPane.add(lblTestStatus);
		
		JLabel lblTestResultSocre = new JLabel(resultScore);
		lblTestResultSocre.setBounds(125, 480, 46, 14);
		contentPane.add(lblTestResultSocre);
		
		JButton btnBackToMenu = new JButton("Back To Menu");
		btnBackToMenu.setBounds(175, 505, 138, 23);
		contentPane.add(btnBackToMenu);
		
		
		JLabel lblChoiceone = new JLabel("1. "+choice1);
		lblChoiceone.setBounds(23, 219, 46, 14);
		contentPane.add(lblChoiceone);
		
		JLabel lblChoicetwo = new JLabel("2. "+choice2);
		lblChoicetwo.setBounds(23, 244, 46, 14);
		contentPane.add(lblChoicetwo);
		
		JLabel lblChoiceThree = new JLabel("3. "+choice3);
		lblChoiceThree.setBounds(23, 269, 46, 14);
		contentPane.add(lblChoiceThree);
		
		JLabel lblChoiceFour = new JLabel("4. "+choice4);
		lblChoiceFour.setBounds(23, 294, 46, 14);
		contentPane.add(lblChoiceFour);
		
		JLabel lblChoiceFive = new JLabel("5. "+choice5);
		lblChoiceFive.setBounds(23, 319, 46, 14);
		contentPane.add(lblChoiceFive);
		
		JLabel lblChoiceSix = new JLabel("6. "+choice6);
		lblChoiceSix.setBounds(23, 344, 46, 14);
		contentPane.add(lblChoiceSix);
		
		JLabel lblChoiceSeven = new JLabel("7. "+choice7);
		lblChoiceSeven.setBounds(23, 369, 46, 14);
		contentPane.add(lblChoiceSeven);
		
		JLabel lblChoiceEight = new JLabel("8. "+choice8);
		lblChoiceEight.setBounds(23, 394, 46, 14);
		contentPane.add(lblChoiceEight);
		
		JLabel lblChoiceNine = new JLabel("9. "+choice9);
		lblChoiceNine.setBounds(23, 419, 46, 14);
		contentPane.add(lblChoiceNine);
		
		JLabel lblChoiceTen = new JLabel("10. "+choice10);
		lblChoiceTen.setBounds(23, 444, 46, 14);
		contentPane.add(lblChoiceTen);
		
	
		JLabel lblAnswerOne = new JLabel(answer1);
		lblAnswerOne.setBounds(175, 219, 46, 14);
		contentPane.add(lblAnswerOne);
		
		
		JLabel lblAnswerTwo = new JLabel(answer2);
		lblAnswerTwo.setBounds(175, 244, 46, 14);
		contentPane.add(lblAnswerTwo);
		
	
		JLabel lblAnswerThree = new JLabel(answer3);
		lblAnswerThree.setBounds(175, 269, 46, 14);
		contentPane.add(lblAnswerThree);
		

		JLabel lblAnswerFour = new JLabel(answer4);
		lblAnswerFour.setBounds(175, 294, 46, 14);
		contentPane.add(lblAnswerFour);
		
		
		JLabel lblAnswerFive = new JLabel(answer5);
		lblAnswerFive.setBounds(175, 319, 46, 14);
		contentPane.add(lblAnswerFive);
		
		
		JLabel lblAnswerSix = new JLabel(answer6);
		lblAnswerSix.setBounds(175, 344, 46, 14);
		contentPane.add(lblAnswerSix);
		
		
		JLabel lblAnswerSeven = new JLabel(answer7);
		lblAnswerSeven.setBounds(175, 369, 46, 14);
		contentPane.add(lblAnswerSeven);
		
		
		JLabel lblAnswerEight = new JLabel(answer8);
		lblAnswerEight.setBounds(175, 394, 46, 14);
		contentPane.add(lblAnswerEight);
		
		
		JLabel lblAnswerNine = new JLabel(answer9);
		lblAnswerNine.setBounds(175, 419, 46, 14);
		contentPane.add(lblAnswerNine);
		
		
		JLabel lblAnswerTen = new JLabel(answer10);
		lblAnswerTen.setBounds(175, 444, 46, 14);
		contentPane.add(lblAnswerTen);
		
		JLabel lblStatusOne = new JLabel(status1);
		lblStatusOne.setBounds(333, 219, 70, 14);
		contentPane.add(lblStatusOne);
		
		JLabel lblStatusTwo = new JLabel(status2);
		lblStatusTwo.setBounds(333, 244, 70, 14);
		contentPane.add(lblStatusTwo);
		
		JLabel lblStatusThree = new JLabel(status3);
		lblStatusThree.setBounds(333, 269, 70, 14);
		contentPane.add(lblStatusThree);
		
		JLabel lblStatusFour = new JLabel(status4);
		lblStatusFour.setBounds(333, 294, 70, 14);
		contentPane.add(lblStatusFour);
		
		JLabel lblStatusFive = new JLabel(status5);
		lblStatusFive.setBounds(333, 319, 70, 14);
		contentPane.add(lblStatusFive);
		
		JLabel lblStatusSix = new JLabel(status6);
		lblStatusSix.setBounds(333, 344, 70, 14);
		contentPane.add(lblStatusSix);
		
		JLabel lblStatusSeven = new JLabel(status7);
		lblStatusSeven.setBounds(333, 369, 70, 14);
		contentPane.add(lblStatusSeven);
		
		JLabel lblStatusEight = new JLabel(status8);
		lblStatusEight.setBounds(333, 394, 70, 14);
		contentPane.add(lblStatusEight);
		
		JLabel lblStatusNine = new JLabel(status9);
		lblStatusNine.setBounds(333, 419, 70, 14);
		contentPane.add(lblStatusNine);
		
		JLabel lblStatusTen = new JLabel(status10);
		lblStatusTen.setBounds(333, 444, 70, 14);
		contentPane.add(lblStatusTen);
		
		JLabel lblTestCourseName = new JLabel(courseNameAndCode);
		lblTestCourseName.setBounds(104, 73, 304, 14);
		contentPane.add(lblTestCourseName);
		
		JLabel lblTestDate = new JLabel(testDate);
		lblTestDate.setBounds(99, 98, 294, 14);
		contentPane.add(lblTestDate);
		
		JLabel lblTestScore = new JLabel("Score:");
		lblTestScore.setBounds(81, 480, 46, 14);
		contentPane.add(lblTestScore);
		
		JLabel lblStudentname = new JLabel(fullname);
		lblStudentname.setBounds(125, 125, 268, 14);
		contentPane.add(lblStudentname);
		
		
		
		JLabel lblStudentID = new JLabel(idNumber);
		lblStudentID.setBounds(125, 142, 268, 14);
		contentPane.add(lblStudentID);
		
		JLabel lblRemarks = new JLabel("Remarks:");
		lblRemarks.setBounds(200, 480, 60, 14);
		contentPane.add(lblRemarks);
		
		JLabel lblRemarkValue = new JLabel(remark);
		lblRemarkValue.setBounds(273, 480, 106, 14);
		contentPane.add(lblRemarkValue);
		
		
		ActionListener backListener = new ActionListener(){
			
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent actionEvent) {		
				
				dispose();
				StudentMenu studentMenu = new StudentMenu();
				studentMenu.setVisible(true);
				

			 };
		};
		
		btnBackToMenu.addActionListener(backListener);
	}

}
