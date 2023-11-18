package managers;
  
import org.openqa.selenium.WebDriver;

import Pages.ArrayPage;
import Pages.DataStructureDropdown;
import Pages.DatastructuresPage;
import Pages.GraphPage;
import Pages.Homepage;
import Pages.RegisterPage;
import Pages.SigninPage;
import Pages.StackPage;
import Pages.LinkedList;
import Pages.TreePage;
import Pages.QueuePage;
import Pages.TreePage;



public class PageObjectManager {
 
	private WebDriver driver;
  private Homepage homePage;
	private DataStructureDropdown dataStructureDropdown;
	private RegisterPage registerPage;
	private SigninPage signinPage;
  private LinkedList linkedList;
	private GraphPage graphPage;
  private TreePage treePage;
  private DatastructuresPage datastructurePage;
  private ArrayPage arrayPage;
  private StackPage stackPage;
  private QueuePage queuePage;

	
public PageObjectManager(WebDriver driver) {
 
		this.driver = driver;
	}
 
	
	public Homepage getHomePage(){

		return (homePage == null) ? homePage = new Homepage(driver) : homePage;
	}
 
	public DataStructureDropdown getDataStructureDropdown() {
		return (dataStructureDropdown == null) ? dataStructureDropdown = new DataStructureDropdown(driver) : dataStructureDropdown;
		
	}
    
	public RegisterPage getRegisterPage() {
		return (registerPage  == null) ? registerPage = new RegisterPage(driver) : registerPage;
		
	}
	public SigninPage signinPage() {
		return (signinPage  == null) ? signinPage = new SigninPage(driver) : signinPage;
		
	}

	public LinkedList getLinkedlist() {
		return (linkedList  == null) ? linkedList = new LinkedList(driver) : linkedList;
		
	}
	public GraphPage getGraphPage() {
		return (graphPage == null) ? graphPage = new GraphPage(driver) : graphPage;
	}
	
	public TreePage treePage() {
		return (treePage  == null) ? treePage = new TreePage(driver) : treePage;
		
	}
	
	public ArrayPage getArrayPage() {
		return(arrayPage == null)?  arrayPage = new ArrayPage(driver) : arrayPage;
	}
	
	public DatastructuresPage getdatastructurespage() {
		return(datastructurePage == null)?  datastructurePage = new DatastructuresPage(driver) : datastructurePage;
	}
	public StackPage stackPage() {
		return (stackPage  == null) ? stackPage = new StackPage(driver) : stackPage;
	}

	public QueuePage queuePage() {
		return (queuePage  == null) ? queuePage = new QueuePage(driver) : queuePage;
	}

}