package cn.my.exercise.controller;

import cn.my.exercise.DAO.UserRepository;
import cn.my.exercise.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> find(){
        List<User> ages = userRepository.findByMe(20,"zhangpei");
        return ages;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Map<String,String>  create(@RequestBody User user){
        Map map = new HashMap();
        map.put("uri","/users/"+userRepository.save(user).getId());
        return map;
    }

}
