package com.gemini.task;

/**
 * @author Re-zero
 * @version 1.0
 * 【任务要求】：
 * 跟着视频，在你的项目中建三个包：controller, service, dao。
 * 将视频里的“获取员工数据”的案例，严格拆分到这三个包中对应的类里。
 * 关键动作：彻底消灭代码里的 new 关键字！给你的 Service 层打上 @Service，Dao 层打上 @Repository（交给 Spring 管理）。
 * 在 Controller 中声明 Service 对象，并在头上打上 @Autowired，让 Spring 自动帮你注入进来。
 * 启动项目，测试接口，感受“不 new 也能跑”的解耦快感。
 */
public class Task03_IOCDI {

}
