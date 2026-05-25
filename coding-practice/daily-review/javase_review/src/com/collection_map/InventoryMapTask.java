package com.collection_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Re-zero
 * @version 1.0
 * 任务要求：
 * 实例化一个合适的 Map<String, Integer> 对象，用于存储“耗材名称”和对应的“库存数量”。
 * 向集合中存入以下测试数据：
 * "高压灭菌锅滤纸" -> 120
 * "10ul移液器枪头" -> 45
 * "50ml离心管" -> 25
 * 编写遍历逻辑，逐一检查库存。如果某项耗材的库存数量 小于 50，请在控制台打印出警告信息。
 * 期望输出示例：⚠️ 预警：[10ul移液器枪头] 库存告急，当前仅剩 45 个！
 */
public class InventoryMapTask {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("高压灭菌锅滤纸", 120);
        map.put("10ul移液器枪头", 45);
        map.put("50ml离心管", 25);

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() < 50) {
                System.out.println(entry.getKey() + "库存告急，当前仅剩" + entry.getValue() + "个");
            } else {
                System.out.println(entry.getKey() + "库存数量 = " + entry.getValue());
            }
        }
    }
}
