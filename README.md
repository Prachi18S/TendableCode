# Tendable
(https://www.tendable.com/)
## How to run the test
Firstly Import Project from Git into Eclipse.Below are the steps mentioned:
1. Launch eclipse IDE -> Click File> Import
2. In the Import Window, click Projects from Git (with smart import) and click Next.
3. In the Select Repository Source Window, click Existing local repository or Clone URI.
4. Step through the wizard and click Finish for the wizard to analyze the content for the project folder to find projects for import. 
5. Then import them into the IDE. The imported project will be listed in the Project Explorer view.

After importing project, test script is ready to execute in the following way:
1. Right click anywhere inside the class within the editor or the java class within the package explorer
2. Select “Run As” option and click on the “TestNG Test”.

TestNG result is displayed into two windows:
- Console Window
- TestNG Result Window

TestNG also generates HTML reports for the test executions. 
These reports can be viewed in any of the browsers and it can also be viewed using Eclipse’s build –in browser support.

## Strategy to employ Tendable challenge
1. Firstly, I created a testNG class.
2. Added @BeforeTest and @AfterTest methods
- In @BeforeTest method, creates a new instance of the Chrome driver to open the browser and it will be executed before the first test case. 
- In @AfterTest method, added close method to close the driver which will be executed after the last test case.
3. Then, I created a first test method and assigned priority to 1. This test method will open the URL in the chrome browser.
4. In second test method, inspect the elements and checked the accessibility of top-level menus: Home, Our Story, Our Solution, and Why Tendable?
5. In third test method, navigated to contact us section and choose "Marketing" and then submit the form excluding the "Message" field. On clicking submit button, verified the error message.
  
