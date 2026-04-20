package com.gemini.springbootwebquickstart02.task;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Task01 {
}
/*
Task01: (P50-P57) Maven 环境排雷与配置
【高危预警】：无数新手在这一步被卡得痛不欲生，因为 Maven 默认去国外的服务器下载 .jar 包，速度只有几 KB/s，还会疯狂报错！

【必须执行的动作】：

看完视频后，绝对不要直接用 IDEA 默认的 Maven 设置！
找到你本地 Maven 安装目录下的 conf/settings.xml 文件。
配置本地仓库（<localRepository>）：找个空间大的盘（不要放 C 盘），建个文件夹专门存下载的 jar 包。
配置阿里云镜像（<mirror>）：跟 npm 配置淘宝源一样，必须把下载源换成阿里云（视频里一定会教，必须照做！）。
在 IDEA 的设置 (Ctrl + Alt + S -> Build, Execution, Deployment -> Build Tools -> Maven) 中，把你刚才修改的 settings.xml 路径和本地仓库路径覆盖进去。
 */
