

use august;


  -- 消费者

  create table customer
  (
    cust_id int primary key auto_increment, -- 消费者id
    user_id int, -- 需要与用户id关联
    cust_name varchar(20),  -- 姓名
    cust_sex enum('男','女') default '男', -- 性别
    cust_pwd varchar(20), -- 密码
    cust_tel varchar(20), -- 电话
    cust_birthdate datetime, -- 出生日期
    cust_address varchar(20), -- 地址
    cust_comment text -- 备注

  );

insert into customer(user_id, cust_name, cust_sex, cust_pwd, cust_tel, cust_birthdate, cust_address, cust_comment) values
(1,'成胜文','男','12345678','13794709305','1998-05-29','广东连平','是一个好相处、随和的人'),
(2,'周润发','男','88888888','13812345678','1968-08-16','大陆','是我心目中的偶像');

-- 订单表
create table aug_order
(
  order_id int primary key  auto_increment, -- 订单id
  delivery_id int, -- 需要跟交接单id关联
  order_type varchar(20), -- 订单类型
  cargo_name varchar(20), -- 货物名称
  cargo_weight double, -- 货物重量(按公斤)
  sender_name varchar(20), -- 邮寄人
  sender_address varchar(20), -- 邮寄地址
  delivery_address varchar(20), -- 配送地址
  order_state varchar(20), -- 订单状态
  sender_tel varchar(20),-- 邮寄人电话
  consignee varchar(10), -- 收货人
  consignee_tel varchar(20),-- 收货人电话
  start_city varchar(20), -- 起始城市
  midpoint_city varchar(20), -- 中点城市
  destination_city varchar(20), -- 终点城市
  transport_price decimal(18,0), -- 运送价格
  delivery_price decimal(18,0), -- 配送价格
  carriage_price decimal(18,0), -- 运输价格
  total_price decimal(18,0), -- 总价格
  vehicle varchar(20), -- 车辆
  order_comment text
);

insert into aug_order(delivery_id,order_type,cargo_name,cargo_weight,sender_name,sender_address,delivery_address,order_state,sender_tel,consignee,consignee_tel,start_city,midpoint_city,destination_city,transport_price,delivery_price,carriage_price,total_price,vehicle,order_comment)
values(1,'食品','辣条卫龙',19,'成胜文','广东珠海南方IT','香港南丫岛','运输中...','13794709305','周润发','13812345678','广东珠海','澳门','香港南丫岛',18.5,11.5,11,30,'商业船','周润发:好期待大陆的辣条,不知道有没有香港的好吃');

-- 车辆
create table vehicle
(
  vehicle_id int primary key  auto_increment,
  route_id int, -- 需要与路线关联
  vehicle_type varchar(20), -- 车辆型号
  yieldly varchar(20), -- 生产地
  production_date datetime, -- 生产日期
  buy_date datetime, -- 购买日期
  vehicle_comment text -- 备注
);

insert  into vehicle(route_id,vehicle_type,yieldly,production_date,buy_date,vehicle_comment) values
(1,'艇-8888-港澳','香港','2002-02-14','2013-04-24','速度很快,好评');

-- 省份

create table province
(
  province_id int primary key auto_increment,
  pei_province_id int, -- 需要跟配送表关联
  province_name varchar(20)
);

insert into province(pei_province_id,province_name) values
(1,'广东省'),
(2,'香港');


-- 城市
create table city
(
  city_id int primary key  auto_increment,
  province_id int, -- 需要跟省份表关联
  district_id int, -- 需要跟区域表关联
  pei_city_id int, -- 需要跟配送表关联
  city_name varchar(20) -- 城市名称
);

insert into city(province_id,district_id,pei_city_id,city_name) values
(1,1,1,'珠海'),
(2,2,2,'南丫岛');
-- 城市区域
create table district
(
  district_id int primary key  auto_increment,
  city_id int, -- 需要跟城市表关联
  district_name varchar(20)
);
insert into district(city_id, district_name) VALUES
(1,'斗门区'),
(2,'金湾区'),
(3,'香洲区');
-- 管理员
create table admin
(
  admin_id int primary key  auto_increment,
  user_id int, -- 需要跟用户表关联
  admin_name varchar(20), -- 管理员名字
  admin_sex enum('男','女'),
  admin_state varchar(20), -- 状态
  admin_city varchar(20), -- 所在城市
  admin_address varchar(20), -- 地址
  admin_pwd varchar(20), -- 密码
  admin_tel varchar(20), -- 联系电话
  commend text -- 备注
);
insert into admin(user_id,admin_name,admin_sex,admin_state,admin_city,admin_address,admin_pwd,admin_tel,commend)values
(1,'成胜文','男','在线','广东珠海','广东南方培训学院','123456','13794709305','欢迎登录管理员账号');

-- 交接单
create table delivery
(
  delivery_id int primary key  auto_increment,
  start_city varchar(20), -- 起始城市
  midpoint_city varchar(20), -- 中点城市
  destination_city varchar(20), -- 终点城市
  delivery_state varchar(20), -- 交接单状态
  rise_time datetime, -- 生成时间
  delivery_comment text -- 备注
);
insert into delivery(start_city, midpoint_city, destination_city, delivery_state, rise_time, delivery_comment) VALUES
('广州','深圳','香港','正常','2018-10-21','安全有保证');

-- 路线

create table route
(
  route_id int primary key  auto_increment,
  route_name varchar(20), -- 路线名称
  start_district_id int, -- 起始省份编号
  start_city_id int, -- 起始城市编号
  midpoint_district_id int, -- 中点省份编号
  midpoint_city_id int, -- 中点城市编号
  destination_district_id int, -- 终点省份编号
  destination_city_id int, -- 终点城市编号
  carriage_price decimal(18,0), -- 运输价格
  route_comment text
);
insert into route(route_name, start_district_id, start_city_id, midpoint_district_id, midpoint_city_id, destination_district_id, destination_city_id, carriage_price, route_comment) VALUES
('珠海大道',1,1,1,1,1,1,18.5,'GPS显示卡车一直在往广州方向移动...');

-- 配送点
create table peisongdian
(
  peisongdian_id int primary key  auto_increment,
  pei_province_id int, -- 需要跟省份表关联
  pei_city_id int, -- 需要跟城市表关联
  admin_id int, -- 需要跟管理员关联
  peisongdian_name varchar(20),-- 配送点名字
  peisongdian_tel varchar(20), -- 电话
  peisongdian_address varchar(20), -- 地址
  peisongdian_comment text -- 备注
);
insert into peisongdian( pei_province_id, pei_city_id, admin_id, peisongdian_name, peisongdian_tel, peisongdian_address, peisongdian_comment) values
(1,1,1,'周润发','13812345678','香港南Y岛','卫龙辣条很快就到了Y');

-- 配送范围
create table  deliverymethod
(
  del_id int primary key  auto_increment,
  del_name varchar(20), -- 配送区域名称
  peisong_price decimal(18,0), -- 配送价格
  del_city_id int, -- 所属城市ID
  peisong_comment text -- 备注
);
insert into deliverymethod(del_name, peisong_price, del_city_id, peisong_comment) VALUES
('斗门',18.5,1,'请耐心等待...');

-- 用户
create table userInfo
(
  user_id int primary key  auto_increment,
  user_name varchar(20), -- 用户名称
  user_comment text -- 备注
);
insert into userInfo(user_name, user_comment) VALUES
('成胜文他弟','欢迎您,尊敬的用户');

-- 配送点与配送范围的关系
select peisongdian.*,deliverymethod.* from  peisongdian  left join  deliverymethod
  on  peisongdian.pei_province_id = deliverymethod.del_id;

-- 配送点与省份、城市关系
select peisongdian.* , province.* from peisongdian  left join province
    on peisongdian.pei_province_id = province.province_id;

select peisongdian.*, city.*  from  peisongdian  left join city
    on peisongdian.pei_city_id = city.pei_city_id;


-- 路线与城市关系
select route.* ,city.* from  route left join city
    on route.route_id = city.city_id;

-- 订单与报表关系
select aug_order.*,delivery.* from aug_order left join delivery
    on aug_order.delivery_id = delivery.delivery_id;

-- 客户与订单关系
select customer.* ,aug_order.* from customer left join aug_order
    on customer.cust_id = aug_order.order_id;

--  存储过程设计

-- 1.用户信息存储过程
delimiter //
drop table if exists userInfo;
create procedure userInfo( inout name varchar(10),inout comment text)
  begin
      select * from userinfo; -- 查看用户信息
      insert into userinfo(user_name,user_comment) values(name,comment); -- 编辑用户信息
      select * from customer; -- 查询消费者信息

  end //
delimiter ;

-- 2.车辆存储过程
delimiter //
drop procedure if exists WLBus;
create procedure WLBus(inout routeId int,inout vehicleType varchar(20),inout yiel_dly varchar(20),inout productionDate datetime,inout buyDate DATETIME,inout vehicleComment varchar(20))
  begin
    insert into vehicle(route_id, vehicle_type, yieldly, production_date, buy_date, vehicle_comment) values(routeId,vehicleType,yiel_dly,productionDate,buyDate,vehicleComment); -- 添加车辆
    update vehicle set route_id =routeId and vehicle_type=vehicleType and yieldly=yiel_dly and production_date=productionDate and buy_date=buyDate and vehicle_comment=vehicleComment; -- 修改车辆
    select * from vehicle; -- 查看车辆信息
    delete from vehicle where route_id =routeId; -- 删除车辆
  end //
delimiter ;

-- 3.信息检验存储过程
delimiter //
drop procedure if exists WLCheckInfo;
create procedure WLCheckInfo(inout custpwd varchar(20),inout peiCityId varchar(20))
  begin
    select * from customer; -- 登录信息检验
    select * from customer where cust_pwd = custpwd; -- 密码检验
    update from customer set cust_pwd = custpwd; -- 修改密码
    select * from peisongdian where  pei_city_id = peiCityId; -- 配送区域检验
  end //
delimiter ;

-- 4.常用查询存储过程
delimiter //
drop procedure if exists WLCommonSearch;
create procedure WLCommonSearch(inout peiCityId int)
  begin
    select * from province; -- 获取所有省份
    select * from city ; -- 获取所有城市
    select * from admin ; -- 获取所有管理员
    select * from peisongdian; -- 获取所有配送点
    select * from peisongdian where pei_city_id = peiCityId; -- 获取所有配送区域
    select Max(total_price) from  aug_order;-- 获取最大价格
    select min(total_price) from aug_order; -- 获取最小价格
    select * from aug_order where delivery_price; -- 获取所有配送价格
    select * from route; -- 获取所有配送路线
    select * from vehicle; -- 获取所有车辆
    select * from delivery; -- 获取所有交接单
  end //
delimiter ;

-- 5.配送点存储过程
delimiter //
drop procedure if exists  WLDeliverPlace;
create procedure WLDeliverPlace(inout peiProvinceId int,inout peiCityId int,inout adminId int,inout peisongdianName varchar(20),inout peisongdianTel varchar(20),inout peisongdianAddress varchar(20),inout peisongdianComment text)
  begin
    select * from peisongdian; -- 查询配送点
    insert into peisongdian(pei_province_id,pei_city_id,admin_id,peisongdian_name,peisongdian_tel,peisongdian_address,peisongdian_comment) -- 添加配送点
    values(peiProvinceId,peiCityId,adminId,peisongdianName,peisongdianTel,peisongdianAddress,peisongdianComment); -- 添加配送点
    select * from peisongdian; -- 查看配送点信息
    update from peisongdian set  pei_province_id = peiProvinceId and pei_city_id = peiCityId and admin_id = adminId and peisongdian_name = peisongdianName and peisongdian_tel = peisongdianTel and peisongdian_address = peisongdianAddress
    and peisongdian_comment = peisongdianComment; -- 修改信息
    delete from set peisongdian_id; -- 删除配送点
  end //
delimiter ;

-- 6.配送价格存储过程
delimiter //
drop procedure if exists  WLDeliverPrice;
create procedure WLDeliverPrice(inout peisongPrice decimal)
  begin
    select peisong_price from deliverymethod where peisong_price = peisongPrice; -- 查看配送价格

  end //
delimiter ;

-- 7.配送范围存储过程
delimiter //
drop procedure if exists WLDeliverRange;
create procedure WLDeliverRange(inout delName varchar(20),inout peisongPrice decimal,inout delCityId int,inout peisongComment varchar(20))
  begin
    select del_city_id from deliverymethod where del_city_id =delCityId; -- 查询配送区域
    insert into deliverymethod(del_name,peisong_price,del_city_id,peisong_comment) values(delName,peiSongPrice,delCityId,peisongComment); -- 添加配送区域
    update from deliverymethod set del_name = delName and peisong_price = peisongPrice and del_city_id = delCityId and peisong_comment = peisongComment; -- 修改信息
    select * from deliverymethod; -- 查看信息
    delete from deliverymethod where del_city_id =delCityId; -- 删除配送区域
  end //
delimiter ;

-- 8.交接单存储过程
delimiter //
drop procedure if exists WLDelRe;
create procedure WLDelRe()
  begin
    select * from delivery;
  end //
delimiter ;

-- 9.订单存储过程
delimiter //
drop procedure if exists WLOrder;
create procedure  WLOrder()
  begin
    select * from aug_order;
  end //
delimiter ;

-- 10.报表存储过程
delimiter //
drop procedure if exists WLReport;
create procedure WLReport()
  begin

  end //
delimiter ;

-- 11.路线存储过程
delimiter //
drop procedure if exists WLRoute;
create procedure WLReport(inout routeNmae varchar(20),inout startDistrictId int,inout startCityId int,inout midpointDistrictId varchar(20), inout midpointCityId varchar(20),inout destinationDistrictId varchar(20),inout destinationCityId varchar(20),inout carriagePrice decimal,inout routeComment text)
  begin
      select * from route; -- 查询路线
      insert into route(route_name,start_district_id,start_city_id,midpoint_district_id,midpoint_city_id,destination_district_id,destination_city_id,carriage_price,route_comment)
      value(routeNmae,startDistrictId,startCityId,midpointDistrictId,midpointCityId,destinationDistrictId,destinationCityId,carriagePrice,routeComment); -- 添加路线
  end //
delimiter ;

-- 配送点管理员
delimiter //
drop procedure if exists  WLUserManage;
create procedure WLUserManage(inout userId int,inout adminName varchar(20),inout adminSex enum('男'), inout adminState varchar(20),inout adminCity varchar(20),inout adminAddress varchar(20),inout adminPwd varchar(20),inout adminTel varchar(20),inout commEnd text)
  begin
    select * from admin; -- 查看管理员
    delete from admin where admin_id;
    insert into admin(user_id,admin_name,admin_sex,admin_state,admin_city,admin_address,admin_pwd,admin_tel,commend)
    values(userId,adminName,adminSex,adminState,adminCity,adminAddress,adminPwd,adminTel,commEnd); -- 添加管理员
    select * from admin;
  end //
delimiter ;