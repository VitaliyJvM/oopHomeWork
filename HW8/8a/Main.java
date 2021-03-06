package mvs;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws MyArrayFullException {

		Student studentOne = new Student("Mike", "Davidson", true, "", 0L, "01/09/2008", null, "");
		Student studentTwo = new Student("John", "Douwn", true, "17/07/1989", 0L, "01/09/2012", null, "G12");
		Student studentThree = new Student("Karla", "Volkova", false, "24/02/1973", 0L, "15/09/2014", null, "G12");
		Student studentFour = new Student("Alex", "Konovalov", true, "15/03/1991", 0L, "15/09/2014", null, "G12");

		Group groupOne = new Group("G12399");
		groupOne.addStudent(studentThree);
		groupOne.addStudent(studentTwo);
		groupOne.addStudent(studentOne);
		groupOne.addStudent(studentFour);

		String[] options = { "Edit group", "Read data", "Write data", "List groups", "New group", "Quit" };
		for (;;) {
			int x = JOptionPane.showOptionDialog(null, "Make your choice",
					"Main menu / group ID: " + groupOne.getGroupID(), JOptionPane.DEFAULT_OPTION,
					JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

			switch (x) {
			case 0:
				groupOne.groupMenu();
				continue;
			case 1:
				groupOne = Group.readGroup();
				continue;
			case 2:				
				groupOne.writeGroup();
				continue;
			case 3:
				groupOne.listGroups();
				continue;
			case 4:
				groupOne = new Group();
				continue;
			case 5:
				break;
			default:
				continue;
			}
			break;
		}
		System.out.println("Bye!");

	}

}
