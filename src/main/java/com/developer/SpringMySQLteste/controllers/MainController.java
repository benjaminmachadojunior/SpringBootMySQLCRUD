package com.developer.SpringMySQLteste.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.developer.SpringMySQLteste.models.AppUsers;
import com.developer.SpringMySQLteste.models.AppUsersRepo;

@Controller
public class MainController {

    @Autowired
    AppUsersRepo appRepo;

    @RequestMapping("/")
    public ModelAndView doHome() throws Exception{
        ModelAndView mv = new ModelAndView(Util.getDataConsulta());
        mv.addObject("lists",appRepo.findAll());
        return mv;
    }
    @RequestMapping( value = "/save", method = RequestMethod.POST)
    public ModelAndView doSave(@RequestParam("id") String id, @RequestParam("cpf") String cpf, @RequestParam("nome") String nome, @RequestParam("endereco") String endereco, @RequestParam("telefone") String telefone){
        ModelAndView mv = new ModelAndView("redirect:/");
        AppUsers users;
        if(!id.isEmpty()){
            users =(AppUsers)appRepo.findOne(Integer.parseInt(id));
        } else {
            users = new AppUsers();
        }
        users.setCpf(cpf);
        users.setNome(nome);
        users.setEndereco(endereco);
        users.setTelefone(telefone);
        appRepo.save(users);
        return mv;
    }

    @RequestMapping( value = "/view/{id}", method = RequestMethod.GET)
    public ModelAndView doView(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("view");
        mv.addObject("lists",appRepo.findOne(id));
        return mv;
    }

    @RequestMapping( value = "/delete/{id}", method = RequestMethod.GET)
    public ModelAndView doDelete(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("redirect:/");
        appRepo.delete(id);
        return mv;
    }

    @RequestMapping( value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView doEdit(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("edit");
        mv.addObject("lists",appRepo.findOne(id));
        return mv;
    }

}
