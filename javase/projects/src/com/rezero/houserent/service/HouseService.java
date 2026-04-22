package com.rezero.houserent.service;
import com.rezero.houserent.domain.House;

public class HouseService {
    private House[] houses;
    private int houseNums = 1;
    private int idCounter = 1;

    public HouseService(int size) {
        // 1. 初始化数组，大小由调用者决定 (比如10)
        houses = new House[size];

        // 2. 为了方便测试，我们初始化一个 House 对象放入数组
        // 注意：id, name, phone, address, rent, state
        houses[0] = new House(1, "Jack", "112",
                "海淀", 2000, "未出租");
    }

    public House[] list() {
        return houses;
    }

    public boolean add(House newHouse) {
        //1.判断是否还能添加
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能添加");
            return false;
        }
        //2.idCounter自增，然后赋给新房子的id
        newHouse.setId(++idCounter);
        //3.把房子放入数组
        houses[houseNums] = newHouse;
        //4.计数器增加
        houseNums++;
        return true;
    }

    public boolean del(int delId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                index = i;
                break;
            }
        }
        if(index == -1) {
            return false;
        }
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        houses[--houseNums] = null;
        return true;
    }

    public House findById(int findId) {
        for (int i = 0; i < houseNums; i++) {
            if (houses[i].getId() == findId) {
                return houses[i];
            }
        }
        return null;
    }
}

