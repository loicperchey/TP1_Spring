package com.example.tp1_spring.controller;

import com.example.tp1_spring.entity.Todo;
import com.example.tp1_spring.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// le controleur pour les méthodes, préparer donc le request, le point d'entrée et autre
@Controller
@ResponseBody
@RequestMapping("/todo")
public class TodoController {

    @Autowired
    private TodoService todoService;
    //test de fonctionnement*/


    @GetMapping("")
    public List<Todo> getTodo(){
        return todoService.findAll();
    }

    @PostMapping("")
    public Todo postProduit(@RequestBody Todo todo){
        if(todoService.create(todo)) {
            return todo;
        }
        return null;
    }
    @GetMapping("/{id}")
    public Todo getTodo(@PathVariable("id") Integer id) {
        return todoService.findById(id);
    }

    @GetMapping("/gettodo")
    public Todo getProduitByParams(@RequestParam("id") Integer id){
        return todoService.findById(id);
    }


    @GetMapping("/delete/{id}")
    public String deleteTodo(@PathVariable("id") Integer id) {
        Todo p = todoService.findById(id);
        if(p != null && todoService.delete(p)){
            return "Suppression OK";
        }
        return "Aucun todo avec cette id";
    }

    @PostMapping("/update/{id}")
    public Todo updateTodo(@PathVariable("id") Integer id,@RequestBody Todo todo){
        Todo exisTodo = todoService.findById(id);
        if(exisTodo != null) {
            exisTodo.setTitre(todo.getTitre());
            exisTodo.setDescription(todo.getDescription());
            exisTodo.setDate(todo.getDate());
            if(todoService.update(exisTodo)) {
                return exisTodo;
            }
        }
        return exisTodo;
    }



}

