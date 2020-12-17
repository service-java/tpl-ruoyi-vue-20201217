/*
Navicat MySQL Data Transfer

Source Server         : 47.114.160.96
Source Server Version : 50732
Source Host           : 47.114.160.96:3306
Source Database       : ry-vue

Target Server Type    : MYSQL
Target Server Version : 50732
File Encoding         : 65001

Date: 2020-12-11 16:12:00
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for demo_book
-- ----------------------------
DROP TABLE IF EXISTS `demo_book`;
CREATE TABLE `demo_book` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `name` varchar(255) NOT NULL COMMENT '图书名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of demo_book
-- ----------------------------
