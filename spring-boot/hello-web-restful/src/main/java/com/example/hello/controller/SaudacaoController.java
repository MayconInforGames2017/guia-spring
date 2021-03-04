package com.example.hello.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hello.model.Saudacao;

@RestController
public class SaudacaoController {

	private static final String template = "Hello, %s!";
	private final AtomicLong contador = new AtomicLong();

	@GetMapping("/saudacao")
	public Saudacao saudacao(@RequestParam(value = "name", defaultValue = "World") String name) {

		return new Saudacao(contador.incrementAndGet(), String.format(template, name));
		
	}

}
