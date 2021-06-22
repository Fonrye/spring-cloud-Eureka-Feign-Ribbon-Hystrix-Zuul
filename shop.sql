/*
 Navicat Premium Data Transfer

 Source Server         : fonrye
 Source Server Type    : MySQL
 Source Server Version : 50729
 Source Host           : localhost:3306
 Source Schema         : shop

 Target Server Type    : MySQL
 Target Server Version : 50729
 File Encoding         : 65001

 Date: 17/06/2021 21:36:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for discount_acitivity
-- ----------------------------
DROP TABLE IF EXISTS `discount_acitivity`;
CREATE TABLE `discount_acitivity`  (
  `activityId` int(11) NOT NULL AUTO_INCREMENT,
  `discount` float(255, 0) NULL DEFAULT NULL COMMENT '折扣',
  `activityContent` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '活动内容',
  `startTime` datetime(0) NULL DEFAULT NULL COMMENT '开始时间',
  `endTime` datetime(0) NULL DEFAULT NULL COMMENT '截止时间',
  `createTime` datetime(0) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `isDeleted` tinyint(1) NULL DEFAULT 0 COMMENT '逻辑删除标识',
  PRIMARY KEY (`activityId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品活动表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of discount_acitivity
-- ----------------------------
INSERT INTO `discount_acitivity` VALUES (1, 1, '滴滴答答啊啊啊啊啊啊啊啊', '2021-06-11 19:33:23', '2021-06-04 19:33:27', '2021-06-11 19:33:29', 0);

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goodsId` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '名称',
  `price` decimal(10, 2) NULL DEFAULT NULL COMMENT '价格',
  `describ` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `classify` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品分类',
  `imgPath` varchar(75) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片路径',
  `imgName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片名称',
  `createTime` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `idDeleted` tinyint(4) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`goodsId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 45 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '商品管理' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (30, '麦森耳机', 234.00, '千元最高性价比 万元音效', '周边电器', 'D:/shop/upload/2021/6/16/', '1623806518251324.png', '2021-06-17 17:02:08', 0);
INSERT INTO `goods` VALUES (31, '手势音响', 657.00, '很棒 演唱会效果', '周边商品', 'D:/shop/upload/2021/6/16/', '162380659314854.jpg', '2021-06-16 09:23:13', 0);
INSERT INTO `goods` VALUES (32, '大型打印机', 7562.00, '能支持8D打印 非常厉害', '家电', 'D:/shop/upload/2021/6/16/', '1623806635918432.png', '2021-06-16 09:23:55', 0);
INSERT INTO `goods` VALUES (33, '华为P80', 86523.00, '哈哈哈哈哈哈哈哈可以', '华为手机', 'D:/shop/upload/2021/6/16/', '16238067076371.jpg', '2021-06-16 09:25:07', 0);
INSERT INTO `goods` VALUES (34, '华为U90', 8722.00, '吼吼吼吼好', '华为手机', 'D:/shop/upload/2021/6/16/', '16238067337192.jpeg', '2021-06-16 09:25:33', 0);
INSERT INTO `goods` VALUES (35, '荣耀30', 1231.00, '啊啊啊厉害的', '华为手机', 'D:/shop/upload/2021/6/16/', '16238067663584.jpg', '2021-06-16 09:26:06', 0);
INSERT INTO `goods` VALUES (36, '热水壶', 321.00, '喝了成神仙', '家电', 'D:/shop/upload/2021/6/16/', '1623806842209ad.jpg', '2021-06-16 09:27:22', 0);
INSERT INTO `goods` VALUES (37, '保时捷荣耀版', 8542.00, '联名手机 限量发售', '华为手机', 'D:/shop/upload/2021/6/16/', '1623806946386OIP.jpg', '2021-06-16 09:29:06', 0);
INSERT INTO `goods` VALUES (38, '星耀60', 826.00, '不太好 适合打电话', '华为手机', 'D:/shop/upload/2021/6/16/', '1623806995018da.jpg', '2021-06-16 09:29:55', 0);
INSERT INTO `goods` VALUES (39, '全自动洗衣机', 89630.00, '人工智能 声控洗衣机', '家电', 'D:/shop/upload/2021/6/16/', '1623807060613aaa.jpg', '2021-06-16 09:31:00', 0);
INSERT INTO `goods` VALUES (40, '粉粉音响', 742.00, '很好很棒  音质堪比格莱美', '周边商品', 'D:/shop/upload/2021/6/16/', '162380710856844.jpg', '2021-06-16 09:31:48', 0);
INSERT INTO `goods` VALUES (43, '测试奥奥', 2131.00, '', '华为手机', 'D:/shop/upload/2021/6/17/', '1623920589525jus8.jpeg', '2021-06-17 21:05:41', 0);

-- ----------------------------
-- Table structure for goods_activity
-- ----------------------------
DROP TABLE IF EXISTS `goods_activity`;
CREATE TABLE `goods_activity`  (
  `gaId` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `activity_Id` int(11) NULL DEFAULT NULL COMMENT '活动id',
  `goodsId` int(11) NULL DEFAULT NULL COMMENT '商品id',
  `isDeleted` tinyint(4) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`gaId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '折扣活动-商品中间表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods_activity
-- ----------------------------
INSERT INTO `goods_activity` VALUES (1, 1, 1, 0);

-- ----------------------------
-- Table structure for order_goods
-- ----------------------------
DROP TABLE IF EXISTS `order_goods`;
CREATE TABLE `order_goods`  (
  `ogId` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `ogOrderId` int(11) NULL DEFAULT NULL COMMENT '订单id',
  `ogGoodsId` int(11) NULL DEFAULT NULL COMMENT '商品id',
  `goodPrice` decimal(10, 0) NULL DEFAULT NULL COMMENT '商品价格',
  `goodName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '商品名称',
  `isDeleted` tinyint(255) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`ogId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 65 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单-商品-中间表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of order_goods
-- ----------------------------
INSERT INTO `order_goods` VALUES (46, 93221438, 18, 2231, '小米手机', 0);
INSERT INTO `order_goods` VALUES (47, 93458846, 21, 97, '小米手机', 0);
INSERT INTO `order_goods` VALUES (48, 93605456, 18, 2231, '小米手机', 0);
INSERT INTO `order_goods` VALUES (50, 95440526, 18, 2231, '小米手机', 0);
INSERT INTO `order_goods` VALUES (52, 101506639, 21, 97, '小米手机', 0);
INSERT INTO `order_goods` VALUES (54, 101732324, 18, 2231, '小米手机', 0);
INSERT INTO `order_goods` VALUES (56, 101830364, 23, 66, '小米手机', 0);
INSERT INTO `order_goods` VALUES (58, 102032839, 23, 66, '小米手机', 0);
INSERT INTO `order_goods` VALUES (59, 191829976, 18, 2231, '烦人手机', 0);
INSERT INTO `order_goods` VALUES (60, 154542038, 42, 67653, '海后手机', 0);
INSERT INTO `order_goods` VALUES (61, 154542038, 35, 1231, '荣耀30', 0);
INSERT INTO `order_goods` VALUES (62, 194743859, 35, 1231, '荣耀30', 0);
INSERT INTO `order_goods` VALUES (63, 210257147, 35, 1231, '荣耀30', 0);
INSERT INTO `order_goods` VALUES (64, 210941176, 37, 8542, '保时捷荣耀版', 0);

-- ----------------------------
-- Table structure for shop_cat
-- ----------------------------
DROP TABLE IF EXISTS `shop_cat`;
CREATE TABLE `shop_cat`  (
  `shopCatId` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `uid` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `gId` int(11) NULL DEFAULT NULL COMMENT '商品id',
  `gnum` tinyint(4) NULL DEFAULT 1 COMMENT '商品数量',
  `createTime` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '创建时间',
  `isDeleted` tinyint(4) NULL DEFAULT 0 COMMENT '逻辑删除',
  PRIMARY KEY (`shopCatId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 77 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shop_cat
-- ----------------------------
INSERT INTO `shop_cat` VALUES (59, 1, 18, 3, '2021-06-14 09:54:40', 1);
INSERT INTO `shop_cat` VALUES (60, 1, 18, 1, '2021-06-14 09:32:21', 1);
INSERT INTO `shop_cat` VALUES (61, 1, 21, 1, '2021-06-14 09:34:58', 1);
INSERT INTO `shop_cat` VALUES (62, 1, 18, 1, '2021-06-14 09:36:05', 1);
INSERT INTO `shop_cat` VALUES (63, 1, 18, 4, '2021-06-14 10:17:32', 1);
INSERT INTO `shop_cat` VALUES (64, 1, 21, 1, '2021-06-14 10:15:06', 1);
INSERT INTO `shop_cat` VALUES (65, 1, 23, 4, '2021-06-14 10:18:30', 1);
INSERT INTO `shop_cat` VALUES (66, 1, 23, 3, '2021-06-14 10:20:32', 1);
INSERT INTO `shop_cat` VALUES (67, 1, 20, 1, '2021-06-17 15:45:38', 1);
INSERT INTO `shop_cat` VALUES (68, 1, 19, 1, '2021-06-17 15:45:38', 1);
INSERT INTO `shop_cat` VALUES (69, 1, 18, 2, '2021-06-15 19:18:30', 1);
INSERT INTO `shop_cat` VALUES (70, 1, 42, 1, '2021-06-17 15:45:42', 1);
INSERT INTO `shop_cat` VALUES (71, 1, 35, 1, '2021-06-17 15:45:42', 1);
INSERT INTO `shop_cat` VALUES (72, 1, 43, 1, '2021-06-17 21:09:36', 1);
INSERT INTO `shop_cat` VALUES (73, 1, 35, 1, '2021-06-17 19:47:43', 1);
INSERT INTO `shop_cat` VALUES (74, 1, 35, 1, '2021-06-17 21:02:57', 1);
INSERT INTO `shop_cat` VALUES (75, 1, 35, 1, '2021-06-17 21:09:23', 0);
INSERT INTO `shop_cat` VALUES (76, 1, 37, 5, '2021-06-17 21:09:41', 1);

-- ----------------------------
-- Table structure for shop_order
-- ----------------------------
DROP TABLE IF EXISTS `shop_order`;
CREATE TABLE `shop_order`  (
  `orderId` int(11) NOT NULL AUTO_INCREMENT,
  `fee` decimal(10, 0) NULL DEFAULT NULL COMMENT '总费用',
  `ouid` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `oState` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '已付款' COMMENT '订单状态(待支付，已付款，待发货，发货中，派送中，已接收)',
  `createTime` datetime(0) NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '下单时间',
  `isDeleted` tinyint(4) NULL DEFAULT 0 COMMENT '逻辑删除0存在,1删除',
  PRIMARY KEY (`orderId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 16 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '订单表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shop_order
-- ----------------------------
INSERT INTO `shop_order` VALUES (3, 0, 1, '已付款', '2021-06-14 09:32:21', 0);
INSERT INTO `shop_order` VALUES (4, 0, 1, '已付款', '2021-06-14 09:34:58', 0);
INSERT INTO `shop_order` VALUES (5, 0, 1, '已付款', '2021-06-14 09:36:05', 0);
INSERT INTO `shop_order` VALUES (6, 0, 1, '已付款', '2021-06-14 09:54:40', 0);
INSERT INTO `shop_order` VALUES (7, 0, 1, '已付款', '2021-06-14 10:15:06', 0);
INSERT INTO `shop_order` VALUES (8, 0, 1, '已付款', '2021-06-14 10:17:32', 0);
INSERT INTO `shop_order` VALUES (9, 0, 1, '已付款', '2021-06-14 10:18:30', 0);
INSERT INTO `shop_order` VALUES (10, 0, 1, '已付款', '2021-06-14 10:20:33', 0);
INSERT INTO `shop_order` VALUES (11, 0, 1, '已付款', '2021-06-15 19:18:30', 0);
INSERT INTO `shop_order` VALUES (12, 0, 1, '已付款', '2021-06-17 15:45:42', 0);
INSERT INTO `shop_order` VALUES (13, 0, 1, '已付款', '2021-06-17 19:47:43', 0);
INSERT INTO `shop_order` VALUES (14, 0, 1, '已付款', '2021-06-17 21:02:57', 0);
INSERT INTO `shop_order` VALUES (15, 0, 1, '已付款', '2021-06-17 21:09:41', 0);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `userId` int(30) NOT NULL AUTO_INCREMENT COMMENT '工号',
  `userName` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `password` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '密码',
  `nickName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '昵称',
  `role` tinyint(4) NULL DEFAULT NULL COMMENT '用户类别（1管理员 2普通角色）',
  `tele` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '手机号',
  `nationality` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '国籍',
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 11 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户管理' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, '1', '2', '方圆', 1, '122222', '中国');
INSERT INTO `sys_user` VALUES (2, '2', '2', '方圆', 2, '2222222', '中国');
INSERT INTO `sys_user` VALUES (4, '111', '', '芙蓉国', 1, '18888888888', '中国');
INSERT INTO `sys_user` VALUES (5, '33', '2', '仿佛', 1, '35435434434', '中国');
INSERT INTO `sys_user` VALUES (8, '201809601433', '7', '方圆哈哈', 1, '777777777', '中国');
INSERT INTO `sys_user` VALUES (9, '201809601433', '', '贾斯汀', 1, '22222222222', '中国');
INSERT INTO `sys_user` VALUES (10, '11122', '123', '等待', 1, '17666666666', '中国');

SET FOREIGN_KEY_CHECKS = 1;
