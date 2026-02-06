package com.rezero.houserent.view;

import com.rezero.houserent.domain.House;
import com.rezero.houserent.service.HouseService;
import com.rezero.houserent.utils.Utility;

/**
 * 定义属性：
 * private boolean loop = true; (控制显示主菜单的循环)
 * private char key = ' '; (接收用户输入的菜单选择)
 * 关键：private HouseService houseService = new HouseService(10);
 * (View 层要调用 Service 层，所以要实例化它，并给它 10 个空间)。
 */
public class HouseView {
    private boolean loop = true;
    private char key = ' ';
    private HouseService houseService = new HouseService(10);
    public void listHouses() {
        System.out.println("==========房屋列表==========");
        System.out.println("编号  房主      电话        地址            月租      状态");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null){
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("==========显示完毕==========");
    }
    public void mainMenu(){
        do{
            //1. 打印一堆菜单
            System.out.println("-----------------房屋出租系统-----------------");

            System.out.println("\t\t 1 新 增 房 源\n" +
                    "\t\t 2 查 找 房 屋\n" +
                    "\t\t 3 删 除 房 屋\n" +
                    "\t\t 4 修 改 房 屋 信 息\n" +
                    "\t\t 5 房 屋 列 表\n" +
                    "\t\t 6 退      出");
            System.out.println("请选择(1-6):");

            //2. 核心：使用工具类接收输入
            //key = Utility.readChar();
            // 使用这个方法，用户体验更丝滑
            key = Utility.readMenuSelection();

            //3. switch 分支判断
            switch (key){
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    System.out.println("退出");
                    loop = false;
                    break;
            }

        }while (loop);
    }
    public void addHouse(){
        System.out.println("==========添加房屋==========");
        System.out.println("姓名：");
        String name = Utility.readString(8);
        System.out.println("电话：");
        String phone = Utility.readString(12);
        System.out.println("地址：");
        String address = Utility.readString(16);
        System.out.println("月租：");
        int rent = Utility.readInt();
        System.out.println("状态：");
        String state = Utility.readString(3);

        House newHouse = new House(0, name, phone, address, rent, state);
        // 2. 调用 Service 的 add 方法，真正把数据存入数组
        boolean isSuccess = houseService.add(newHouse);
        // 3. 根据返回结果，给用户反馈
        if (isSuccess) {
            System.out.println("==========添加房屋成功==========");
        } else {
            System.out.println("==========添加房屋失败(数组已满)==========");
        }
    }
    public void delHouse(){
        System.out.println("==========删除房屋==========");
        System.out.println("请选择待删除房屋编号(-1退出)：");
        int choiceId = Utility.readInt();
        if(choiceId == -1){
            System.out.println("==========放弃删除==========");
            return;
        }

        House house = houseService.findById(choiceId);
        if (house == null){
            System.out.println("==========房屋编号不存在，删除失败==========");
            return;
        }

        System.out.println("确认是否删除(Y/N)：");
        char choice = Utility.readConfirmSelection();
        if(choice == 'N'){
            System.out.println("==========放弃删除==========");
            return;
        }

        if (houseService.del(choiceId)) {
            System.out.println("==========删除房屋成功==========");
        }else {
            System.out.println("==========删除失败==========");
        }
    }
    public void findHouse(){
        System.out.println("==========查找房屋==========");
        System.out.println("请输入所需查找的房子id：");
        int findId = Utility.readInt();

        House resultHouse = houseService.findById(findId);
        if(resultHouse != null){
            System.out.println(resultHouse);
        }else {
            System.out.println("==========查找房屋id不存在==========");
        }
    }
    public void updateHouse(){
        System.out.println("==========修改房屋==========");
        System.out.println("请输入所需查找的房子id：");
        int findId = Utility.readInt();

        House house = houseService.findById(findId);
        if(house == null){
            System.out.println("==========查找房屋id不存在==========");
            return;
        }
        System.out.println("姓名：(" + house.getName() + ")");
        String name = Utility.readString(8, house.getName());
        house.setName(name); // 这里的 setter 实际上完成了修改
        System.out.println("电话：(" + house.getPhone() + ")");
        String phone = Utility.readString(12, house.getPhone());
        house.setPhone(phone);
        System.out.println("地址：(" + house.getAddress() + ")");
        String address = Utility.readString(16, house.getAddress());
        house.setAddress(address);
        System.out.println("租金：(" + house.getRent() + ")");
        String rentInput = Utility.readString(12, Integer.toString(house.getRent()));
        if (rentInput == null || rentInput.trim().isEmpty()) {
            System.out.println("房租不能为空！");
            return;
        }
        try {
            int rent = Integer.parseInt(rentInput);
            if (rent < 0) {
                System.out.println("房租不能为负数！");
            } else {
                house.setRent(rent);
            }
        } catch (NumberFormatException e) {
            System.out.println("房租不是有效的整数！");
        }
        System.out.println("状态：(" + house.getState() + ")");
        String state = Utility.readString(3, house.getState());
        house.setState(state);
        System.out.println("==========修改房屋信息成功==========");
    }
}
