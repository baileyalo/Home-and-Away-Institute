package hai.customgui;

import hai.library.Code;
import hai.library.Course;

import javax.swing.JOptionPane;

public class TestGui {

	public static void main(String[] s) {

		{
			String code;
			int credits, prefix;
			String courseName, description, duration;
			CourseGui courseGui = new CourseGui("My First Custom Gui");

			code = JOptionPane.showInputDialog("Enter" + "Course Code");
			prefix = Integer.parseInt(JOptionPane.showInputDialog("Enter"
					+ "Course Prefix"));

			courseName = JOptionPane.showInputDialog("Enter" + "Course Name");
			credits = Integer.parseInt(JOptionPane.showInputDialog("Enter"
					+ "Course Credits"));

			duration = JOptionPane.showInputDialog("Enter" + "Course Duration");

			description = JOptionPane.showInputDialog("Enter"
					+ "Course Description");

			Course mat = new Course(new Code(code, prefix), courseName,
					description, credits, duration);
			JOptionPane.showMessageDialog(null, mat, "Course Details",
					JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
