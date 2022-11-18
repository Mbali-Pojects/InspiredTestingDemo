
public class ScreenshotUtil {
	
	public static String screenshotPath;
    public static String screenshotName;

    public static void captureScreenshot() throws IOException {

    
        TakesScreenshot screenshot = (TakesScreenshot)driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        Date date = new Date();
        screenshotName = date.toString().replace(":", "_").replace("_", "_");
        FileUtils.copyFile(source, new File(System.getProperty("user.dir") + "\\src\\test\\reports" +screenshotName+".jpg"));

}
