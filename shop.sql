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

 Date: 18/06/2021 16:29:34
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

SET FOREIGN_KEY_CHECKS = 1;
