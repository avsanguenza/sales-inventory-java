import java.util.*;
import java.io.*;
import javax.swing.*;
class update{
	public update(String request) {
		read r= new read();
		create c= new create();
		JPanel panel = new JPanel();
		if(r.isExisting(request)) {	
			String toReplace = JOptionPane.showInputDialog(null, "Please input the update info.");
			if(c.isEntryPermissible(toReplace)) {
				HashMap<String,String>sDB=r.getDB();
				sDB.replace(request, toReplace);
				c.writeToFile(sDB,r.getFileName());
			}
			else {
				JOptionPane.showMessageDialog(panel,"The data you've entered is invalid. Try again", "Error",JOptionPane.ERROR_MESSAGE);
			}
		}
		else {
			JOptionPane.showMessageDialog(panel,"Entry does not exist try again.", "Error",JOptionPane.ERROR_MESSAGE);
		}
	}
	

}