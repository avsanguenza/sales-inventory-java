import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import javax.swing.*;

class read{
	public ArrayList<String>key= new ArrayList<String>();
	private ArrayList<String>curr = new ArrayList<String>();
	private HashMap<String, String>studentDB = new HashMap<String,String>();
	private String fileName="data.txt";
	private String sname="";
	private String fname="";
	private String mi="";
	private int age;
	private String location="";
	private String birthday;
	private String data="";
	private int  year;
	public read() {
		String line =null;
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader bf = new BufferedReader(fr);
			
		while((line = bf.readLine())!=null) {
			 ArrayList<String>infoAL = new ArrayList<String>(Arrays.asList(line.split("\\+")));
			 key.add(infoAL.get(0));
			 studentDB.put(infoAL.get(0), line);
		}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
	}
	public void read(String request) {
		if(isExisting(request)) {
			
			ArrayList<String> al = new ArrayList<String>(Arrays.asList(studentDB.get(request).split("\\+")));
			ArrayList<String>keys= new ArrayList<String>();
			keys.add(request);
			showTable st = new showTable(al,keys);
			
			
			/*	for(String s: al) {
				switch(al.indexOf(s)+1) {
				case 1: sname=s;break;
				case 2:fname=s; break;
				case 3: mi = s; break;
				case 4: age=Integer.parseInt(s); break;
				case 5: location=s; break;
				case 6: birthday=s;break;
				case 7: year = Integer.parseInt(s);break;
				}
			}*/
		}
		else {
			JPanel panel = new JPanel();
			JOptionPane.showMessageDialog(panel, "Entry does not exist. Try again", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public boolean isExisting(String q) {
		if(key.contains(q)) {
			return true;
		}
		return false;
	}
	
	public String getSName() {
		return sname;
	}
	public String getFName() {	
		return fname;
	}
	public String getMI() {
		return mi;
	}
	public int getAge() {
		return age;
	}
	public String location() {
		return location;
	}
	public String getBDay() {
		return birthday;
	}
	public int getYear() {
		return year;
	}
	public String getFileName() {
		return fileName;
	}
	
	public HashMap<String,String> getDB(){
		return studentDB;
	}
	
	public String getData(String key) {
		return studentDB.get(key);
	}
	
	public ArrayList<String>getKeys(){
		return key;
	}
}