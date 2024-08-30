import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.ProgressBar;
import swing2swt.layout.BoxLayout;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.custom.TableCursor;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class table {

	protected Shell shell;
	private Table table;
	private TableColumn tblclmnMi;
	private TableColumn tblclmnAge;
	private TableColumn tblclmnLocation;
	private TableColumn tblclmnBirthday;
	private TableColumn tblclmnYear;
	private TableCursor tableCursor;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());
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

	/**
	 * Create contents of the window.
	 * @wbp.parser.entryPoint
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(716, 398);
		shell.setText("SWT Application");
		shell.setLayout(new RowLayout(SWT.HORIZONTAL));
		
		table = new Table(shell, SWT.BORDER | SWT.FULL_SELECTION);
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		
		TableColumn tblclmnNewColumn = new TableColumn(table, SWT.NONE);
		tblclmnNewColumn.setWidth(100);
		tblclmnNewColumn.setText("Surname");		
		
		
		TableColumn tblclmnFirstAme = new TableColumn(table, SWT.NONE);
		tblclmnFirstAme.setWidth(100);
		tblclmnFirstAme.setText("First Name");
		
		tblclmnMi = new TableColumn(table, SWT.NONE);
		tblclmnMi.setWidth(100);
		tblclmnMi.setText("MI");
		tblclmnMi.getText();
		
		tblclmnAge = new TableColumn(table, SWT.NONE);
		tblclmnAge.setWidth(100);
		tblclmnAge.setText("Age");
		
		tblclmnLocation = new TableColumn(table, SWT.NONE);
		tblclmnLocation.setWidth(100);
		tblclmnLocation.setText("Location");
		
		tblclmnBirthday = new TableColumn(table, SWT.NONE);
		tblclmnBirthday.setWidth(100);
		tblclmnBirthday.setText("Birthday");
		
		tblclmnYear = new TableColumn(table, SWT.NONE);
		tblclmnYear.setWidth(100);
		tblclmnYear.setText("Year");
		
	}
}
