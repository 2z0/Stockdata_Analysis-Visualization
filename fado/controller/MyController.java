package com.fado.controller;

import com.fado.entitiy.CompanySiga;
import com.fado.entitiy.InvestarMove;
import com.fado.entitiy.Volume;
import com.fado.service.MoveService;
import com.fado.service.SigaService;
import com.fado.service.VolumeService;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

public class MyController {

    @Autowired
    SigaService sigaService;
    
    @Autowired
    private MoveService moveService;

    @Autowired
    private VolumeService volumeService;


    @RequestMapping("/movedata")
    @ResponseBody
    public String getInvestarMove() {

        List<InvestarMove> moveList= moveService.listAll();
        JsonArray jsonAgen = new JsonArray();
        JsonArray jsonFore = new JsonArray();

        JsonObject json = new JsonObject();
        moveList.forEach(move ->{
            jsonFore.add(move.getFore());
            jsonAgen.add(move.getAgen());
        });


        json.add("fore",jsonFore);
        json.add("agen",jsonAgen);
        return json.toString();
    }

    @RequestMapping("/move")
    public String viewMovePage(){
        return "move";
    }


    @RequestMapping("/down")
    public String viewDownPage(Model model){
        List<CompanySiga> sigaList = sigaService.getSiga(32956040111100L);
        List<CompanySiga> priceten = sigaService.getPrice(10000L, 1120725000000L);

        //List<CompanySiga> pricethree = sigaService.getPrice(30000L);
        //List<CompanySiga> sigaList = sigaService.listAll();
        List<Volume> volumeList = volumeService.listAll();

        model.addAttribute("sigaList",sigaList);
        model.addAttribute("priceten",priceten);
        //model.addAttribute("pricethree",pricethree);
        model.addAttribute("volumeList",volumeList);
        return "view_0603";
    }

    @RequestMapping("/downdata")
    @ResponseBody
    public String getVolume() {
        List<Volume> volumeList = volumeService.listAll();
        JsonArray jsonName = new JsonArray();
        JsonArray jsonvol = new JsonArray();

        JsonObject json = new JsonObject();
        volumeList.forEach(volume ->{
            jsonName.add(volume.getCompany());
            jsonvol.add(volume.getVolume());
        });


        json.add("name",jsonName);
        json.add("vol",jsonvol);
        return json.toString();
    }
    @RequestMapping("/downdatatwo")
    @ResponseBody
    public String getSigaTop() {
        List<CompanySiga> sigaList = sigaService.getSiga(32956040111100L);
        JsonArray jsonName = new JsonArray();
        JsonArray jsonsiga = new JsonArray();

        JsonObject json = new JsonObject();
        sigaList.forEach(volume ->{
            jsonName.add(volume.getCompany());
            jsonsiga.add(volume.getSiga());
        });

        json.add("name",jsonName);
        json.add("siga",jsonsiga);
        return json.toString();
    }
}
