import java.util.*;
import javax.swing.*;
class delete{
	public delete(String request) {
		JPanel panel= new JPanel();
		read r = new read();
		HashMap<String,String> studentDB = r.getDB();
		if(r.isExisting(request)) {
			studentDB.remove(request);
			create c = new create();
			c.writeToFile(studentDB,r.getFileName());
			JOptionPane.showMessageDialog(null, "Entry successfully deleted.");
		}
		else {
			JOptionPane.showMessageDialog(panel, "Entry doesn't exist.","Error",JOptionPane.ERROR_MESSAGE);
		}
	}
}