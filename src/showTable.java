import java.util.*;
import javax.swing.*;
class showTable{
	public showTable(ArrayList<String>toInsert,ArrayList<String>keys) {
		//Set<String>keys=studentDB.keySet();
		ArrayList<String>category = new ArrayList<String>(Arrays.asList("Surname","First Name","MI","Age","Location","Birthday","Year Level"));
		String [][] tableData = new String [keys.size()][category.size()];
		
		for(String s:keys) {
			for(String c: category) {
				tableData[keys.indexOf(s)][category.indexOf(c)]=toInsert.get(category.indexOf(c));
			}
		}
	JTable jt = new JTable(tableData,category.toArray());
	  jt.setBounds(30,40,300,300);          
	    JScrollPane sp=new JScrollPane(jt);    
	    JFrame jf = new JFrame();
	    jf.add(sp);          
	    jf.setSize(400,600);    
	    jf.setVisible(true);    
	
	}
}