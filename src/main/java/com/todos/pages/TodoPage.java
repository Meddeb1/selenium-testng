package com.todos.pages;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.todos.utils.BasePage;

public class TodoPage extends BasePage {

	public TodoPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//input[@ng-model='newTodo']")
	public static WebElement inputText;
	
	@FindBy(how = How.XPATH, using = "/html/body/ng-view/section/section/ul/li/div/label")
	public static WebElement todoText;
	
	@FindBy(how = How.XPATH, using = "//input[@type='checkbox']")
	public static WebElement checkbox;
	
	
	public void submitTodo(String todo) {
		inputText.clear();
		inputText.sendKeys(todo);
		inputText.sendKeys(Keys.ENTER);
	}
	
	public Boolean isElementDisplayed(WebElement element) {
		
		Boolean isElementDisplayed = element.isDisplayed();
		return isElementDisplayed;
	}
	
	public String checkElementContain(WebElement element) {
		String elementTodo = element.getText();
		return elementTodo;
	}
	
	public boolean isCheckboxSelected(WebElement element) {
		Boolean isCheckboxSelected = element.isSelected();
		return isCheckboxSelected;
	}
	
	

}
