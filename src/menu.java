import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class menu {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args  
	 */
	public static void main(String[] args) {
		try {
			menu window = new menu();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	public void type(int type) {
		input i = new input();
		shell.dispose();
		i.open(type);
	}
	
	
	/**
	 * Create contents of the window.
	 */
	
	
	protected void createContents() {
		shell = new Shell();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		shell.setSize(450, 300);
		shell.setText("CRUD");
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				type(1);
			}
		});
		btnNewButton.setBounds(170, 35, 90, 30);
		btnNewButton.setText("Create");
		
		Button btnNewButton_1 = new Button(shell, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				type(2);
			}
		});
		btnNewButton_1.setBounds(170, 86, 90, 30);
		btnNewButton_1.setText("Read");
		
		Button btnUpdate = new Button(shell, SWT.NONE);
		btnUpdate.setBounds(170, 137, 90, 30);
		btnUpdate.setText("Update");
		
		btnUpdate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				type(3);
			}
		});
		
		Button btnDelete = new Button(shell, SWT.NONE);
		btnDelete.setBounds(170, 190, 90, 30);
		btnDelete.setText("Delete");
		
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				type(4);
			}
		});
		
		
		
	}
}
