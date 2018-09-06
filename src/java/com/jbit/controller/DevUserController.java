package com.jbit.controller;

import com.jbit.entity.AppCategory;
import com.jbit.entity.DataDictionary;
import com.jbit.entity.DevUser;
import com.jbit.service.AppCategoryService;
import com.jbit.service.DataDictionaryService;
import com.jbit.service.DevUserService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;


@RequestMapping("/dev")
@Controller
public class DevUserController {
    @Resource
    private DevUserService devUserService;
    @Resource
    private DataDictionaryService dataDictionaryService;
    @Resource
    private AppCategoryService appCategoryService;

    /**
     * 登录
     * @param devUser
     * @param model
     * @param session
     * @return
     */
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String  login(DevUser devUser, Model model, HttpSession session){
        DevUser user=devUserService.selectLogin(devUser);
        if(user!=null){
            session.setAttribute("devUserSession",user);
            return "redirect:/jsp/developer/main.jsp";
        }
        model.addAttribute("error","用户名或密码错误请重新登录");
        return "devlogin";
    }

    /**
     * 退出
     * @param session
     * @return
     */
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/index.jsp";
    }

    @RequestMapping(value = "/appinfolist")
    public String appinfolist(Model model){
        //app状态
        List<DataDictionary> statusList=dataDictionaryService.selectAPP_STATUS();
        model.addAttribute("statusList",statusList);
        //所属平台
        List<DataDictionary> flatFormList=dataDictionaryService.selectAPP_FLATFORM();
        model.addAttribute("flatFormList",flatFormList);
        //一级分类
        List<AppCategory> categoryLevel1List=appCategoryService.selectAppCategory1();
        model.addAttribute("categoryLevel1List",categoryLevel1List);
        return null;
    }

}
