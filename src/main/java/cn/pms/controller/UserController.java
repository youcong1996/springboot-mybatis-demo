package cn.pms.controller;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.pms.model.TestVo;
import cn.pms.model.User;
import cn.pms.service.UserService;
 
@Controller
public class UserController {
 
    private Logger logger = Logger.getLogger(UserController.class);
 
    @Autowired
    private UserService userService;
 
    /*
     *  http://localhost:8080/getUserInfo
     */
 
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo() {
        User user = userService.getUserInfo();
        if(user!=null){
          
        }
        return user;
    }
    
    
  
    @RequestMapping("/test01")
    public String thymeleaf(ModelMap map){
        List<TestVo> testVos=new ArrayList<>();
        testVos.add(new TestVo("数学",10,new Date(),1));
        testVos.add(new TestVo("数学0001",70,new Date(),2));
        testVos.add(new TestVo("数学01",100,new Date(),3));
        map.put("test",testVos);
        return "index";
    }


}