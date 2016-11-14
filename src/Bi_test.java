import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bi_test {


	//private Calculator c = new Calculator();
		public WebDriver driver;
		public String username = "1402810636@qq.com"; 
		public String password = "llq123456";
		public String str;
		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver",
					"D:\\chromedriver.exe");

//			System.out.println("´ò¿ªä¯ÀÀÆ÷");
			driver = new ChromeDriver();
//			 driver.get("http://www.baidu.com");
			driver.navigate().to("http://reocar.udeskt2.com/users/sign_in");
			driver.manage().window().maximize();
			
			
			
			 try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		}
		
	 
		@Test
		public void enter(){
			System.out.print("1.²âÊÔµÇÂ¼µÇ³ö"+"\n");
			for(int i=1;i<4;i++){
				if(i==1){
					username = ""; 
					password = "";
					driver.findElement(By.id("user_email")).sendKeys(username);
					 driver.findElement(By.id("user_password")).sendKeys(password);
					 driver.findElement(By.name("commit")).click();
					 try {
						 Thread.sleep(2000);
						 } catch (InterruptedException e) {
						 e.printStackTrace();
						 }
//					 assertEquals("¡Á"+"\n"+"ÓÊÏä»òÃÜÂë´íÎó¡£", driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText());

					 System.out.print("ÌáÊ¾£º"+driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText()+"\n");

				}
				if(i==2){
					 driver.findElement(By.id("user_email")).sendKeys("111111111@qq.com");
					 driver.findElement(By.id("user_password")).sendKeys("11111111");
					 driver.findElement(By.name("commit")).click();
					 try {
						 Thread.sleep(2000);
						 } catch (InterruptedException e) {
						 e.printStackTrace();
						 }
//					 assertEquals("¡Á"+"\n"+"ÓÊÏä»òÃÜÂë´í¡£", driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText());

					 System.out.print("ÌáÊ¾£º"+driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText()+"\n");
					 
				}
				if(i==3){
					WebElement email = driver.findElement((By.id("user_email")));
					email.clear();
					 username = "1402810636@qq.com"; 
					 password = "llq123456";
					 driver.findElement(By.id("user_email")).sendKeys(username);
					 driver.findElement(By.id("user_password")).sendKeys(password);
					 driver.findElement(By.name("commit")).click(); 
					 try {
					 Thread.sleep(15000);
					 } catch (InterruptedException e) {
					 e.printStackTrace();
					 }
				}
			}
		}
		@After
		public void test3(){
			driver.close();
			driver.quit();
		}
}
