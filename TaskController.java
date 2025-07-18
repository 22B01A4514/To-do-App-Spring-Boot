package com.app.todoApp.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.todoApp.model.Task;
import com.app.todoApp.service.TaskService;

@Controller
@RequestMapping("/tasks")
public class TaskController {
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	
	@PostMapping
	public String createTask(@RequestParam String title) {
		taskService.createTask(title);
		return "redirect:/tasks";
	}
	@GetMapping
	public String getTasks(Model model) {
		List<Task> tasks = taskService.getAlltasks();
		model.addAttribute("tasks",tasks);
		return "tasks";
	}
	
	@GetMapping("{id}/delete")
	public String deleteTask(@PathVariable Long id) {
		taskService.deleteTask(id);
		return "redirect:/tasks";
	}
	
	@GetMapping("{id}/toggle")
	public String toggleTask(@PathVariable Long id) {
		taskService.toggleTask(id);
		return "redirect:/tasks";
	}
}
