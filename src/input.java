import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

public class input {

	protected Shell shell;
	private Text text;
	private Button button;
	private int commandType;
	private String fileName = "data.txt";

	/**
	 * Launch the application.
	 * @param args
	 */

	/**
	 * Open the window.
	 */
	public void open(int type) {
		commandType = type;
		Display display = Display.getDefault();
		createContents(commandType);
		shell.open();
		shell.setBackground(SWTResourceManager.getColor(SWT.COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT));
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents(int commandType) {
		shell = new Shell();
		shell.setSize(450, 300);
		switch(commandType) {
		case 1: shell.setText("Create");break;
		case 2:	shell.setText("Read");break;
		}
		
		text = new Text(shell, SWT.BORDER);
		text.setBounds(10, 99, 315, 26);
		
		Button btnNewButton = new Button(shell, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String entry = text.getText().toString();
				switch(commandType) {
				case 1: create c = new create(); c.create(entry); shell.setText(""); break;
				case 2: read r = new read(); r.read(entry);	break;
				case 3: update u = new update(entry); break;
				case 4: delete d = new delete(entry); break;
				}
			
			}
		});
		btnNewButton.setBounds(345, 95, 77, 30);
		btnNewButton.setText("Submit");
		
		button = new Button(shell, SWT.NONE);
		button.setBounds(10, 10, 90, 30);
		button.setText("< Back");
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				menu m = new menu();
				shell.dispose();
				m.open();
			}
		});
	}
}
