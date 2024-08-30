import java.io.*;
import java.util.*;

import javax.swing.*;
class create{
	private final String fileName ="data.txt";
	
	public void create(String entry) {
		
		try {
			File f = new File(fileName);
			if(!f.exists()) {
				throw new IOException();
			}
			FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
			BufferedWriter bw = new BufferedWriter(fw);
			ArrayList<String> info = new ArrayList<String>(Arrays.asList(entry.split("\\+")));
			System.out.println(info.get(0));
			read r = new read();
			menu m = new menu();
			if(r.isExisting(info.get(0))) {
				JPanel panel = new JPanel();
				JOptionPane.showMessageDialog(panel, "Entry already existing. Try again", "Error", JOptionPane.ERROR_MESSAGE);
			}
			else {
				if(!isEntryPermissible(entry)) {
					JPanel panel = new JPanel();
					JOptionPane.showMessageDialog(panel, "Entry is not valid. Try again", "Error", JOptionPane.ERROR_MESSAGE);
					
				}
				else {
					bw.newLine();
					bw.write(entry);
					JOptionPane.showMessageDialog(null, "Entry successfully added!");
				}
			}
			bw.close();
			fw.close();
		} 
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	public boolean isEntryPermissible(String s) {
		if(s.split("\\+").length!=7) {
			return false;
		}
		return true;
	}
	
	
	public void writeToFile(HashMap<String,String>studentDB, String fileName) {
			try {
				File f = new File(fileName);
				if(!f.exists()) {
					throw new IOException();
				}
				FileWriter fw = new FileWriter(f.getAbsoluteFile(),false);
				BufferedWriter bw = new BufferedWriter(fw);
				Set<String>keys=studentDB.keySet();
				for(String s:keys) {
				bw.write(studentDB.get(s));
				bw.newLine();
				}
					
				bw.close();
				fw.close();
			} 
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
	}
}