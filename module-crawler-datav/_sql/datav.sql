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
DROP TABLE IF EXISTS `datav_chart`;
CREATE TABLE `datav_chart` (
`id`  int NOT NULL AUTO_INCREMENT COMMENT '主键' ,
`code`  varchar(255) NULL COMMENT 'yyyy-MM编码' ,
`price`  decimal(10,2) NULL COMMENT '价格' ,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

ALTER TABLE `datav_chart`
ADD UNIQUE INDEX `uni_datav_chart_code` (`code`) USING BTREE ;
