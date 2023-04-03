package pageObjects;


import org.openqa.selenium.WebDriver;



public class PageObjectManager 
{
	 public GraphPage graphPage;
	public RegisterPage registerPage;
	public DataStructuresIntroductionPage dataStructuresIntroductionPage;
	public LinkedListPage linkedListPage;
	public StackPage stackPage;
	public QueuePage queuePage;
	public TreePage treePage;
	public ArrayPage arrayPage;
	public ArrayExamplesPage arrayexamplespage;
	public SignInPage signInPage;
	public WebDriver driver;
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
	}
	public GraphPage getGraphPage() {
		graphPage= new GraphPage(driver);
		return graphPage;
	}
	public RegisterPage getRegisterPage() {
		registerPage=new RegisterPage(driver);
		return registerPage;
	}
	public DataStructuresIntroductionPage getDSIntroPage() {
		dataStructuresIntroductionPage=new DataStructuresIntroductionPage(driver);
		return dataStructuresIntroductionPage;
	}
	public LinkedListPage getLinkedListPage() {
		linkedListPage=new LinkedListPage(driver);
		return linkedListPage;
	}
	public StackPage getStackPage() {
		stackPage=new StackPage(driver);
		return stackPage;
	}
	public QueuePage getQueuePage() {
		queuePage=new QueuePage(driver);
		return queuePage;
	}
	public SignInPage getSignInPage() {
		signInPage = new SignInPage(driver);
		return signInPage;
	}
	
	public TreePage getTreePage() {
		treePage = new TreePage(driver);
		return treePage;
	}
	
	public ArrayPage getArrayPage() {
		arrayPage = new ArrayPage(driver);
		return arrayPage;
	}
	public ArrayExamplesPage getArrayexamplePage() {
		arrayexamplespage = new ArrayExamplesPage(driver);
		return arrayexamplespage;
	}
	
}
