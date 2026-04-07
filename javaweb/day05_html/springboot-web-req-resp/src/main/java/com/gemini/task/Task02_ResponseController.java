package com.gemini.task;

import com.rezero.pojo.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Re-zero
 * @version 1.0
 */
@RestController
public class Task02_ResponseController {
    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("无规矩不成方圆");
        return Result.success("后端返回给前端的数据必须是极其规律的 JSON。");
    }
}
