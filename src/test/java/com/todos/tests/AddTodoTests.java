package com.todos.tests;

import java.io.IOException;

import org.junit.Assert;
import org.testng.annotations.Test;

import com.todos.pages.TodoPage;
import com.todos.utils.Setup;

public class AddTodoTests extends Setup {

	public AddTodoTests() throws IOException {
		super();
	}
	
	TodoPage todoPage;
	
	@Test(priority = 1)
	public void iCanAddTodo() throws IOException {
		todoPage = new TodoPage();
		
		boolean todoField = todoPage.isElementDisplayed(TodoPage.inputText); 
		Assert.assertTrue(todoField);
		
		todoPage.submitTodo(prop.getProperty("todo1"));
		
		String elementTodo = todoPage.checkElementContain(TodoPage.todoText);
		Assert.assertTrue(elementTodo.contains(prop.getProperty("todo1")));
		
		boolean checkbox = todoPage.isCheckboxSelected(TodoPage.checkbox);
		Assert.assertFalse(checkbox);
		
	}
}
