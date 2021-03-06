package com.revature.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.beans.Answers;
import com.revature.beans.Users;
import com.revature.services.AnswerService;

public class AnswersController {
	
	@RestController
	@RequestMapping(value="/answers")
	@CrossOrigin(origins="http://localhost:4200")
	public class QuestionController {
		
		@Autowired
		private AnswerService as;
		
		@GetMapping()
		public ResponseEntity<Set<Answers>> getAllAnswers() {
			return ResponseEntity.ok(as.getAllAnswers());
		}
		
		@GetMapping()
		public ResponseEntity<Set<Answers>> getAnswersByUser(Users u) {
			return ResponseEntity.ok(as.getAnswersByUser(u));
		}
		
		@PostMapping
		public ResponseEntity<Integer> addAnswers(@RequestBody Answers a) {
			return ResponseEntity.status(201).body(as.addAnswers(a));
		}
		
		
		@PutMapping(value="{answerId}")
		public ResponseEntity<Answers> updateAnswers(@PathVariable("answerId") Integer id, @RequestBody Answers a) {
	
			as.updateAnswers(a);
			return ResponseEntity.ok(as.getAnswersByUser(id));
		}
	}	
}
