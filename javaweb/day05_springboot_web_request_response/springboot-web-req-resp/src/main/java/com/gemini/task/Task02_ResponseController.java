package com.gemini.task;

import com.rezero.pojo.Result;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Re-zero
 * @version 1.0
 * 【任务背景】：无规矩不成方圆，后端返回给前端的数据必须是极其规律的 JSON。
 * 【具体要求】：
 * 创建一个通用的响应类 Result（视频里一定会给源码，
 * 一般包含三个属性：Integer code, String msg, Object data）。
 * 在 Result 类中提供几个静态快捷方法，比如 Result.success(data) 和 Result.error(msg)。
 * 创建一个 ResponseController，将你之前写的返回纯 String 的接口，全部改写为返回 Result 对象。
 * 用 Postman 测试，看是不是得到了类似 {"code":1, "msg":"success", "data":...} 这样极其规整的 JSON 结构。
 */
@RestController
public class Task02_ResponseController {
    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("无规矩不成方圆");
        return Result.success("后端返回给前端的数据必须是极其规律的 JSON。");
    }
}
