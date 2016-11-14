
 
import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
@SuiteClasses(Bi_test.class)  
public class CalculatorTest {

	//private Calculator c = new Calculator();
		public WebDriver driver;
		public String username = "1402810636@qq.com"; 
		public String password = "llq123456";
		public String str;
		@Before
		public void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver",
					"D:\\chromedriver.exe");

//			System.out.println("打开浏览器");
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
		
		/*
		@Test
		public void enter(){
			System.out.print("1.测试登录登出"+"\n");
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
					 assertEquals("×"+"\n"+"邮箱或密码错误。", driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText());

					 System.out.print("提示："+driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText()+"\n");

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
					 assertEquals("×"+"\n"+"邮箱或密码错。", driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText());

					 System.out.print("提示："+driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText()+"\n");
					 
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
			

			 System.out.print("登录成功"+"\n");
			 driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a/i")).click();

				 //退出
			 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul/li[2]/a")).click();
			 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul/li[2]/ul/li[4]/a")).click();
			 try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			 driver.findElement(By.xpath("/html/body/div[7]/div/div[3]/div[2]")).click();
			 try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			 System.out.print(driver.findElement(By.xpath("/html/body/section/section/div")).getText());

			 assertEquals("×"+"\n"+ "退出成功.", driver.findElement(By.xpath("/html/body/section/section/div")).getText());
			 System.out.print("退出成功");
			 try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }  
		}
		
 		@Test
		public void add_ticket(){
		driver.findElement(By.id("user_email")).sendKeys(username);
			 driver.findElement(By.id("user_password")).sendKeys(password);
			 driver.findElement(By.name("commit")).click();
			 try {
					 Thread.sleep(15000);
					 } catch (InterruptedException e) {
					 e.printStackTrace();
					 }
			System.out.print("2.测试新建工单"+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	 
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/div/button")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("自动测试工单");

			WebElement client = driver.findElement(By.id("select2-chosen-2")); 
			client.click();
			driver.findElement(By.id("s2id_autogen2_search")).sendKeys("李");
			try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	
			List<WebElement> client_option=driver.findElements(By.id("select2-results-2")); 
//			System.out.println("测试1"+ client_option);
			for(WebElement element : client_option){
//				System.out.println("测试2"+ element.getText());
				if(element.getText().contains("李乾")){
//					System.out.println("测试3"+ element.getText());
					element.click();
					
					break;
				}
			}
			 
			WebElement status = driver.findElement(By.id("select2-chosen-4"));//点击状态
			status.click();
			driver.findElement(By.id("s2id_autogen4_search")).sendKeys("已关闭");
			List<WebElement> status_option=driver.findElements(By.id("select2-results-4"));//注释是选择那个状态
			for(WebElement element : status_option){
				if(element.getText().contains("已关闭")){
					element.click();
					
					break;
				}
			}
		 	try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	 
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/select")).click();//点击受理客服组
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/select/option[2]")).click();//选择默认组
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[3]/select")).click();//点击受理客服
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[3]/select/option[2]")).click();//选择Tom
			try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			//新建客户
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/i")).click();
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[3]/div/form/div[1]/div/input")).sendKeys("新建测试客户");
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[3]/div/form/div[11]/div/button[2]")).click();
//			try {
//				 Thread.sleep(2000);
//				 } catch (InterruptedException e) {
//				 e.printStackTrace();
//				 }	 
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[3]/button[2]")).click();
			try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/button")).click();
		    try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/nav/dl/dd/a[5]")).click();
		    try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[1]/a")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[1]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]/option[5]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/input")).sendKeys("自动测试工单");
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[2]")).click();
		    try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    assertEquals("自动测试工单",driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[3]")).getText());
			System.out.print("成功新建工单："+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[3]")).getText()+"\n"); 
			
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 } 
		} 
		@Test
		public void compile_ticket(){
		driver.findElement(By.id("user_email")).sendKeys(username);
			 driver.findElement(By.id("user_password")).sendKeys(password);
			 driver.findElement(By.name("commit")).click();
			 try {
					 Thread.sleep(15000);
					 } catch (InterruptedException e) {
					 e.printStackTrace();
					 }
			System.out.print("3.测试编辑工单"+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	 
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/nav/dl/dd/a[5]")).click();
		    try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[1]/a")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[1]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]/option[5]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/input")).sendKeys("自动测试工单");
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[2]")).click();
		    try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr")).click();//进入编辑页面
		    try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/div/a[1]")).click();//点击编辑按钮
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[2]/ul/li[2]/div[1]/div[1]/div/div[2]/iframe")).sendKeys("添加描述——啦啦啦啦拉拉");//输入描述
		    
		    try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/div/a[1]")).click();//点击保存按钮
		    try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    assertEquals("加描述——啦啦啦啦拉",driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[2]")).getText());
		    System.out.print("添加的描述："+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[2]")).getText()+"\n"); 

		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/iframe")).sendKeys("内部备注---备注备注");//输入描述
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div[2]/a")).click();//提交内部备注
		    try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    System.out.print("添加的内部备注："+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/p")).getText()+"\n"); 
		    //编辑级联字段
			   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/div/div/div/select[1]")).click(); 
			try {
				 Thread.sleep(1000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	
		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/div/div/div/select[1]/option[2]")).click(); 
		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/div/div/div/select[2]")).click(); 
			try {
				 Thread.sleep(1000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	
		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/div/div/div/select[2]/option[2]")).click(); 
		   try {
				 Thread.sleep(1000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	
		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[1]/span[3]/a")).click();//保存

		   
		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/a[1]")).click();//退出
		    

		    
		}
		@Test(expected = Exception.class)
		public void delete_ticket(){
		driver.findElement(By.id("user_email")).sendKeys(username);
			 driver.findElement(By.id("user_password")).sendKeys(password);
			 driver.findElement(By.name("commit")).click();
			 try {
					 Thread.sleep(15000);
					 } catch (InterruptedException e) {
					 e.printStackTrace();
					 }
			System.out.print("4.测试删除工单"+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }	 
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/nav/dl/dd/a[5]")).click();
		    try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[1]/a")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[1]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]/option[5]")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/input")).sendKeys("自动测试工单");
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[2]")).click();
		    try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[1]/input")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[1]/a[2]")).click();
		    try {
				 Thread.sleep(2000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[5]/div/div/div/form/div[3]/button[2]")).click();
		    try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 } 
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/button")).click();
		    try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 } 
		    assertEquals("自动测试工单",driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[3]")).getText());
			
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }  

		} 
		
		@Test
		public void sift_ticket(){
		driver.findElement(By.id("user_email")).sendKeys(username);
			 driver.findElement(By.id("user_password")).sendKeys(password);
			 driver.findElement(By.name("commit")).click();
			 try {
					 Thread.sleep(15000);
					 } catch (InterruptedException e) {
					 e.printStackTrace();
					 }
			System.out.print("5.测试工单优先级筛选 "+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
			try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/nav/dl/dd/a[5]")).click();
			try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[1]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]/option[3]")).click();;

			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[3]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[3]/option[2]")).click();;
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[2]")).click();
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 } 
			assertEquals("高",driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[5]")).getText());
			System.out.print("筛选的第一条工单的优先级是："+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[5]")).getText()+"\n"); 
			
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }  
			
		}
		
		@Test
		public void failure_ticket(){
		driver.findElement(By.id("user_email")).sendKeys(username);
		 driver.findElement(By.id("user_password")).sendKeys(password);
		 driver.findElement(By.name("commit")).click();
		try {
			 Thread.sleep(15000);
			 } catch (InterruptedException e) {
			 e.printStackTrace();
			 }
		System.out.print("5.测试工单导出"+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/ul/li[1]/input")).click();
			try {
				 Thread.sleep(3000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/div/div/a")).click();
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/div/div/div/div[1]/a[1]")).click();
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[4]/a")).click();
			try {
				 Thread.sleep(5000);
				 } catch (InterruptedException e) {
				 e.printStackTrace();
				 }
		}
		*/
		 
		
		
		@After
		public void test3(){
			driver.close();
			driver.quit();
		}
  public static void main( String[] args ) throws IOException {
	  
  }

}