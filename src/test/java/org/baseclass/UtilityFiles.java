package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityFiles {

	public static WebDriver driver;

	public static void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\sblue\\eclipse-workspace\\CucumberProject\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\sblue\\eclipse-workspace\\CucumberProject\\drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
	}

	public static void runUrl(String url) {
		driver.get(url);
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void windowFullscreen() {
		driver.manage().window().fullscreen();
	}

	public static void back() {
		driver.navigate().back();
	}

	public static void forward() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

	public static String getSingleWindow() {
		String window = driver.getWindowHandle();
		return window;
	}

	public static void getMultipleWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list = new LinkedList<String>(allWindows);
		for (int i = 0; i < list.size(); i++) {
			String windows = list.get(i);
			System.out.println(windows);
		}
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();
	}

	public static void sendKeys(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	public static void getTexts(List<WebElement> webElement) {
		for (WebElement data : webElement) {
			System.out.println(data.getText());
		}
	}

	public static void getTagname(WebElement element) {
		String tagName = element.getTagName();
		System.out.println(tagName);
	}

	public static void getAttribute(WebElement element, String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
	}

	public static void getLocation(WebElement element) {
		Point location = element.getLocation();
		System.out.println(location);
	}

	public static void getSize(WebElement element) {
		Dimension size = element.getSize();
		System.out.println(size);
	}

	public static void getCssValue(WebElement element, String name) {
		String cssValue = element.getCssValue(name);
		System.out.println(cssValue);
	}

	public static void isDisplayed(WebElement element) {
		element.isDisplayed();
	}

	public static void isEnabled(WebElement element) {
		element.isEnabled();
	}

	public static void isSelected(WebElement element) {
		element.isSelected();
	}

	public static void screenShot(String path) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(path);
		FileUtils.copyFile(srcFile, destFile);
	}

	public static void alert(String button) {
		if (button.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (button.equalsIgnoreCase("dismiss")) {
			driver.switchTo().alert().dismiss();
		}
	}

	public static void promptAlert(String value) {
		driver.switchTo().alert().sendKeys(value);
		driver.switchTo().alert().accept();
	}

	public static void switchFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void switchFrame(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchFrame(String name) {
		driver.switchTo().frame(name);
	}

	public static void actionClick(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
	}

	public static void moveToElement(WebElement element) {
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
	}

	public static void rightClick(WebElement element) {
		Actions a = new Actions(driver);
		a.contextClick(element).build().perform();
	}

	public static void doubleClick(WebElement element) {
		Actions a = new Actions(driver);
		a.doubleClick(element).build().perform();
	}

	public static void dragAndDrop(WebElement source, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).build().perform();
	}

	public static void selectByIndex(int index, WebElement element) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByValue(String attributeName, WebElement element) {
		Select s = new Select(element);
		s.selectByValue(attributeName);
	}

	public static void selectByText(String text, WebElement element) {
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public static void isMultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
	}

	public static void getOptions(int index, WebElement element) {
		Select s = new Select(element);
		List<WebElement> all_Options = s.getOptions();
		for (int i = 0; i < all_Options.size(); i++) {
			WebElement options = all_Options.get(index);
			String text = options.getText();
			System.out.println(text);
		}
	}

	public static void getSelectedOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> SelectedOptions = s.getAllSelectedOptions();
		for (WebElement allSelectedOptions : SelectedOptions) {
			String text = allSelectedOptions.getText();
			System.out.println(text);
		}
	}

	public static void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}

	public static void waits(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	public static void getParticularCellData(String path, int sheet, int row, int cell) throws IOException {

		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		Row r = s.getRow(row);
		Cell c = r.getCell(cell);
		int cellType = c.getCellType();
		if (cellType == 1) {
			String value = c.getStringCellValue();
			System.out.println(value);

		} else {
			double d = c.getNumericCellValue();
			int i = (int) d;
			String value = String.valueOf(i);
			System.out.println(value);
		}
	}

	public static void getParticularRowData(String excelPath, int sheet, int row) throws IOException {
		File f = new File(excelPath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		Row r = s.getRow(row);
		for (int i = 0; i < r.getPhysicalNumberOfCells(); i++) {
			Cell c = r.getCell(i);
			int cellType = c.getCellType();
			if (cellType == 1) {
				String value = c.getStringCellValue();
				System.out.println(value);
			} else {
				double d = c.getNumericCellValue();
				int a = (int) d;
				String value = String.valueOf(a);
				System.out.println(value);
			}
		}
	}

	public static void getParticularColumnData(String path, int sheet, int cell) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			Cell c = r.getCell(cell);
			int cellType = c.getCellType();
			if (cellType == 1) {
				String value = c.getStringCellValue();
				System.out.println(value);
			} else {
				double d = c.getNumericCellValue();
				int a = (int) d;
				String value = String.valueOf(a);
				System.out.println(value);
			}
		}
	}

	public static void getAllData(String path, int sheet) throws IOException {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(sheet);
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				Cell c = r.getCell(j);
				int cellType = c.getCellType();
				if (cellType == 1) {
					String value = c.getStringCellValue();
					System.out.println(value);
				} else {
					double d = c.getNumericCellValue();
					int a = (int) d;
					String value = String.valueOf(a);
					System.out.println(value);

				}

			}
		}
	}

	public static void createSheet(String sheetName, String fileName) throws IOException {
		File f = new File("C:\\Users\\sblue\\eclipse-workspace\\MavenInmakes\\TestData\\" + fileName + ".xlsx");
		Workbook w = new XSSFWorkbook();
		w.createSheet(sheetName);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

	public static void createRow(int row, int cell, String value, String sheetName, String fileName)
			throws IOException {
		File f = new File("C:\\Users\\sblue\\eclipse-workspace\\MavenInmakes\\TestData\\" + fileName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		w.getSheet(sheetName).createRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

	public static void createCell(int row, int cell, String value, String sheetName, String fileName)
			throws IOException {
		File f = new File("C:\\Users\\sblue\\eclipse-workspace\\MavenInmakes\\TestData\\" + fileName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		w.getSheet(sheetName).getRow(row).createCell(cell).setCellValue(value);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}

	public static void updateData(int row, int cell, String existingData, String value, String sheetName,
			String fileName) throws IOException {
		File f = new File("C:\\Users\\sblue\\eclipse-workspace\\MavenInmakes\\TestData\\" + fileName + ".xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fis);
		Sheet sheet = w.getSheet(sheetName);
		Row r = sheet.getRow(row);
		Cell c = r.getCell(cell);
		String str = c.getStringCellValue();
		if (str.equalsIgnoreCase(existingData)) {
			c.setCellValue(value);
		}
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
	}
}
