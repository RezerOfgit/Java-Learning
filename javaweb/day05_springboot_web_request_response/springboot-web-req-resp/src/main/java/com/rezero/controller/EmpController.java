package com.rezero.controller;

import com.rezero.pojo.Emp;
import com.rezero.pojo.Result;
import com.rezero.service.EmpService;
import com.rezero.service.impl.EmpServiceA;
import com.utils.XmlParserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Re-zero
 * @version 1.0
 */
@RestController
public class EmpController {

//    @Qualifier("empServiceA")
//    @Autowired //运行时,需要从IOC容器中获取该类型对象,赋值给该变量
//    private EmpService empService;

    @Resource(name = "empServiceB")
    private EmpService empService;

    @RequestMapping("/listEmp")//mounted(){axios.get('/listEmp').then(res=>{
    public Result list() {

        //1. 调用service, 获取数据
        List<Emp> empList = empService.listEmp();

        //2. 组装数据并返回
        return Result.success(empList);
    }

    /*@RequestMapping("/listEmp")//mounted(){axios.get('/listEmp').then(res=>{
    public Result list() {
        //1. 加载并解析emp.xml
        String file = this.getClass().getClassLoader().getResource("emp.xml").getFile();
        System.out.println(file);
        List<Emp> empList = XmlParserUtils.parse(file, Emp.class);

        //2. 对数据进行转换处理 - gender, job
        empList.stream().forEach(emp -> {
            //处理 gender 1: 男, 2: 女
            String gender = emp.getGender();
            if ("1".equals(gender)) {
                emp.setGender("男");
            } else if ("2".equals(gender)) {
                emp.setGender("女");
            }

            //处理job - 1: 讲师, 2: 班主任, 3: 就业指导
            String job = emp.getJob();
            if ("1".equals(job)) {
                emp.setJob("讲师");
            }else if ("2".equals(job)) {
                emp.setJob("班主任");
            }else if ("3".equals(job)) {
                emp.setJob("就业指导");
            }
        });

        //3. 响应数据
        return Result.success(empList);
    }*/
}
