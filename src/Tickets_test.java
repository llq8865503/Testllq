import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tickets_test {


	//private Calculator c = new Calculator();
		public WebDriver driver;
		public String username = "lilingqian@udesk.cn"; 
		public String password = "wll123456";
		public String str;
		@Before
		public void setUp() throws  InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"D:\\chromedriver.exe");

//			System.out.println("�������");
			driver = new ChromeDriver();
//			 driver.get("http://www.baidu.com");
			driver.navigate().to("http://rd-dota.udesk.cn/users/sign_in");
			driver.manage().window().maximize();
			
			
			
			 
				 Thread.sleep(2000);
				 
		}
		 
		@Test
		public void enter() throws InterruptedException{
			System.out.print("1.���Ե�¼�ǳ�"+"\n");
			for(int i=1;i<4;i++){
				if(i==1){
					username = ""; 
					password = "";
					driver.findElement(By.id("user_email")).sendKeys(username);
					 driver.findElement(By.id("user_password")).sendKeys(password);
					 driver.findElement(By.name("commit")).click();
					 
						 Thread.sleep(2000);
//					 assertEquals("��"+"\n"+"������������", driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText());

					 System.out.print("��ʾ��"+driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText()+"\n");

				}
				if(i==2){
					 driver.findElement(By.id("user_email")).sendKeys("111111111@qq.com");
					 driver.findElement(By.id("user_password")).sendKeys("11111111");
					 driver.findElement(By.name("commit")).click();
					 
						 Thread.sleep(2000);
						 
//					 assertEquals("��"+"\n"+"����������", driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText());

					 System.out.print("��ʾ��"+driver.findElement(By.xpath("/html/body/section[2]/section/section/section/section/section/section[1]/div")).getText()+"\n");
					 
				}
				if(i==3){
					WebElement email = driver.findElement((By.id("user_email")));
					email.clear();
					 username = "1402810636@qq.com"; 
					 password = "llq123456";
					 driver.findElement(By.id("user_email")).sendKeys(username);
					 driver.findElement(By.id("user_password")).sendKeys(password);
					 driver.findElement(By.name("commit")).click(); 
					 
					 Thread.sleep(15000);
					 
				}
			}
		}
		
		@Test
		public void add_ticket() throws InterruptedException{
		driver.findElement(By.id("user_email")).sendKeys(username);
			 driver.findElement(By.id("user_password")).sendKeys(password);
			 driver.findElement(By.name("commit")).click();
			 
					 Thread.sleep(15000);
					 
			System.out.print("2.�����½�����"+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
			 
				 Thread.sleep(5000);
				  
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/div/button")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[1]/div[1]/input")).sendKeys("�Զ����Թ���");

			WebElement client = driver.findElement(By.id("select2-chosen-2")); 
			client.click();
			driver.findElement(By.id("s2id_autogen2_search")).sendKeys("��");
			 
				 Thread.sleep(3000);
				  
			List<WebElement> client_option=driver.findElements(By.id("select2-results-2")); 
//			System.out.println("����1"+ client_option);
			for(WebElement element : client_option){
//				System.out.println("����2"+ element.getText());
				if(element.getText().contains("��Ǭ")){
//					System.out.println("����3"+ element.getText());
					element.click();
					break;
				}
			}
			 
			WebElement status = driver.findElement(By.id("select2-chosen-4"));//���״̬
			status.click();
			driver.findElement(By.id("s2id_autogen4_search")).sendKeys("�ѹر�");
			List<WebElement> status_option=driver.findElements(By.id("select2-results-4"));//ע����ѡ���Ǹ�״̬
			for(WebElement element : status_option){
				if(element.getText().contains("�ѹر�")){
					element.click();
					break;
				}
			}
			
			//�����ֶα�����
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[4]/div/div/div[1]/div/div/div[1]")).click();	
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[4]/div/div/div[1]/div/select[1]")).click();	
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[4]/div/div/div[1]/div/select[1]/option[2]")).click();
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[4]/div/div/div[1]/div/select[2]")).click();	
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[4]/div/div/div[1]/div/select[2]/option[2]")).click();
			
			
		 	 
				 Thread.sleep(2000);
				  
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/select")).click();//�������ͷ���
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[2]/select/option[2]")).click();//ѡ��Ĭ����
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[3]/select")).click();//�������ͷ�
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[3]/select/option[2]")).click();//ѡ��Tom
//			try {
//				 Thread.sleep(2000);
//				 } catch (InterruptedException e) {
//				 e.printStackTrace();
//				 }
			//�½��ͻ�
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/i")).click();
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[3]/div/form/div[1]/div/input")).sendKeys("�½����Կͻ�");
//			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[3]/div/form/div[11]/div/button[2]")).click();
//			try {
//				 Thread.sleep(2000);
//				 } catch (InterruptedException e) {
//				 e.printStackTrace();
//				 }	 
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div/div/div[3]/button[2]")).click();
			 
				 Thread.sleep(10000);
				 
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/button")).click();//ˢ�¹�����ť
		    
				 Thread.sleep(10000);
		    
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/a")).click();//ɸѡ��ť
		   
				 Thread.sleep(2000);
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/select")).click();
		   
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/select/option[2]")).click();//ѡ����
		    WebElement email = driver.findElement((By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/input")));
			email.clear();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/input")).sendKeys("�Զ����Թ���");//�������
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/a")).click();//�����ѯ
		     
				 Thread.sleep(2000);
				 
		    assertEquals("�Զ����Թ���",driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[3]/div/table/tbody/tr[1]/td[3]")).getText());
			System.out.print("�ɹ��½�������"+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[3]/div/table/tbody/tr[1]/td[3]")).getText()+"\n"); 
			
			 
				 Thread.sleep(5000);
				 
		} 
		@Test
		public void compile_ticket() throws InterruptedException{
		driver.findElement(By.id("user_email")).sendKeys(username);
			 driver.findElement(By.id("user_password")).sendKeys(password);
			 driver.findElement(By.name("commit")).click();
			 
					 Thread.sleep(15000);
				 
			System.out.print("3.���Ա༭����"+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
			 
				 Thread.sleep(5000);
				  
			  driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/a")).click();//ɸѡ��ť
			    
					 Thread.sleep(2000);
				 
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/select")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/select/option[2]")).click();//ѡ����
		    WebElement email = driver.findElement((By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/input")));
			email.clear();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/input")).sendKeys("�Զ����Թ���");//�������
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/a")).click();//�����ѯ
		     
				 Thread.sleep(10000);
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr")).click();//����༭ҳ��
		     
				 Thread.sleep(3000);
				  
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/div/a[1]")).click();//����༭��ť
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[2]/ul/li[2]/div[1]/div[1]/div/div[2]/iframe")).sendKeys("�����������������������");//��������
		    
		     
				 Thread.sleep(5000);
				  
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[1]/div/a[1]")).click();//������水ť
		    
				 Thread.sleep(5000);
				 
		    assertEquals("��������������������",driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[2]")).getText());
		    System.out.print("��ӵ�������"+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[1]/div/div/div[2]")).getText()+"\n"); 

		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/iframe")).sendKeys("�ڲ���ע---��ע��ע");//��������
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[2]/div[1]/div[2]/div[2]/div[2]/a")).click();//�ύ�ڲ���ע
		    
				 Thread.sleep(5000);
				 
		    System.out.print("��ӵ��ڲ���ע��"+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[3]/div/div[2]/div[2]/div[2]/div[1]/div/div/div[2]/p")).getText()+"\n"); 
		    //�༭�����ֶ�
//			   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/div/div/div/select[1]")).click(); 
//				 Thread.sleep(1000);
//		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/div/div/div/select[1]/option[2]")).click(); 
//		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/div/div/div/select[2]")).click(); 
//				 Thread.sleep(1000);
//		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[2]/form/div/div/div/div/div/select[2]/option[2]")).click(); 
//				 Thread.sleep(1000);
//		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[1]/div[2]/div/div[1]/div[1]/span[3]/a")).click();//����
		   driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/a[1]")).click();//�˳�
		    
		}
		 
		@Test(expected = Exception.class)
		public void delete_ticket() throws InterruptedException{
		driver.findElement(By.id("user_email")).sendKeys(username);
			 driver.findElement(By.id("user_password")).sendKeys(password);
			 driver.findElement(By.name("commit")).click();
					 Thread.sleep(15000);
			System.out.print("4.����ɾ������"+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
				 Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[1]/a")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/select")).click();
			   
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/select/option[2]")).click();//ѡ����
		    WebElement email = driver.findElement((By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/input")));
			email.clear();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[1]/div/div[1]/div/div/input")).sendKeys("�Զ����Թ���");//�������
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/a")).click();//�����ѯ
				 Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[1]/input")).click();
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[1]/a[2]")).click();
				 Thread.sleep(2000);
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[5]/div/div/div/form/div[3]/button[2]")).click();
				 Thread.sleep(5000);
		    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/button")).click();
				 Thread.sleep(5000);
		    assertEquals("�Զ����Թ���",driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[3]")).getText());
			
				 Thread.sleep(5000);

		} 
	 /*
		@Test
		public void sift_ticket(){
		driver.findElement(By.id("user_email")).sendKeys(username);
			 driver.findElement(By.id("user_password")).sendKeys(password);
			 driver.findElement(By.name("commit")).click();
					 Thread.sleep(15000);
			System.out.print("5.���Թ������ȼ�ɸѡ "+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
				 Thread.sleep(3000);
			 
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[1]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[1]/option[3]")).click();;

			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[3]")).click();
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[1]/div/div/select[3]/option[2]")).click();;
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/div/div/div[2]/a[2]")).click();
				 Thread.sleep(5000);
			assertEquals("��",driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[5]")).getText());
			System.out.print("ɸѡ�ĵ�һ�����������ȼ��ǣ�"+driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[3]/div/table/tbody/tr[1]/td[5]")).getText()+"\n"); 
			
				 Thread.sleep(5000);
			
		}
		 
		@Test
		public void failure_ticket(){
		driver.findElement(By.id("user_email")).sendKeys(username);
		 driver.findElement(By.id("user_password")).sendKeys(password);
		 driver.findElement(By.name("commit")).click();
			 Thread.sleep(15000);
		System.out.print("5.���Թ�������"+"\n");
			driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/ul/li[2]/a")).click();
				 Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[2]/div/div[2]/ul/li[1]/input")).click();
				 Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/div/div/a")).click();
				 Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/h3/div/div/div/div[1]/a[1]")).click();
				 Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[4]/div[2]/div/div/div[3]/div[1]/div[2]/table/tbody/tr[1]/td[4]/a")).click();
				 Thread.sleep(5000);
		}
		 */
		@After
		public void test3(){
			driver.close();
			driver.quit();
		}
}
